package com.example.test_layoutu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test_layoutu1.DB.DatabaseCreate.saveAssetsToDB
import com.example.test_layoutu1.DB.DatabaseHelper
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerlayout)
        val pasek = findViewById<androidx.appcompat.widget.Toolbar>(R.id.menu_rozwijane)
        setSupportActionBar(pasek)
        val widokglowny = findViewById<NavigationView>(R.id.nav_view)
        widokglowny.setNavigationItemSelectedListener(this)
        val przelacznik = ActionBarDrawerToggle(this, drawerLayout, pasek, R.string.rozwin_menu, R.string.zwin_menu)
        drawerLayout.addDrawerListener(przelacznik)
        przelacznik.syncState()

        if(savedInstanceState == null){
            zmienFragment(Fragment1())
            widokglowny.setCheckedItem(R.id.wybor1)
        }
    }

    override fun onNavigationItemSelected(wybor: MenuItem): Boolean {
        when(wybor.itemId){
            R.id.wybor1 -> zmienFragment(Fragment1())
            R.id.wybor2 -> zmienFragment(Fragment2())
            R.id.wybor3 -> zmienFragment(Fragment3())
            R.id.wybor4 -> zmienFragment(Fragment4())
            R.id.wybor5 -> zmienFragment(Fragment5())
            R.id.wybor6 -> zmienFragment(Fragment6())
            R.id.wybor7 -> zmienFragment(Fragment7())
            R.id.wybor8 -> zmienFragment(Fragment8())
            R.id.wybor9 -> zmienFragment(Fragment19())
            R.id.wybor10 -> zmienFragment(Fragment9())
            R.id.wybor11 -> zmienFragment(Fragment10())
            R.id.wybor12 -> zmienFragment(Fragment11())
            R.id.wybor13 -> zmienFragment(Fragment12())
            R.id.wybor14 -> zmienFragment(Fragment13())
            R.id.wybor15 -> zmienFragment(Fragment14())
            R.id.wybor16 -> zmienFragment(Fragment15())
            R.id.wybor17 -> zmienFragment(Fragment16())
            R.id.wybor18 -> zmienFragment(Fragment17())
            R.id.wybor19 -> zmienFragment(Fragment18())
            R.id.wybor20 -> zmienFragment(Fragment20())

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun zmienFragment(fragmentwybrany: Fragment){
        val zmiana: FragmentTransaction = supportFragmentManager.beginTransaction()
        zmiana.replace(R.id.fragment_container, fragmentwybrany)
        zmiana.commit()
    }
    val callback = object : OnBackPressedCallback(true)
    {
        override fun handleOnBackPressed()
        {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            {drawerLayout.closeDrawer(GravityCompat.START)}
        else
            {onBackPressedDispatcher.onBackPressed()}
        }
    }
}