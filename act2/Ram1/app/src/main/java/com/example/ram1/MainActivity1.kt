package com.example.ram1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main1.*

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        button3.setOnClickListener{
           // var un=editTextTextPersonName.text.toString()
            Toast.makeText(this,"LOGIN BUTTON CLICKED", Toast.LENGTH_LONG).show()
           // editTextTextPersonName.setText(un)
            var myIntent= Intent(this,MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}