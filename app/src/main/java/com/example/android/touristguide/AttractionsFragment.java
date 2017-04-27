package com.example.android.touristguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.attraction_1), getString(R.string.address_1), R.drawable.acropolis));
        places.add(new Place(getString(R.string.attraction_2), getString(R.string.address_2), R.drawable.archaelogiacal_museum));
        places.add(new Place(getString(R.string.attraction_3), getString(R.string.address_3), R.drawable.national_gallery));
        places.add(new Place(getString(R.string.attraction_4), getString(R.string.address_4), R.drawable.museum_city_of_athens));
        places.add(new Place(getString(R.string.attraction_5), getString(R.string.address_5), R.drawable.cruiser));
        places.add(new Place(getString(R.string.attraction_6), getString(R.string.address_6), R.drawable.parliament));
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
