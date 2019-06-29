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

public class vister extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vister);
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

        LatLng López_costilla = new LatLng(21.356262, -101.935470);
        mMap.addMarker(new MarkerOptions()
                .position(López_costilla)
                .title("López costilla")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Emiliano_zapata = new LatLng(21.355504, -101.937593);
        mMap.addMarker(new MarkerOptions()
                .position(Emiliano_zapata)
                .title("Emiliano zapata ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng El_polí = new LatLng(21.354962, -101.939119);
        mMap.addMarker(new MarkerOptions()
                .position(El_polí)
                .title("El polí")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Azulejos_Garo = new LatLng(21.354962, -101.939119);
        mMap.addMarker(new MarkerOptions()
                .position(Azulejos_Garo)
                .title("El polí")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Hotel_Black = new LatLng(21.352791, -101.940955);
        mMap.addMarker(new MarkerOptions()
                .position(Hotel_Black)
                .title("Hotel Black")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Hotel_las_fuentes = new LatLng(21.350702, -101.941071);
        mMap.addMarker(new MarkerOptions()
                .position(Hotel_las_fuentes)
                .title("Hotel las fuentes")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Hotel_maria_elena = new LatLng(21.350096, -101.941094);
        mMap.addMarker(new MarkerOptions()
                .position(Hotel_maria_elena)
                .title("Hotel maria elena")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Transportes_urbanos_romo = new LatLng(21.348903, -101.940782);
        mMap.addMarker(new MarkerOptions()
                .position(Transportes_urbanos_romo)
                .title("Transportes urbanos romo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Olimpia = new LatLng(21.347059, -101.940169);
        mMap.addMarker(new MarkerOptions()
                .position(Olimpia)
                .title("Olimpia")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Industrias_el_Gallo = new LatLng(21.343539, -101.943082);
        mMap.addMarker(new MarkerOptions()
                .position(Industrias_el_Gallo)
                .title("Industrias el Gallo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Aurora = new LatLng(21.341113, -101.946997);
        mMap.addMarker(new MarkerOptions()
                .position(Aurora)
                .title("Aurora")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Esmeralda1 = new LatLng(21.340110, -101.948826);
        mMap.addMarker(new MarkerOptions()
                .position(Esmeralda1)
                .title("Esmeralda 1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Esmeralda2 = new LatLng(21.338581, -101.951269);
        mMap.addMarker(new MarkerOptions()
                .position(Esmeralda2)
                .title("Esmeralda 2")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Esmeralda_canchas = new LatLng(21.337540, -101.952959);
        mMap.addMarker(new MarkerOptions()
                .position(Esmeralda_canchas)
                .title("Esmeralda canchas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Llantas_directas = new LatLng(21.336536, -101.956495);
        mMap.addMarker(new MarkerOptions()
                .position(Llantas_directas)
                .title("Llantas directas lagos")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Frente_a_feria = new LatLng(21.335830, -101.959751);
        mMap.addMarker(new MarkerOptions()
                .position(Frente_a_feria)
                .title("Frente a feria")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Glorieta_del_charro = new LatLng(21.335300, -101.962173);
        mMap.addMarker(new MarkerOptions()
                .position(Glorieta_del_charro)
                .title("Glorieta del charro")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Glorieta_del_charro1 = new LatLng(21.335233, -101.962333);
        mMap.addMarker(new MarkerOptions()
                .position(Glorieta_del_charro1)
                .title("Glorieta del charro")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng La_perla = new LatLng(21.334688, -101.964945);
        mMap.addMarker(new MarkerOptions()
                .position(La_perla)
                .title("La perla")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Jacales = new LatLng(21.333407, -101.970939);
        mMap.addMarker(new MarkerOptions()
                .position(Jacales)
                .title("Jacales")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Jacales1 = new LatLng(21.333251, -101.970952);
        mMap.addMarker(new MarkerOptions()
                .position(Jacales1)
                .title("Jacales")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Casino_San_pedro = new LatLng(21.328255, -101.970078);
        mMap.addMarker(new MarkerOptions()
                .position(Casino_San_pedro)
                .title("Casino San pedro ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng La_DERSE = new LatLng(21.322962, -101.970241);
        mMap.addMarker(new MarkerOptions()
                .position(La_DERSE)
                .title("La DERSE")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Cristeros1 = new LatLng(21.321217, -101.970494);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros1)
                .title("Cristeros 1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Cristeros2 = new LatLng(21.321209, -101.970590);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros2)
                .title("Cristeros 1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Cristeros3 = new LatLng(21.321234, -101.971443);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros3)
                .title("Cristeros 2")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Cristeros4 = new LatLng(21.321272, -101.972444);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros4)
                .title("Cristeros 3")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros5 = new LatLng(21.321299, -101.973693);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros5)
                .title("Cristeros 4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros6 = new LatLng(21.321237, -101.973782);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros6)
                .title("Cristeros 4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros7 = new LatLng(21.320487, -101.973860);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros7)
                .title("Cristeros 5")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros8 = new LatLng(21.320380, -101.973787);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros8)
                .title("Cristeros 5")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros9 = new LatLng(21.320307, -101.971776);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros9)
                .title("Cristeros 6")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros10 = new LatLng(21.320280, -101.970891);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros10)
                .title("Cristeros 7")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Cristeros11 = new LatLng(21.320340, -101.970794);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros11)
                .title("Cristeros 7")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros12 = new LatLng(21.321207, -101.970571);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros12)
                .title("Regreso Cristeros 8")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Cristeros13 = new LatLng(21.321232, -101.970486);
        mMap.addMarker(new MarkerOptions()
                .position(Cristeros13)
                .title(" Regreso Cristeros 8")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng San_pedro = new LatLng(21.333251, -101.970952);
        mMap.addMarker(new MarkerOptions()
                .position(San_pedro)
                .title(" San Pedro")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng San_pedro1 = new LatLng(21.333281, -101.970925);
        mMap.addMarker(new MarkerOptions()
                .position(San_pedro1)
                .title(" San Pedro")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng La_perla1 = new LatLng(21.333912, -101.967907);
        mMap.addMarker(new MarkerOptions()
                .position(La_perla1)
                .title("La perla")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng La_perla_entrada_principal = new LatLng(21.334576, -101.964888);
        mMap.addMarker(new MarkerOptions()
                .position(La_perla_entrada_principal)
                .title("La perla entrada principal")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Hotel_Casa_grande = new LatLng(21.334991, -101.962345);
        mMap.addMarker(new MarkerOptions()
                .position(Hotel_Casa_grande)
                .title("Hotel Casa grande ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Esmeralda = new LatLng(21.336388, -101.955991);
        mMap.addMarker(new MarkerOptions()
                .position(Esmeralda)
                .title("Esmeralda  ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng El_vaquero_norteño = new LatLng(21.338771, -101.950240);
        mMap.addMarker(new MarkerOptions()
                .position(El_vaquero_norteño)
                .title("El vaquero norteño")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng La_Aurora = new LatLng(21.340840, -101.946973);
        mMap.addMarker(new MarkerOptions()
                .position(La_Aurora)
                .title("La Aurorao")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng El_terror = new LatLng(21.341624, -101.945702);
        mMap.addMarker(new MarkerOptions()
                .position(El_terror)
                .title("El terror")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));

        LatLng Gasolinera_el_refugio = new LatLng(21.346995, -101.939361);
        mMap.addMarker(new MarkerOptions()
                .position(El_terror)
                .title("Gasolinera el refugio")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Frente_a_transportes_urbanos_romo = new LatLng(21.348547, -101.940360);
        mMap.addMarker(new MarkerOptions()
                .position(Frente_a_transportes_urbanos_romo)
                .title("Frente a transportes urbanos romo")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico)));


        LatLng Flamingo_pewter = new LatLng(21.351163, -101.940782);
        mMap.addMarker(new MarkerOptions()
                .position(Flamingo_pewter)
                .title("Flamingo pewter")
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
