package com.example.winner

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.example.winner.databinding.ActivityFeedbackBinding
import com.example.winner.databinding.ActivityTebakgambarBinding

class tebakgambar : AppCompatActivity() {
    private lateinit var binding:ActivityTebakgambarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTebakgambarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton2.setOnClickListener {

            val dilaogBinding = layoutInflater.inflate(R.layout.activity_dialog_gembok,null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dilaogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val yesbtn = dilaogBinding.findViewById<Button>(R.id.alert_yes)
            yesbtn.setOnClickListener{
                myDialog.dismiss()

            }
            Handler().postDelayed({
                myDialog.dismiss()
            },3000)

        }

        setToolbar()
        binding.ch1.setOnClickListener {
            val intent = Intent(this,tebakgambar1::class.java)
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