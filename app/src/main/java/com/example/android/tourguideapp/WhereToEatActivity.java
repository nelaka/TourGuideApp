package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WhereToEatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list);

        //Create an arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Kitchen", "Inside city's harbor ", "$$", R.drawable.kitchen_bar));
        places.add(new Place("Ergon", "42 Pavlou Mela Str.", "$$", R.drawable.ergon));
        places.add(new Place("Ionos", "3 Ionos Dragoumi Str.", "$$$", R.drawable.ionos));
        places.add(new Place("Orizontes Roof Garden", "9 Aristotelous Square", "$$$"));
        places.add(new Place("Clochard", "4 Proxenou Koromila Str.", "$$$$"));
        places.add(new Place("The Last Slice", "1 Proxenou Koromila Str.", "$"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_toeat);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // the todo_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Set the image for the {@link Activity}
        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.mousakas);

        // Make the {@link ListView} use the {@link PlaceAdapter}, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
