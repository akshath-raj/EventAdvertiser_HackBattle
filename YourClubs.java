package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class YourClubs extends AppCompatActivity {
    private ListView rgsclubListView, newrgsclubsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_clubs);

        rgsclubListView=(ListView) findViewById(R.id.rgsdclubsListView);
        newrgsclubsListView=(ListView) findViewById(R.id.newrgsListView);

        List<String> rgs = new ArrayList<String>();
        rgs.add("IEEE club");
        rgs.add("Google Developers Student club");
        rgs.add("Photography club");

        List<String> newrgs = new ArrayList<String>();
        newrgs.add("Sports club");
        newrgs.add("Community radio club");
        newrgs.add("VIT film society");
        newrgs.add("Debate society");
        newrgs.add("Animation club");
        newrgs.add("Otaku club");
        newrgs.add("Quiz club");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rgs);
        rgsclubListView.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, newrgs);
        newrgsclubsListView.setAdapter(arrayAdapter1);
    }
}
