package com.example.central.projeto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.central.projeto.adapter.MyAdapter
import com.example.central.projeto.models.evento
import kotlinx.android.synthetic.main.activity_recycle.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        rvEventos.setHasFixedSize(true)
        rvEventos.layoutManager = LinearLayoutManager(this)

        val eventos:ArrayList<evento> = ArrayList<evento>()
        for(i in 0..100){
            eventos.add(evento("Event ${i}",
                    "Event ${i} about XYZ${i}",
                    "Location: ${i}", "Hour: ${i}"))
        }

        val mAdapter: RecyclerView.Adapter<*> = MyAdapter(this@MainActivity, eventos){
            Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT).show()
        }
        rvEventos.adapter = mAdapter




        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_calendario) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://portalsaude.saude.gov.br/index.php/cidadao/entenda-o-sus")))
//            var i = Intent(this@MainActivity, Calendario::class.java)
//            startActivity(i)
//           <--- esse metodo do var para baixo vai para outra tela

        } else if (id == R.id.nav_injecao) {
            var i = Intent(this@MainActivity, injecao::class.java)
            startActivity(i)

        } else if (id == R.id.nav_medico) {
            var i = Intent(this@MainActivity, Medico::class.java)
            startActivity(i)
        } else if (id == R.id.nav_vacina) {
            var i = Intent(this@MainActivity, vacinasanimal::class.java)
            startActivity(i)
        } else if (id == R.id.nav_compartilhar) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")))


//        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_psf) {
            var i = Intent(this@MainActivity, localizacao::class.java)
            startActivity(i)

        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
