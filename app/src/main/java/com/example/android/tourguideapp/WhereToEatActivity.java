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

        places.add(new Place(getString(R.string.restaurant1), getString(R.string.eat_info1), getString(R.string.affordable), R.drawable.kitchen_bar));
        places.add(new Place(getString(R.string.restaurant2), getString(R.string.eat_info2), getString(R.string.affordable), R.drawable.ergon));
        places.add(new Place(getString(R.string.restaurant3), getString(R.string.eat_info3), getString(R.string.expensive), R.drawable.ionos));
        places.add(new Place(getString(R.string.restaurant4), getString(R.string.eat_info4), getString(R.string.expensive)));
        places.add(new Place(getString(R.string.restaurant5), getString(R.string.eat_info5), getString(R.string.very_expensive)));
        places.add(new Place(getString(R.string.restaurant6), getString(R.string.eat_info6), getString(R.string.cheap)));

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
