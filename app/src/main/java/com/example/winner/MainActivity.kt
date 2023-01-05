package com.example.winner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.winner.fragments.HomeFragment
import com.example.winner.fragments.SettingsFragment
import com.example.winner.fragments.profileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val profileFragment = profileFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)
        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener{when(it.itemId){
            R.id.menut_utama -> makeCurrentFragment(homeFragment)
            R.id.menu_profil -> makeCurrentFragment(profileFragment)
            R.id.menu_settings -> makeCurrentFragment(settingsFragment)
        }
            true
        }

    }
    private fun  makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}