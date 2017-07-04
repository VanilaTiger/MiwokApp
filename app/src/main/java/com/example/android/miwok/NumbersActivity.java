package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words= new ArrayList<Word>();

        //wordsList.add("one");
        words.add(new Word("lutti","one"));

/*
        wordsList.add("two");
        wordsList.add("three");
        wordsList.add("four");
        wordsList.add("five");
        wordsList.add("six");
        wordsList.add("seven");
        wordsList.add("eight");
        wordsList.add("nine");
        wordsList.add("ten");
*/
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
