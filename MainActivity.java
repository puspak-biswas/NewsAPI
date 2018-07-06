package com.example.puspakbiswas.newsapi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();
        //ListView listview = (ListView) findViewById(R.id.list_item);
        //ArrayAdapter<String> newAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,R.array.content);
        Button search = (Button) findViewById(R.id.search);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] author = new String[1];
                author[0] = "author";
                ArrayList<News> newsList = new ArrayList<News>();
                newsList.add(new News("title1","section1","date1",author));
                //ArrayAdapter<News> theAdapter = new ArrayAdapter<News>(context, android.R.layout.simple_list_item_1, news);
                NewsAdapter theAdapter = new NewsAdapter(MainActivity.this,newsList);
                ListView listview = (ListView) findViewById(R.id.list_item);
                listview.setAdapter(theAdapter);
            }
        };
        search.setOnClickListener(listener);
    }
}
