package com.example.mrf3.fict;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.location.Criteria;
import android.location.LocationProvider;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location extends AppCompatActivity {

    private final LatLng OLOCATION = new LatLng(2.940351, 101.662513);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        map.setMyLocationEnabled(true);
/*        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        android.location.Location currentLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
  */
    }

    public void onClick_location (View v) {
        CameraUpdate update = CameraUpdateFactory.newLatLng(OLOCATION);
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        update = CameraUpdateFactory.newLatLngZoom(OLOCATION, 18);
        map.addMarker(new MarkerOptions().position(OLOCATION).title("FICT is here !"));
        map.animateCamera(update);
    }


}
