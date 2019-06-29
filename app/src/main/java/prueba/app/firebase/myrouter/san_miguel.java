package prueba.app.firebase.myrouter;

import android.Manifest;
import android.content.pm.PackageManager;
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

public class san_miguel extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_miguel);
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
        LatLng Mercado_grande = new LatLng(21.357182, -101.932850);
        mMap.addMarker(new MarkerOptions()
                .position(Mercado_grande)
                .title("Mercado grande ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng esquina_del_kikapu = new LatLng(21.381650, -101.900440);
        mMap.addMarker(new MarkerOptions()
                .position(esquina_del_kikapu)
                .title("esquina del kikapu ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng tercera_entrada_de_la_colinia = new LatLng(21.380346, -101.902468);
        mMap.addMarker(new MarkerOptions()
                .position(tercera_entrada_de_la_colinia)
                .title("tercera entrada de la colinia ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng primera_entrada = new LatLng(21.379786, -101.903313);
        mMap.addMarker(new MarkerOptions()
                .position(primera_entrada)
                .title("primera entrada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng esquina_de_calle_rio_verde = new LatLng(21.378477, -101.904487);
        mMap.addMarker(new MarkerOptions()
                .position(esquina_de_calle_rio_verde)
                .title("esquina de calle rio verde")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng entrada_a_granadillas = new LatLng(21.376934, -101.905078);
        mMap.addMarker(new MarkerOptions()
                .position(entrada_a_granadillas)
                .title("entrada a granadillas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng gasolinera_loma_de_lagos = new LatLng(21.372804, -101.902550);
        mMap.addMarker(new MarkerOptions()
                .position(gasolinera_loma_de_lagos)
                .title("gasolinera loma de lagos")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng esquina_del_hotel_casa_loma = new LatLng(21.370610, -101.906442);
        mMap.addMarker(new MarkerOptions()
                .position(esquina_del_hotel_casa_loma)
                .title("esquina del hotel casa loma")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng corralon_municipal = new LatLng(21.369623, -101.909181);
        mMap.addMarker(new MarkerOptions()
                .position(corralon_municipal)
                .title("corralon municipal")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng frente_de_la_empresa_coca_cola = new LatLng(21.368816, -101.911460);
        mMap.addMarker(new MarkerOptions()
                .position(frente_de_la_empresa_coca_cola)
                .title("frente de la empresa coca cola")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng esquina_de_la_cruz_roja = new LatLng(21.370133, -101.906538);
        mMap.addMarker(new MarkerOptions()
                .position(esquina_de_la_cruz_roja)
                .title("esquina de la cruz roja")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng unidad_deportiva = new LatLng(21.367714, -101.913900);
        mMap.addMarker(new MarkerOptions()
                .position(unidad_deportiva)
                .title("unidad deportiva")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng unidad_1deportiva = new LatLng(21.367759, -101.913196);
        mMap.addMarker(new MarkerOptions()
                .position(unidad_1deportiva)
                .title("unidad deportiva")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng calle_swissmex = new LatLng(21.366175, -101.914918);
        mMap.addMarker(new MarkerOptions()
                .position(calle_swissmex)
                .title("calle swissmex")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng frente_ala_volkswagen = new LatLng(21.366185, -101.915503);
        mMap.addMarker(new MarkerOptions()
                .position(frente_ala_volkswagen)
                .title("frente ala volkswagen")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng forrajera = new LatLng(21.363315, -101.917972);
        mMap.addMarker(new MarkerOptions()
                .position(forrajera)
                .title("forrajera")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng las_vias_de_ley = new LatLng(21.361227, -101.920976);
        mMap.addMarker(new MarkerOptions()
                .position(las_vias_de_ley)
                .title("las vias de ley")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Plaza_capuchinas = new LatLng(21.359798, -101.922006);
        mMap.addMarker(new MarkerOptions()
                .position(Plaza_capuchinas)
                .title("Plaza capuchinas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng frente_el_pollo_feliz = new LatLng(21.358819, -101.923098);
        mMap.addMarker(new MarkerOptions()
                .position(frente_el_pollo_feliz)
                .title("frente el pollo feliz")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng bodega_aurrera = new LatLng(21.358849, -101.923526);
        mMap.addMarker(new MarkerOptions()
                .position(bodega_aurrera)
                .title("bodega aurrera")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

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









        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mercado_grande ,16));
    }
}
