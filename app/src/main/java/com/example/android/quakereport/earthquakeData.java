package com.example.android.quakereport;

public class earthquakeData {
    private double magnitude;
    private String place;
    private long time;
    private String url;
    public earthquakeData(Double d,String p,long time,String url)
    {
        magnitude=d;
        place=p;
        this.time=time;
        this.url=url;
    }
    Double getMagnitude()
    {
        return magnitude;
    }
    String getPlace()
    {
        return place;
    }
    long getTime()
    {
        return time;
    }
    public String getUrl() {
        return url;
    }

}
