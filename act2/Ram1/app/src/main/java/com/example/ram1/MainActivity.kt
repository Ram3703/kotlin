package com.example.ram1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener{
            var un=editTextTextPersonName3.text.toString()
            Toast.makeText(this,"LOGIN BUTTON CLICKED",Toast.LENGTH_LONG).show()
            editTextTextPersonName3.setText(un)
            var myIntent= Intent(this,MainActivity2::class.java)
            startActivity(myIntent)
        }
    }
}