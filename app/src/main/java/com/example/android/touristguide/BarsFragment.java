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
public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.bar_1), getString(R.string.bar_address_1), R.drawable.bar_1));
        places.add(new Place(getString(R.string.bar_2), getString(R.string.bar_address_2), R.drawable.bar_2));
        places.add(new Place(getString(R.string.bar_3), getString(R.string.bar_address_3), R.drawable.bar_3));
        places.add(new Place(getString(R.string.bar_4), getString(R.string.bar_address_4), R.drawable.bar_4));
        places.add(new Place(getString(R.string.bar_5), getString(R.string.bar_address_5), R.drawable.bar_5));
        places.add(new Place(getString(R.string.bar_6), getString(R.string.bar_address_6), R.drawable.bar_6));
        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places, R.color.bars);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
