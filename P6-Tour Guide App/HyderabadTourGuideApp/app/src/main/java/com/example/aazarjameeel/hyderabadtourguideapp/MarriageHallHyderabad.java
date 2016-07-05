package com.example.aazarjameeel.hyderabadtourguideapp;

/**
 * Created by aazarjameeel on 02-Jul-16.
 */
public class MarriageHallHyderabad {

    /* hold the event name*/
    private String mHallName;

    /* hold the event desciption*/
    private String mHallDescription;

    /* hold the event contact*/
    private String mHalltContact;


    public MarriageHallHyderabad(String defaultHallName, String defaultHallDecription,String defaultHallContact){
        mHallName=defaultHallName;
        mHallDescription=defaultHallDecription;
        mHalltContact=defaultHallContact;
    }

    /*method for getting event name*/
    public String getmHalltName(){ return mHallName;}

    /*method for getting event description*/
    public String getmHallDescription(){ return mHallDescription;}

    /*return the event contact*/
    public String getmHalltContact() {return mHalltContact;}
}
