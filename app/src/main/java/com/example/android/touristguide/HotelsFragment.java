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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.hotel_1), getString(R.string.hotel_address_1), R.drawable.hotel_1));
        places.add(new Place(getString(R.string.hotel_2), getString(R.string.hotel_address_2), R.drawable.hotel_2));
        places.add(new Place(getString(R.string.hotel_3), getString(R.string.hotel_address_3), R.drawable.hotel_3));
        places.add(new Place(getString(R.string.hotel_4), getString(R.string.hotel_address_4), R.drawable.hotel_4));
        places.add(new Place(getString(R.string.hotel_5), getString(R.string.hotel_address_5), R.drawable.hotel_5));
        places.add(new Place(getString(R.string.hotel_6), getString(R.string.hotel_address_6), R.drawable.hotel_6));
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
