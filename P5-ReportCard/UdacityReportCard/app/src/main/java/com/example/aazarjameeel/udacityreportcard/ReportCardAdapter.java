package com.example.aazarjameeel.udacityreportcard;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by aazarjameeel on 30-Jun-16.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard>{

    private static final String LOG_TAG = ReportCardAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param reportCard     A List of ReportCard objects to display in a list
     */
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> reportCard) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, reportCard);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        ReportCard currentReportCard = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.student_name);
        // Get the version name from the current ReportCard object and
        // set this text on the name TextView
        nameTextView.setText(String.valueOf(currentReportCard.getStudentName()));

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.student_grade);
        // Get the version number from the current ReportCard object and
        // set this text on the number TextView
        gradeTextView.setText(String.valueOf(currentReportCard.getStudentGrade()));

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView yearTextView = (TextView) listItemView.findViewById(R.id.student_year);
        // Get the version number from the current ReportCard object and
        // set this text on the number TextView
        yearTextView.setText(String.valueOf(currentReportCard.getStudentYear()));




        // so that it can be shown in the ListView
        return listItemView;
    }

}
