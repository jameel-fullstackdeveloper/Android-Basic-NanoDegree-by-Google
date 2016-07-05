package com.example.aazarjameeel.udacitybooklisitngapp;

/**
 * Created by aazarjameeel on 02-Jul-16.
 */
public class Book {

   /*hold the book tile*/
   private String mBookTitle;

   /*hold the book author*/
   private String mBookAuthor;

   /*constructor */
   public Book(String defaultBook,String defaultBookAuthor){
         mBookTitle=defaultBook;
        mBookAuthor=defaultBookAuthor;
   }

    /*ge the book title*/
    public String getmBookTitle(){return mBookTitle;}

    /*ge the book author*/
    public String getmBookAuthor(){return mBookAuthor;}



}
