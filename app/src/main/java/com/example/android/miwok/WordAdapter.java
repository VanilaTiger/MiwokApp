package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.view.View.GONE;

/**
 * Created by adama on 04.07.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public int mBackgroundColor;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of AndroidFlavor objects to display in a list
     */

    public WordAdapter(Activity context, ArrayList<Word> words, int mBackgroundColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,words);
        this.mBackgroundColor=mBackgroundColor;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent,false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.mMiwokTranslation);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokWordTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultWordTextView = (TextView) listItemView.findViewById(R.id.mDefaultTranslation);
        defaultWordTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageReferenceImageView = (ImageView) listItemView.findViewById(R.id.mImageTranslation);
        if (currentWord.hasImage()) {
            //Set the ImageView to the image resource specified in the current word
            imageReferenceImageView.setImageResource(currentWord.getmImageResourceID());

            //Make sure the image is visible as view are reused by adapter
            imageReferenceImageView.setVisibility(View.VISIBLE);
        } else
            imageReferenceImageView.setVisibility(View.GONE);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        View textContainer = (View) listItemView.findViewById(R.id.textContainer);
        //gettin the color
        int color= ContextCompat.getColor(getContext(),mBackgroundColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
