package com.example.aazarjameeel.udacityreportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create an ArrayList of Report Card objects
        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("Jameel Ahmed","Grade A",2009));
        reportCards.add(new ReportCard("Salahudin","Grade A1",2009));
        reportCards.add(new ReportCard("Sehrish","Grade B",2010));
        reportCards.add(new ReportCard("Mehwish","Grade C",2010));
        reportCards.add(new ReportCard("Khalida","Grade A",2011));
        reportCards.add(new ReportCard("Gul Khan","Grade A",2009));
        reportCards.add(new ReportCard("Mr Ahmed","Grade A1",2009));
        reportCards.add(new ReportCard("Junaid","Grade B",2010));
        reportCards.add(new ReportCard("Saeed","Grade C",2010));
        reportCards.add(new ReportCard("M.Ali","Grade A",2011));
        reportCards.add(new ReportCard("Mr Khan","Grade A1",2009));
        reportCards.add(new ReportCard("Kareem","Grade B",2010));
        reportCards.add(new ReportCard("Fawad","Grade C",2010));
        reportCards.add(new ReportCard("Ali","Grade A",2011));

        ReportCardAdapter reportAdapter = new ReportCardAdapter(this, reportCards);

        // Get a reference to the ListView, and attach the adapter to the listView.
       ListView listView = (ListView) findViewById(R.id.listview_student);
       listView.setAdapter(reportAdapter);

     }

}

