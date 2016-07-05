package com.example.aazarjameeel.newsapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static final String API_URL = "http://content.guardianapis.com/search?show-fields=thumbnail&q=sports&api-key=test";

    private static final String KEY_RESPONSE = "response";
    private static final String KEY_RESULTS = "results";
    private static final String KEY_WEB_TITLE = "webTitle";
    private static final String KEY_WEB_URL = "webUrl";
    private static final String KEY_FIELDS = "fields";
    private static final String KEY_THUMBNAIL = "thumbnail";

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        new RetrieveFeedTask().execute();
    }

    private class RetrieveFeedTask extends AsyncTask<Void, Void, String> {


        private Exception exception;


        protected void onPreExecute() {
           progressBar.setVisibility(View.VISIBLE);
        }

        protected String doInBackground(Void... urls) {

            try {
                URL url = new URL(API_URL );
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
            Log.i("INFO", response);
            String strJson=response;
            String data = "";

            final ArrayList<News> newsList = new ArrayList<News>();



            try{
            JSONObject baseJsonResponse = new JSONObject(response);
            JSONObject myresponse = baseJsonResponse.getJSONObject(KEY_RESPONSE);
            JSONArray jsonStories = myresponse.getJSONArray(KEY_RESULTS);
            for (int i = 0; i < jsonStories.length(); i++) {
                JSONObject jsonStory = jsonStories.getJSONObject(i);
                String title = jsonStory.getString(KEY_WEB_TITLE);
                String url = jsonStory.getString(KEY_WEB_URL);
                JSONObject fields = jsonStory.getJSONObject(KEY_FIELDS);
                String thumbnail = fields.getString(KEY_THUMBNAIL);

                newsList.add(new News(thumbnail,title,url));

            }
                /*show the data to list view after binding to adapter*/
                NewsAdabter itemsAdapter =  new NewsAdabter(MainActivity.this,newsList);
                ListView listView = (ListView) findViewById(R.id.list_books);
                listView.setAdapter(itemsAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                     @Override
                     public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                         News nw = newsList.get(position);
                         Intent intent = new Intent(Intent.ACTION_VIEW, nw.getWebUrl());
                         startActivity(intent);
                     }
                 });



            } catch (JSONException e) {e.printStackTrace();}


        }
    }

}
