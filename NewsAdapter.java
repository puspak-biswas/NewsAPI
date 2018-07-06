package com.example.puspakbiswas.newsapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Puspak Biswas on 04-07-2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity activity, ArrayList<News> newsList){
        super(activity,0,newsList);
    }

    public View getView(final int position, View convertView, ViewGroup parent){
        View listItem = convertView;
            if (listItem == null){
                listItem = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item,parent,false);
            }

        News news = getItem(position);
        TextView title = (TextView) listItem.findViewById(R.id.title);
        title.setText(news.getTitle());
        return listItem;

    }
}
