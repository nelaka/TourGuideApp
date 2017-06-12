package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WhereToSleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list);

        //Create an arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("The Excelsior", "10 Komninon Str.", "$$$", R.drawable.hotel_excelsior));
        places.add(new Place("Makedonia Palace ", "2 M Alexandrou Ave", "$$$$", R.drawable.hotel_makedonia_palace));
        places.add(new Place("Colors Urban Hotel", "13 Tsimiski Str.", "$$", R.drawable.hotel_colors));
        places.add(new Place("Blue Bottle Boutique Hotel", "16 Episkopou Amvrossiou Str.", "$$", R.drawable.hotel_blue_bottle));
        places.add(new Place("The Caravan", "1 Rebelou Str.", "$$", R.drawable.hotel_caravan));
        places.add(new Place("Daios Luxury Living", "59 Leoforos Nikis Str.", "$$$$", R.drawable.hotel_daios));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_tosleep);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // the todo_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Set the image for the {@link Activity}
        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setVisibility(View.GONE);

        // Make the {@link ListView} use the {@link PlaceAdapter}, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
