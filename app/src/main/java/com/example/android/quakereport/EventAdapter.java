package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by ddare on 27.01.2018.
 */

public class EventAdapter extends ArrayAdapter<EarthquakeEvent> {

    public EventAdapter (Activity context, ArrayList<EarthquakeEvent> earthquakes){
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        EarthquakeEvent currentEvent = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.list_magnitude);
        magnitudeTextView.setText(currentEvent.getMagnitude());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.list_location);
        locationTextView.setText(currentEvent.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.list_date);
        dateTextView.setText(currentEvent.getDate());

        return listItemView;

}}
