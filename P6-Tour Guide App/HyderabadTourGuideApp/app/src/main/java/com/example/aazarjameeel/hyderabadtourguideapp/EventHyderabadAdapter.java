package com.example.aazarjameeel.hyderabadtourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aazarjameeel on 01-Jul-16.
 */
public class EventHyderabadAdapter extends ArrayAdapter<EventHyderabad> {


    public EventHyderabadAdapter(Activity context, ArrayList<EventHyderabad> eventsHyderabad) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, eventsHyderabad);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        EventHyderabad currentEventHyderabad = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView eventNameTextView = (TextView) listItemView.findViewById(R.id.text_evenName);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        eventNameTextView.setText(currentEventHyderabad.getmEventName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView eventDateTextView = (TextView) listItemView.findViewById(R.id.text_eventDate);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        eventDateTextView.setText(currentEventHyderabad.getmEventDate());

        // Find the ImageView in the list_item.xml layout with the ID image.
         ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current Event
         imageView.setImageResource(currentEventHyderabad.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView eventDescriptionView = (TextView) listItemView.findViewById(R.id.text_eventDescriptoion);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        eventDescriptionView.setText(currentEventHyderabad.getmEventDescription());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
