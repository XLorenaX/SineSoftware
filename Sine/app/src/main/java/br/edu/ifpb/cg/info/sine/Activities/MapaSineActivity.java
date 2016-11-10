package br.edu.ifpb.cg.info.sine.Activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import br.edu.ifpb.cg.info.sine.Classes.ListarCGAsyncTask;
import br.edu.ifpb.cg.info.sine.Classes.Sine;
import br.edu.ifpb.cg.info.sine.R;

public class MapaSineActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_sine);
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
        ListarCGAsyncTask pegarSines = new ListarCGAsyncTask();
        ArrayList<Sine> lista2 = new ArrayList<>();
        try {
            lista2 = pegarSines.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lista2.size(); i++){
            Double latitude = Double.valueOf(lista2.get(i).getLat());
            Double longitude = Double.valueOf(lista2.get(i).getLon());
            LatLng sineCG = new LatLng(latitude, longitude);
            MarkerOptions marcador = new MarkerOptions();
            mMap.addMarker(marcador.position(sineCG).title(lista2.get(i).getNome()));
        }

    }
}
