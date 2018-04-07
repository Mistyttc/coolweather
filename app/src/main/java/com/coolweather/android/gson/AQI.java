package com.coolweather.android.gson;

/**
 * Created by Spriggan on 2018/4/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
