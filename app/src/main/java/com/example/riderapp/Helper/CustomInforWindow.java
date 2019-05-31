package com.example.riderapp.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.riderapp.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInforWindow implements GoogleMap.InfoWindowAdapter {

    View mView;

    public CustomInforWindow(Context context) {
        mView= LayoutInflater.from(context).inflate(R.layout.custom_rider_infor_window,null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickupTitle=((TextView)mView.findViewById(R.id.txtPickupInfor));
        txtPickupTitle.setText(marker.getTitle());

        TextView txtPickupSnippet=((TextView)mView.findViewById(R.id.txtPickupSnippet));
        txtPickupSnippet.setText(marker.getSnippet());
        return mView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
