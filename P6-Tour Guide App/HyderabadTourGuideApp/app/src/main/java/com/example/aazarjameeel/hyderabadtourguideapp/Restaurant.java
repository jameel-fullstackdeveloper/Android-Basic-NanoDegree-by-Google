package com.example.aazarjameeel.hyderabadtourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ArrayList<RestaurantHyderabad> hydrestaurants = new ArrayList<RestaurantHyderabad>();

        hydrestaurants.add(new RestaurantHyderabad("Restaurant 1","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 2","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300453569"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 3","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","0300568622"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 4","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","034535f417"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 5","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03053569417"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 6","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03215369917"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 7","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569415"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 8","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 9","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 10","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453568917"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 11","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453585419"));
        hydrestaurants.add(new RestaurantHyderabad("Restaurant 12","Lorem Ipsum is simply dummy text of the printing and typesetting industry.","03453569417"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter
        RestaurantHyderabadAdapter itemsAdapter =  new RestaurantHyderabadAdapter(this,hydrestaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
