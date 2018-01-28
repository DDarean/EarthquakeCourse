package com.example.android.quakereport;

/**
 * Created by ddare on 27.01.2018.
 */

public class EarthquakeEvent {

    private Double mMagnitude;
    private String mLocation;
    private long mDate;
    private long mTime;
    private String mUrl;


    public EarthquakeEvent(Double Magnitude, String Location, long Date, String url) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
        mUrl = url;
    }

    public Double getMagnitude() {return mMagnitude;}
    public String getLocation() {return mLocation;}
    public long getDate() {return mDate;}
    public long getTime() {return mTime;}
    public String getUrl() {return mUrl;}
}
