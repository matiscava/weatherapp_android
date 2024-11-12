package com.example.weatherapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setupListView();
    }

    void setupListView(){
        listView = (ListView) findViewById(R.id.lvCities);
        cities = new ArrayList<String>();

        cities.add("CABA");
        cities.add("Montevideo");
        cities.add("Trelew");
        cities.add("Santa Fe");
        cities.add("Catamarca");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                (getApplicationContext(), android.R.layout.simple_list_item_1,cities);
//
//        listView.setAdapter(arrayAdapter);
        CustomAdapter adapter = new CustomAdapter(this, cities);
        listView.setAdapter(adapter);
    }
}