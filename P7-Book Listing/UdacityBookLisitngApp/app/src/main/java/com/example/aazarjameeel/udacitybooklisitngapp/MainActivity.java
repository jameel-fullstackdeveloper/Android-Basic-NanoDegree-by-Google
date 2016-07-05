package com.example.aazarjameeel.udacitybooklisitngapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText searchText;
    TextView responseView;
    ProgressBar progressBar;
    static final String API_URL = "https://www.googleapis.com/books/v1/volumes?q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        responseView = (TextView) findViewById(R.id.responseView);
        searchText = (EditText) findViewById(R.id.text_search);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        Button queryButton = (Button) findViewById(R.id.queryButton);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new RetrieveFeedTask().execute();
            }
        });

    }

    private class RetrieveFeedTask extends AsyncTask<Void, Void, String> {


        private Exception exception;

        String searchInputText = searchText.getText().toString();

        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
            responseView.setText("");
        }

        protected String doInBackground(Void... urls) {

            try {
                URL url = new URL(API_URL  + searchInputText);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line).append("\n");
                    }
                    bufferedReader.close();
                    return stringBuilder.toString();
                }
                finally{
                    urlConnection.disconnect();
                }
            }
            catch(Exception e) {
                Log.e("ERROR", e.getMessage(), e);
                return null;
            }
        }

        protected void onPostExecute(String response) {
            if(response == null) {
                response = "THERE WAS AN ERROR";
            }
            progressBar.setVisibility(View.GONE);
            //Log.i("INFO", response);
            String strJson=response;
            String data = "";

            ArrayList<Book> bookList = new ArrayList<Book>();

            try {
                JSONObject  jsonRootObject = new JSONObject(strJson);

                //Get the instance of JSONArray that contains JSONObjects
                JSONArray jsonArray = jsonRootObject.optJSONArray("items");

                //Iterate the jsonArray and print the info of JSONObjects
                for(int i=0; i < jsonArray.length(); i++){

                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    JSONObject volumeInfo = jsonObject.getJSONObject("volumeInfo");
                    String title = volumeInfo.getString("title");

                    JSONArray authors = volumeInfo.getJSONArray("authors");
                    String author = authors.getString(0);

                    bookList.add(new Book(title," Author:  " + author));

                }

                /*show the data to list view after binding to adapter*/
                BookAdapter itemsAdapter =  new BookAdapter(MainActivity.this,bookList);
                ListView listView = (ListView) findViewById(R.id.list_books);
                listView.setAdapter(itemsAdapter);


            } catch (JSONException e) {e.printStackTrace();}


        }
    }

}
