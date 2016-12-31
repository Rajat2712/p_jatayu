package com.example.rajat.p_jatayu;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by JATIN on 15-10-2016.
 */
public class Locate extends AppCompatActivity implements OnMapReadyCallback {

    public SupportMapFragment mapFragment;
    private static final LatLng initial = new LatLng(28.582992, 77.105641);
    private static final LatLng Delhi[]=
            {
                    new LatLng(28.719868, 77.066240),
                    new LatLng(28.650609, 77.179505),
                    new LatLng(28.629835, 77.205954),
                    new LatLng(28.582663, 77.234333)
            };
    private static final LatLng Punjab[]=
            {
              new LatLng(30.721065, 76.799371),
              new LatLng(30.873556, 76.574075),
              new LatLng(30.647663, 76.777674),
              new LatLng(30.727101, 76.840048)
            };
    private static final  LatLng Goa[]=
            {
              new LatLng(15.462799, 73.980553),
              new LatLng(15.417791, 74.137114),
                    new LatLng(15.355560, 73.953093)
            };
    public Spinner spinner;
    Toolbar toolbar;
    ArrayAdapter<CharSequence> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locate);

        spinner=(Spinner)findViewById(R.id.locate_spinner);
        toolbar=(Toolbar)findViewById(R.id.locate_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.exit);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.locate_spinner_menu, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        final GoogleMap map=googleMap;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        googleMap.setMyLocationEnabled(true);
        googleMap.setBuildingsEnabled(true);

       // map.moveCamera(CameraUpdateFactory.newLatLngZoom(initial,1000));

        final LatLng latLng=new LatLng(28.647076, 77.183580);
        CameraPosition cameraPosition=new CameraPosition(latLng,10,10,10);
        CameraUpdate cameraUpdate= CameraUpdateFactory.newCameraPosition(cameraPosition);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        LatLng delhi = new LatLng(28.650895, 77.102831);
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(delhi, 11));
                        Marker a, b, c, d;
                        a = map.addMarker(new MarkerOptions().position(Delhi[0]).title("Shop 1"));
                        b = map.addMarker(new MarkerOptions().position(Delhi[1]).title("Shop 2"));
                        c = map.addMarker(new MarkerOptions().position(Delhi[2]).title("Shop 3"));
                        d = map.addMarker(new MarkerOptions().position(Delhi[3]).title("Shop 4"));

                        break;
                    case 2:
                        LatLng punjab = new LatLng(30.766211, 76.768128);
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(punjab, 10));
                        Marker a1, b1, c1, d1;
                        a1 = map.addMarker(new MarkerOptions().position(Punjab[0]).title("Shop 1"));
                        b1 = map.addMarker(new MarkerOptions().position(Punjab[1]).title("Shop 2"));
                        c1 = map.addMarker(new MarkerOptions().position(Punjab[2]).title("Shop 3"));
                        d1 = map.addMarker(new MarkerOptions().position(Punjab[3]).title("Shop 4"));
                        break;
                    case 3:
                        LatLng goa = new LatLng(15.272286, 73.970204);
                        Marker a2, b2, c2, d2;
                        a2 = map.addMarker(new MarkerOptions().position(Goa[0]).title("Shop 1"));
                        b2 = map.addMarker(new MarkerOptions().position(Goa[0]).title("Shop 2"));
                        c2 = map.addMarker(new MarkerOptions().position(Goa[0]).title("Shop 3"));
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(goa, 10));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode==KeyEvent.KEYCODE_BACK)
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}