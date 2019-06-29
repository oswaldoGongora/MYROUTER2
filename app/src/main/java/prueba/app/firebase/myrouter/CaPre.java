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

public class CaPre extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca_pre);
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

        LatLng Emiliano_zapata = new LatLng(21.355495, -101.937592);
        mMap.addMarker(new MarkerOptions()
                .position(Emiliano_zapata)
                .title("Emiliano Zapata y 5 de mayo ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng poli = new LatLng(21.3549613, -101.9391329);
        mMap.addMarker(new MarkerOptions()
                .position(poli)
                .title("contra esquina de la calle del poli")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Orozco_y_jimenez = new LatLng(21.3547866, -101.940623);
        mMap.addMarker(new MarkerOptions()
                .position(Orozco_y_jimenez)
                .title("Orozco y jimenez")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Aldama = new LatLng(21.3561398, -101.9412779);
        mMap.addMarker(new MarkerOptions()
                .position(Aldama)
                .title("Aldama primera parada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Rancho_del_venadito_con_Aldama = new LatLng(21.3555812, -101.9430738);
        mMap.addMarker(new MarkerOptions()
                .position(Rancho_del_venadito_con_Aldama)
                .title("Aldama segunda parada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Aldama3 = new LatLng(21.3552039, -101.9442583);
        mMap.addMarker(new MarkerOptions()
                .position(Aldama3)
                .title("Aldama tercera parada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Aldama4 = new LatLng(21.3549575, -101.9450557);
        mMap.addMarker(new MarkerOptions()
                .position(Aldama4)
                .title("Aldama cuarta parada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Roble = new LatLng(21.3565443, -101.9457516);
        mMap.addMarker(new MarkerOptions()
                .position(Roble)
                .title("Roble")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Hacienda = new LatLng(21.3560753, -101.9477523);
        mMap.addMarker(new MarkerOptions()
                .position(Hacienda)
                .title("Hacienda La Sauceda")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Avenue = new LatLng(21.3576892,-101.94887);
        mMap.addMarker(new MarkerOptions()
                .position(Avenue)
                .title("Escuela especial")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng UDG = new LatLng(21.3570396,-101.9510102);
        mMap.addMarker(new MarkerOptions()
                .position(UDG)
                .title("UDG")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng CUlagos = new LatLng(21.3567247,-101.951988);
        mMap.addMarker(new MarkerOptions()
                .position(CUlagos)
                .title("CUlagos")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Paeos = new LatLng(21.3560433,-101.9503266);
        mMap.addMarker(new MarkerOptions()
                .position(Paeos)
                .title("Paseos Sierra Morena")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));



        LatLng javier_Mina = new LatLng(21.3555216,-101.9463331);
        mMap.addMarker(new MarkerOptions()
                .position(javier_Mina)
                .title("javier mina primer parada")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng javier_Mina1 = new LatLng(21.3558006,-101.9454797);
        mMap.addMarker(new MarkerOptions()
                .position(javier_Mina1)
                .title("javier mina con esquina roble")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng javier_Mina2 = new LatLng(21.356061,-101.9446188);
        mMap.addMarker(new MarkerOptions()
                .position(javier_Mina2)
                .title("javier mina esquina hacienda la daga")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng javier_Mina24 = new LatLng(21.356061,-101.9446188);
        mMap.addMarker(new MarkerOptions()
                .position(javier_Mina2)
                .title("javier mina esquina hacienda la daga")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));





        LatLng Frente_a_muebles_vanguardia = new LatLng(21.353556, -101.939795);
        mMap.addMarker(new MarkerOptions()
                .position(Frente_a_muebles_vanguardia)
                .title("Frente a muebles vanguardia")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Emiliano_zapata1 = new LatLng(21.354456, -101.937558);
        mMap.addMarker(new MarkerOptions()
                .position(Emiliano_zapata1)
                .title("Emiliano zapata")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Funerales_Muñoz = new LatLng(21.355282, -101.935241);
        mMap.addMarker(new MarkerOptions()
                .position(Funerales_Muñoz)
                .title("Funerales Muñoz")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Hospital_regional = new LatLng(21.355943, -101.933520);
        mMap.addMarker(new MarkerOptions()
                .position(Hospital_regional)
                .title("Hospital regional")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Carol_s_chicken = new LatLng(21.356559, -101.931878);
        mMap.addMarker(new MarkerOptions()
                .position(Carol_s_chicken)
                .title("Carol's chicken")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Rita_Pérez = new LatLng(21.357351, -101.929762);
        mMap.addMarker(new MarkerOptions()
                .position(Rita_Pérez)
                .title("Rita Pérez")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Servicio_victoria = new LatLng(21.357888, -101.928378);
        mMap.addMarker(new MarkerOptions()
                .position(Servicio_victoria)
                .title("Servicio victoria")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Seguro_viejo = new LatLng(21.359002, -101.927544);
        mMap.addMarker(new MarkerOptions()
                .position(Seguro_viejo)
                .title("Seguro viejo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng frente_de_bogega_aurrera = new LatLng(21.358690, -101.923185);
        mMap.addMarker(new MarkerOptions()
                .position(frente_de_bogega_aurrera)
                .title("frente de bogega aurrera")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Capuchinas_ley = new LatLng(21.359916, -101.921791);
        mMap.addMarker(new MarkerOptions()
                .position(Capuchinas_ley)
                .title("Capuchinas ley")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Comfosa = new LatLng(21.363252, -101.918218);
        mMap.addMarker(new MarkerOptions()
                .position(Comfosa)
                .title("Comfosa")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Las_palmas = new LatLng(21.365300, -101.915982);
        mMap.addMarker(new MarkerOptions()
                .position(Las_palmas)
                .title("Las palmas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Emfrente_de_la_estacion_de_bomberos = new LatLng(21.367670, -101.913285);
        mMap.addMarker(new MarkerOptions()
                .position(Emfrente_de_la_estacion_de_bomberos)
                .title("Emfrente de la estacion de bomberos")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Good_year = new LatLng(21.369428, -101.908783);
        mMap.addMarker(new MarkerOptions()
                .position(Good_year)
                .title("Good year")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng A_un_lado_de_cruz_roja = new LatLng(21.369428, -101.908783);
        mMap.addMarker(new MarkerOptions()
                .position(A_un_lado_de_cruz_roja)
                .title("A un lado de cruz roja ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Emfrente_de_casa_loma = new LatLng(21.370706, -101.905175);
        mMap.addMarker(new MarkerOptions()
                .position(Emfrente_de_casa_loma)
                .title("Emfrente de casa loma")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Carretera_panamericana = new LatLng(21.3611098, -101.8985724);
        mMap.addMarker(new MarkerOptions()
                .position(Carretera_panamericana)
                .title("Carretera panamericana ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Casa_loma = new LatLng(21.371082, -101.905018);
        mMap.addMarker(new MarkerOptions()
                .position(Casa_loma)
                .title("Casa loma  ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Corralon_municipal = new LatLng(21.369638, -101.908960);
        mMap.addMarker(new MarkerOptions()
                .position(Corralon_municipal)
                .title("Corralon municipal")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Unidad_deportiva = new LatLng(21.368067, -101.913138);
        mMap.addMarker(new MarkerOptions()
                .position(Unidad_deportiva)
                .title("Unidad deportiva")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Emfrente_de_las_palmas = new LatLng(21.365436, -101.916240);
        mMap.addMarker(new MarkerOptions()
                .position(Emfrente_de_las_palmas)
                .title("Emfrente de las palmas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Pueblo_de_moya = new LatLng(21.362528, -101.919382);
        mMap.addMarker(new MarkerOptions()
                .position(Pueblo_de_moya)
                .title("Pueblo de moya")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Por_las_vias = new LatLng(21.361103, -101.920960);
        mMap.addMarker(new MarkerOptions()
                .position(Por_las_vias)
                .title("Por las vias")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Bodega_aurrera = new LatLng(21.358718, -101.923547);
        mMap.addMarker(new MarkerOptions()
                .position(Bodega_aurrera)
                .title("Bodega aurrera")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Mercado_chico = new LatLng(21.358563, -101.929490);
        mMap.addMarker(new MarkerOptions()
                .position(Mercado_chico)
                .title("Mercado chico")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));













        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Mercado_grande, 16));

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
