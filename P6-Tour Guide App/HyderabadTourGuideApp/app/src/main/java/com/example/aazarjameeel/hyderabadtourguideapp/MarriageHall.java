package com.example.aazarjameeel.hyderabadtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MarriageHall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_hall);

        ArrayList<MarriageHallHyderabad> hydhalls = new ArrayList<MarriageHallHyderabad>();

        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 1","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 2","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300453569"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 3","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300568622"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 4","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","034535f417"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 5","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03053569417"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 6","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03215369917"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 7","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569415"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 8","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 9","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hal 10","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453568917"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 11","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453585419"));
        hydhalls.add(new MarriageHallHyderabad("Marriage Hall 12","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter
        MarriageHallHyderabadAdapter itemsAdapter =  new MarriageHallHyderabadAdapter(this,hydhalls);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
