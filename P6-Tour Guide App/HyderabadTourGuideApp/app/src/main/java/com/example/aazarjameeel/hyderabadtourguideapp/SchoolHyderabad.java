package com.example.aazarjameeel.hyderabadtourguideapp;

/**
 * Created by aazarjameeel on 02-Jul-16.
 */
public class SchoolHyderabad {

    /* hold the schoold name*/
    private String mSchoolName;

    /* hold the schoold desciption*/
    private String mSchoolDescription;

    /* hold the schoold addresss*/
    private String mSchoolAddress;


    public SchoolHyderabad(String defaultSchoolName, String defaultSchoolDescription, String defaultSchoolAddress){
        mSchoolName=defaultSchoolName;
        mSchoolDescription=defaultSchoolDescription;
        mSchoolAddress=defaultSchoolAddress;
    }

    /*method for getting Restaurant name*/
    public String getmSchoolName(){ return mSchoolName;}

    /*method for getting Restaurant description*/
    public String getmSchoolDescription(){ return mSchoolDescription;}

    /*return the Restaurant Address*/
    public String getmSchoolAddress() {return mSchoolAddress;}


}
