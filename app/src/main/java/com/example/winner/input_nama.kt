package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import com.example.winner.databinding.ActivityInputNamaBinding
import com.example.winner.fragments.profileFragment


class input_nama : AppCompatActivity() {

    private lateinit var binding: ActivityInputNamaBinding
    private lateinit var button: Button
    private lateinit var sendText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputNamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = findViewById(R.id.btmulai_inputnama)
        sendText = findViewById(R.id.textinputedittext)

//        button.setOnClickListener{
//            val fragment = profileFragment()
//            val bundle = Bundle()
//            bundle.putString("string",sendText.text.toString())
//            fragment.arguments = bundle
//            supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment)
//                .commit()
//        }

        binding.btmulaiInputnama.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.lewati.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}