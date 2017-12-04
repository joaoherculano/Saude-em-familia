package com.example.central.projeto.views

import android.support.v4.app.FragmentActivity
import android.os.Bundle
import com.example.central.projeto.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val UBS = LatLng(-6.8552532,-35.4904068)
        mMap!!.addMarker(MarkerOptions().position(UBS).title("UBS CONTENDAS ANTONIO C BARBOSA").snippet("Telefone (83) 3249-1069"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS, 15f))

        // Add a marker in Sydney and move the camera
        val UBS1 = LatLng(-6.8482893,-35.4925105)
        mMap!!.addMarker(MarkerOptions().position(UBS1).title("UBS BAIRRO NOVO LUIZ TOLENTINO DE ALUSTAU").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS1,2F))

        // Add a marker in Sydney and move the camera
        val UBS2 = LatLng(-6.8584796,-35.4442016)
        mMap!!.addMarker(MarkerOptions().position(UBS2).title("UBS PIRPIRI").snippet("TELEFONE (83)32793042"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS2,2F))

        // Add a marker in Sydney and move the camera
        val UBS3 = LatLng(-6.8805051,-35.4982616)
        mMap!!.addMarker(MarkerOptions().position(UBS3).title("UBS MUTIRAO IRMA MARIA ALVES DE ALMEIDA").snippet(
        "TELEFONE (83) 32714635"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS3,2F))

        // Add a marker in Sydney and move the camera
        val UBS4 = LatLng(-6.893402,-35.486768)
        mMap!!.addMarker(MarkerOptions().position(UBS4).title("UBS CACHOEIRA DR ARISTIDES VILLAR").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS4,2F))

        // Add a marker in Sydney and move the camera
        val UBS5 = LatLng(-6.8544129,-35.4904399)
        mMap!!.addMarker(MarkerOptions().position(UBS5).title("UBS SANTA TEREZINHA DR JOAO SOARES").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS5,2F))

        // Add a marker in Sydney and move the camera
        val UBS6 = LatLng(-6.8676928,-35.4869069)
        mMap!!.addMarker(MarkerOptions().position(UBS6).title("UBS CLOVIS BEZERRA NANA PORPINO").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS6,2F))

        // Add a marker in Sydney and move the camera
        val UBS7 = LatLng(-6.8478309,-35.4860596)
        mMap!!.addMarker(MarkerOptions().position(UBS7).title("UBS NACOES").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS7,2F))

        // Add a marker in Sydney and move the camera
        val UBS8 = LatLng(-6.86487,-35.4886238)
        mMap!!.addMarker(MarkerOptions().position(UBS8).title("UBS ASSIS CHATEAUBRIAND ANSELMO DE ARAUJO ALEXANDRE").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS8,2F))


        // Add a marker in Sydney and move the camera
        val UBS9 = LatLng(-6.8478309,-35.4860596)
        mMap!!.addMarker(MarkerOptions().position(UBS9).title("UBS JUA APARECIDA").snippet("TELEFONE (83) 3271-1483"))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS9,2F))



        // Add a marker in Sydney and move the camera
        val UBS10 = LatLng(-6.8536519,-35.4969027)
        mMap!!.addMarker(MarkerOptions().position(UBS10).title("UBS PRIMAVERA JOSEFA TOMAZ DE ARRUDA").snippet("TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS10,2F))


        // Add a marker in Sydney and move the camera
        val UBS11 = LatLng(-6.8547369,-35.4845014)
        mMap!!.addMarker(MarkerOptions().position(UBS11).title("UBS NORDESTE II FRANCISCO ARAUJO DO NASCIMENTO FILHO").snippet(
                "TELEFONE (S/N)"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS11,2F))


        // Add a marker in Sydney and move the camera
        val UBS12 = LatLng(-6.8618016,-35.4930715)
        mMap!!.addMarker(MarkerOptions().position(UBS12).title("UBS ROSARIO  GUSTAVO AMORIM DA COSTA ROSARIO").snippet(
                "TELEFONE (83) 32715944"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS12,2F))

        // Add a marker in Sydney and move the camera
        val UBS13 = LatLng(-6.8588535,-35.4902197)
        mMap!!.addMarker(MarkerOptions().position(UBS13).title("UBS SAO JOSE DR MILTON DE MOURA RESENDE").snippet("TELEFONE (83)32718913"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS13,2F))

        // Add a marker in Sydney and move the camera
        val UBS14 = LatLng(-6.8530997,-35.4853844)
        mMap!!.addMarker(MarkerOptions().position(UBS14).title("UBS NORDESTE I DR OSVALDO AZEVEDO").snippet("TELEFONE (83) 3271 5452"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS14,2F))

        // Add a marker in Sydney and move the camera
        val UBS15 = LatLng(-6.840428,-35.450800)
        mMap!!.addMarker(MarkerOptions().position(UBS15).title("UBS TANANDUBA DR ODACI S ROCHA").snippet("TELEFONE (83) 3271-1182"))

//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS15,2F))

        // Add a marker in Sydney and move the camera
        val UBS16 = LatLng(-6.8502967,-35.4998775)
        mMap!!.addMarker(MarkerOptions().position(UBS16).title("UBS CORDEIRO JOSE NICOLAU PESSOA").snippet("TELEFONE (83) 32718933"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS16,2F))


        // Add a marker in Sydney and move the camera
        val UBS17 = LatLng(-6.8491927,-35.4947553)
        mMap!!.addMarker(MarkerOptions().position(UBS17).title("SECRETARIA MUNICIPAL DE SAUDE DE GUARABIRA").snippet("TELEFONE (83) 32714813"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS17,2F))


        // Add a marker in Sydney and move the camera
        val UBS18 = LatLng(-6.8470989,-35.5026439)
        mMap!!.addMarker(MarkerOptions().position(UBS18).title("UBS ALTO DA BOA VISTA IRACEMA DA SILVA PONTES").snippet("TELEFONE (S/N"))
//        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS18,2F))
        

        // Add a marker in Sydney and move the camera
        val UBS19 = LatLng(-6.8578062,-35.485985)
        mMap!!.addMarker(MarkerOptions().position(UBS19).title("UBS ROSALVA LIMA DE FERIAS").snippet(
                "TELEFONE (S/N"))
       mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(UBS19,14F))


    }

}
