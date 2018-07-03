package com.example.puspakbiswas.newsapi;

/**
 * Created by Puspak Biswas on 03-07-2018.
 */

public class News {

    private String mTitle;
    private String mSection;
    private String mDate;
    private String[] mAuthor;

    public News(String title,String section,String date, String[] author){
        mTitle = title;
        mSection = section;
        mDate = date;
        mAuthor = author;
    }

    public String getTitle(){
        return mTitle;
    }

    public String toString(){
        return mTitle;
    }
}
