package com.example.aazarjameeel.hyderabadtourguideapp;

/**
 * Created by aazarjameeel on 01-Jul-16.
 */
public class EventHyderabad {

    /* hold the event name*/
    private String mEventName;

    /* hold the event desciption*/
    private String mEventDescription;

    /* hold the event date*/
    private String mEventDate;

    /*hold the image resource id*/
    private  int mImageResourceId;

    public EventHyderabad(String dEventName, String defaultEventDate,String defaulteventDescription,int defaultimageResourceId){
        mEventName=dEventName;
        mEventDate=defaultEventDate;
        mEventDescription=defaulteventDescription;
        mImageResourceId=defaultimageResourceId;
    }

    /*method for getting event name*/
    public String getmEventName(){ return mEventName;}

    /*method for getting event date*/
    public String getmEventDate(){ return mEventDate;}

    /*return the image resource id*/
    public int getImageResourceId() {return mImageResourceId;}

    /*return the event description*/
    public String getmEventDescription() {return mEventDescription;}



}
