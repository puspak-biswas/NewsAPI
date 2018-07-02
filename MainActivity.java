package com.example.puspakbiswas.newsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ListView listview = (ListView) findViewById(R.id.list_item);
        //ArrayAdapter<String> newAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,R.array.content);
        Button search = (Button) findViewById(R.id.search);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.experiment);
                editText.setText("done");
            }
        };
        search.setOnClickListener(listener);
    }
}
