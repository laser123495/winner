package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.winner.databinding.ActivityTebakgambar1Binding
import com.example.winner.databinding.ActivityTebakgambarBinding

class tebakgambar1 : AppCompatActivity() {
    private lateinit var binding:ActivityTebakgambar1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebakgambar1)
        binding = ActivityTebakgambar1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setToolbar()
        binding.buttonbenar.setOnClickListener {
            val intent = Intent(this,tebakgambar2::class.java)
            startActivity(intent)
        }

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}
