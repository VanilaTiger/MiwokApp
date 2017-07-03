package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        ArrayList<String> wordsList= new ArrayList<String>();
        wordsList.add("one");
        wordsList.add("two");
        wordsList.add("three");
        wordsList.add("four");
        wordsList.add("five");
        wordsList.add("six");
        wordsList.add("seven");
        wordsList.add("eight");
        wordsList.add("nine");
        wordsList.add("ten");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        int i=0;
        for (int index=0;index < wordsList.size();index++) {
            TextView wordView = new TextView(this);
            wordView.setText(wordsList.get(i));
            rootView.addView(wordView);
            i++;
        }
    }
}
