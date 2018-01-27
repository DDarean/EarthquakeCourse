package com.example.android.quakereport;

import java.sql.Time;

/**
 * Created by ddare on 27.01.2018.
 */

public class EarthquakeEvent {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public EarthquakeEvent(String Magnitude, String Location, String Date) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    public String getMagnitude() {return mMagnitude;}
    public String getLocation() {return mLocation;}
    public String getDate() {return mDate;}
}
