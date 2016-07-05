package com.example.aazarjameeel.hyderabadtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class School extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        ArrayList<SchoolHyderabad> hydschools = new ArrayList<SchoolHyderabad>();

        hydschools.add(new SchoolHyderabad("School 1","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydschools.add(new SchoolHyderabad("School 2","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300453569"));
        hydschools.add(new SchoolHyderabad("School 3","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300568622"));
        hydschools.add(new SchoolHyderabad("School 4","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","034535f417"));
        hydschools.add(new SchoolHyderabad("School 5","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03053569417"));
        hydschools.add(new SchoolHyderabad("School 6","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03215369917"));
        hydschools.add(new SchoolHyderabad("School 7","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569415"));
        hydschools.add(new SchoolHyderabad("School 8","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydschools.add(new SchoolHyderabad("School 9","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydschools.add(new SchoolHyderabad("School 10","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453568917"));
        hydschools.add(new SchoolHyderabad("School 11","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453585419"));
        hydschools.add(new SchoolHyderabad("School 12","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter
        SchoolHyderabadAdapter itemsAdapter =  new SchoolHyderabadAdapter(this,hydschools);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
