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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurant_1), getString(R.string.restaurants_address_1), R.drawable.restaurant_1));
        places.add(new Place(getString(R.string.restaurant_2), getString(R.string.restaurants_address_2), R.drawable.restaurant_2));
        places.add(new Place(getString(R.string.restaurant_3), getString(R.string.restaurants_address_3), R.drawable.restaurant_3));
        places.add(new Place(getString(R.string.restaurant__4), getString(R.string.restaurants_address_4), R.drawable.restaurant_4));
        places.add(new Place(getString(R.string.restaurant_5), getString(R.string.restaurants_address_5), R.drawable.restaurant_5));
        places.add(new Place(getString(R.string.restaurant_6), getString(R.string.restaurants_address_6), R.drawable.restaurant_6));
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
