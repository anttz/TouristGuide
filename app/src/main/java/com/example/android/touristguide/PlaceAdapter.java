package com.example.android.touristguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place>{
    private int mColorResourceId;
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId){
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list_item = convertView;
        if(list_item == null){
            list_item = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView placeTextView = (TextView) list_item.findViewById(R.id.place);
        placeTextView.setText(currentPlace.getmPlace());
        TextView addressTextView = (TextView) list_item.findViewById(R.id.address);
        addressTextView.setText(currentPlace.getmAddress());
        ImageView imageview = (ImageView) list_item.findViewById(R.id.image);
        imageview.setImageResource(currentPlace.getmImageResourceId());
        View textViewContainer = list_item.findViewById(R.id.textview_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textViewContainer.setBackgroundColor(color);
        return list_item;
    }
}