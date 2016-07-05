package com.example.aazarjameeel.hyderabadtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        // Create a list of words
       ArrayList<EventHyderabad> hydevents = new ArrayList<EventHyderabad>();

        hydevents.add(new EventHyderabad("T-Shirt Sales","Friday, 17 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.event1));
        hydevents.add(new EventHyderabad("Test Event 2","Saturday, 18 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.event2));
        hydevents.add(new EventHyderabad("Test Event 3","Sunday, 19 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.event3));
        hydevents.add(new EventHyderabad("Test Event 4","Monday, 20 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.event4));
        hydevents.add(new EventHyderabad("Test Event 5","Tuesday, 21 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.defaultimage));
        hydevents.add(new EventHyderabad("Test Event 6","Wednesday, 22 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.defaultimage));
        hydevents.add(new EventHyderabad("Test Event 7","Thursday, 23 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.defaultimage));
        hydevents.add(new EventHyderabad("Test Event 8","Friday, 24 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.defaultimage));
        hydevents.add(new EventHyderabad("Test Event 9","Saturday, 25 June, 2016","Lorem Ipsum is simply dummy text of the printing and typesetting industry.",R.drawable.defaultimage));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
         // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter
        EventHyderabadAdapter itemsAdapter =  new EventHyderabadAdapter(this,hydevents);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
