package com.pbo.projectnavigasi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pbo.projectnavigasi.databinding.ActivityKantorPolisiMapsBinding;

public class KantorPolisiMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityKantorPolisiMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityKantorPolisiMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Double latitude;
        Double longitude;
        String title;


        Bundle bundle = getIntent().getExtras();
        latitude = bundle.getDouble("latitude");
        longitude = bundle.getDouble("longitude");
        title = bundle.getString("title");


        // Add a marker in Sydney and move the camera
        LatLng KantorPolisi = new LatLng(+latitude,+longitude);
        mMap.addMarker(new MarkerOptions().position(KantorPolisi).title(title));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(KantorPolisi,15));
    }
}