package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<Word> words= new ArrayList<Word>();

        //wordsList.add("one");
        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four","oyyisa",R.drawable.number_four));
        words.add(new Word("five","massokka",R.drawable.number_five));
        words.add(new Word("six","temmokka",R.drawable.number_six));
        words.add(new Word("seven","kenekaku",R.drawable.number_six));
        words.add(new Word("eight","kawinta",R.drawable.number_seven));
        words.add(new Word("nine","wo'e",R.drawable.number_eight));
        words.add(new Word("ten", "na'aacha",R.drawable.number_nine));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
    }

}
