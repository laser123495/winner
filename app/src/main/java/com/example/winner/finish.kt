package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.winner.databinding.ActivityFeedbackBinding
import com.example.winner.databinding.ActivityFinishBinding
import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*

class finish : AppCompatActivity() {
    private lateinit var binding: ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        button7.setOnClickListener(this)

        binding.buttonLanjut.setOnClickListener {
            val intent = Intent(this,tebakgambar::class.java)
            startActivity(intent)
        }
        binding.buttonQuit.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
//        binding.buttonulang.setOnClickListener {
//            val intent = Intent(this,tebakgambar::class.java)
//            startActivity(intent)
//        }


    }


}