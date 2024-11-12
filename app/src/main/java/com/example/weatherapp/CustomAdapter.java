package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> cities;

    public CustomAdapter(Context context, ArrayList<String> cities)
    {
        this.cities = cities;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @Override
    public Object getItem(int index) {
        return this.cities.get(index);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        v = layoutInflater.inflate(R.layout.list_item, null);

        String currentCity = cities.get(index);

        TextView textView = (TextView) v.findViewById(R.id.tvListItem);
        textView.setText(currentCity);

        return v;
    }
}
