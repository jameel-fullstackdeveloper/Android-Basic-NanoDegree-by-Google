package com.example.aazarjameeel.hyderabadtourguideapp;

/**
 * Created by aazarjameeel on 02-Jul-16.
 */
public class RestaurantHyderabad {

    /* hold the Restaurant name*/
    private String mRestaurantName;

    /* hold the Restaurant desciption*/
    private String mRestaurantDescription;

    /* hold the Restaurant addresss*/
    private String mRestaurantAddress;


    public RestaurantHyderabad(String defaultRestaurantName, String defaultRestaurantDescription, String defaultRestaurantContact){
        mRestaurantName=defaultRestaurantName;
        mRestaurantDescription=defaultRestaurantDescription;
        mRestaurantAddress=defaultRestaurantContact;
    }

    /*method for getting Restaurant name*/
    public String getmRestaurantName(){ return mRestaurantName;}

    /*method for getting Restaurant description*/
    public String getmRestaurantDescription(){ return mRestaurantDescription;}

    /*return the Restaurant Address*/
    public String getmRestaurantAddress() {return mRestaurantAddress;}
}
