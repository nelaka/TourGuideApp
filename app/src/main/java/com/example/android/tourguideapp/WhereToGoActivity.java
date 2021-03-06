package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WhereToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list);

        //Create an arrayList of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.attraction1), getString(R.string.go_info1), R.drawable.go_bezesteni_market));
        places.add(new Place(getString(R.string.attraction2), getString(R.string.go_info2), R.drawable.go_white_tower));
        places.add(new Place(getString(R.string.attraction3), getString(R.string.go_info3), R.drawable.go_eptapirgio));
        places.add(new Place(getString(R.string.attraction4), getString(R.string.go_info4), R.drawable.go_ladadika));
        places.add(new Place(getString(R.string.attraction5), getString(R.string.go_info5), R.drawable.go_arch_of_galerius));
        places.add(new Place(getString(R.string.attraction6), getString(R.string.go_info6), R.drawable.go_alexander_the_great));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_togo);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // the todo_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Set the image for the {@link Activity}
        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.rotonda);

        // Make the {@link ListView} use the {@link PlaceAdapter}, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
