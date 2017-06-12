package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of Place objects to display in a list
     */
    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {

        // Initialization of {@link Place}Adapter's internal storage for the context and the list.
        // The second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID info_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        defaultTextView.setText(currentPlace.getInfo());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else imageView.setVisibility(View.GONE);

        // Find the TextView in the list_item.xml layout with the ID price
        TextView textView = (TextView) listItemView.findViewById(R.id.price);
        if (currentPlace.hasPrice()) {
            textView.setText(currentPlace.getPrice());
            textView.setVisibility(View.VISIBLE);
        } else textView.setVisibility(View.GONE);

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color for the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}


