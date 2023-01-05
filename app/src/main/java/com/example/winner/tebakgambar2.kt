package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.winner.databinding.ActivityFinishBinding
import com.example.winner.databinding.ActivityTebakgambar2Binding
import com.example.winner.databinding.ActivityTebakgambarBinding

class tebakgambar2 : AppCompatActivity() {
    private lateinit var binding: ActivityTebakgambar2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTebakgambar2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setToolbar()
        binding.button7.setOnClickListener {
            val intent = Intent(this,finish::class.java)
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