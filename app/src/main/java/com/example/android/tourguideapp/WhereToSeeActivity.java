package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WhereToSeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list);

        //Create an arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Archaeological Museum", "6 Manoli Andronikou Str.", R.drawable.museum_archeological));
        places.add(new Place("Museum of Byzantine Culture", "2 Stratou Ave.", R.drawable.museum_byzantine));
        places.add(new Place("Noesis - Science Center and Technology Museum", "6th Km Thessaloniki Rd. - Thermi", R.drawable.museum_noesis));
        places.add(new Place("Jewish Museum", "11 Agiou Mina Str."));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_tosee);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // the todo_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Set the image for the {@link Activity}
        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.museums);

        // Make the {@link ListView} use the {@link PlaceAdapter}, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
