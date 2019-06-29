package prueba.app.firebase.myrouter;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class plan extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
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
        // Add a marker in Sydney and move the camera
        LatLng OS = new LatLng(21.3443207, -101.9280279);
        mMap.addMarker(new MarkerOptions()
                .position(OS)
                .title("parada nueva santa elena")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng cona = new LatLng(21.3198272, -101.9275588);
        mMap.addMarker(new MarkerOptions()
                .position(cona)
                .title("parada conalep")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );


        LatLng seguro = new LatLng(21.3590739, -101.9275748);
        mMap.addMarker(new MarkerOptions()
                .position(seguro)
                .title("seguro")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );
        LatLng pedro = new LatLng(21.3407535, -101.9277667);
        mMap.addMarker(new MarkerOptions()
                .position(pedro)
                .title("parada colegio pedro moreno")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng arenal = new LatLng(21.3372147, -101.9275071);
        mMap.addMarker(new MarkerOptions()
                .position(arenal)
                .title("parada Arenal")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng arena2 = new LatLng(21.3338913, -101.9273036);
        mMap.addMarker(new MarkerOptions()
                .position(arena2)
                .title("parada Arenal")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng santae = new LatLng(21.3494542, -101.9284314);
        mMap.addMarker(new MarkerOptions()
                .position(santae)
                .title("parada de santa elena")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng puente1 = new LatLng(21.3516718, -101.9301511);
        mMap.addMarker(new MarkerOptions()
                .position(puente1)
                .title("parada puente santa elena")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );


        LatLng car = new LatLng(21.3554018, -101.927615);
        mMap.addMarker(new MarkerOptions()
                .position(car)
                .title("parada el carmen")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );


        LatLng ley = new LatLng(21.3587359, -101.9231414);
        mMap.addMarker(new MarkerOptions()
                .position(ley)
                .title("parada el ley")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng ao = new LatLng(21.3587761, -101.9235092);
        mMap.addMarker(new MarkerOptions()
                .position(ao)
                .title("parada aorerra")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng laluz = new LatLng(21.3634043, -101.9258471);
        mMap.addMarker(new MarkerOptions()
                .position(laluz)
                .title("parada luz")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng seguro1 = new LatLng(21.3762359, -101.9201837);
        mMap.addMarker(new MarkerOptions()
                .position(seguro1)
                .title("parada ospital tp")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );

        LatLng lacapilla = new LatLng(21.3263848, -101.9271523);
        mMap.addMarker(new MarkerOptions()
                .position(lacapilla)
                .title("parada la capilla")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );


        LatLng geo = new LatLng(21.3279454, -101.9268801);
        mMap.addMarker(new MarkerOptions()
                .position(geo)
                .title("parada geo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico))
        );


        //para pone las linias o rutas

        LatLng dhsg = new LatLng(21.3443207, -101.9280279);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3407535, -101.9277667),
                dhsg
                )
                        .width(10)
                        .color(Color.RED)
        );
        LatLng dhsg5 = new LatLng(21.3263848, -101.9271523);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3271085, -101.9270552),
                dhsg5
                )
                        .width(5)
                        .color(Color.RED)
        );

        LatLng dhsg1 = new LatLng(21.3407535, -101.9277667);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3372147, -101.9275071),
                dhsg1
                )
                        .width(10)
                        .color(Color.RED)
        );


        LatLng dhsg2 = new LatLng(21.3372147, -101.9275071);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3338913, -101.9273036),
                dhsg2
                )
                        .width(10)
                        .color(Color.RED)
        );

        LatLng dhsg3 = new LatLng(21.3338913, -101.9273036);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3299973, -101.9269953),
                dhsg3
                )
                        .width(10)
                        .color(Color.RED)
        );

        LatLng dhsg4 = new LatLng(21.3299973, -101.9269953);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3198272, -101.9275588),
                dhsg4
                )
                        .width(10)
                        .color(Color.RED)
        );
        LatLng santen = new LatLng(21.3443207, -101.9280279);
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(21.3407535, -101.9277667),
                santen
                )
                        .width(10)
                        .color(Color.RED)
        );

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng ssydney = new LatLng(21.3443207, -101.9280279);
        mMap.addMarker(new MarkerOptions().position(ssydney).title("Marker in Sydney"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seguro, 18));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }

}
