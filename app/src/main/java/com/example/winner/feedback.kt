package com.example.winner

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.winner.databinding.ActivityFeedbackBinding
import com.example.winner.fragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_feedback.*
//class input_nama : AppCompatActivity() {
//
//    private lateinit var binding: ActivityInputNamaBinding
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityInputNamaBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.btmulaiInputnama.setOnClickListener {
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
//
//    }
//}

class feedback : AppCompatActivity() {

    private lateinit var binding: ActivityFeedbackBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val checkBox: CheckBox = findViewById(R.id.checkBox)
        button.setOnClickListener{checkBox.setBackgroundColor(Color.RED)}

        binding.button.setOnClickListener {

            val dilaogBinding = layoutInflater.inflate(R.layout.activity_dialog_feedback,null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dilaogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val yesbtn = dilaogBinding.findViewById<Button>(R.id.alert_yes)
            yesbtn.setOnClickListener{
                myDialog.dismiss()
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }


        }
        binding.closebutton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
