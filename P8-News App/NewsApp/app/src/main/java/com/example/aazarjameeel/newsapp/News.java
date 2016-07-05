package com.example.aazarjameeel.newsapp;

import android.net.Uri;

import java.net.URL;

/**
 * Created by aazarjameeel on 03-Jul-16.
 */
public class News {

    /*holdthe news id*/
    private String thumbnail;
    /*hold the news date*/
    private String webTitle;
    /*hold the news url*/
    private Uri webUrl;

    /*constructor */
    public News(String dthumbnail,String dTitle,String dUrl){
        thumbnail=dthumbnail;
        webTitle=dTitle;
        webUrl=Uri.parse(dUrl);
    }

    /*ge the news id*/
    public String getThumbnail(){return thumbnail;}
    /*ge the news title*/
    public String getWebTitle(){return webTitle;}
    /*ge the news url*/
    public Uri getWebUrl(){return webUrl;}
}
