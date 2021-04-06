package com.example.ram1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button.setOnClickListener{

            Toast.makeText(this,"BUTTON CLICKED",Toast.LENGTH_LONG).show()

            var myIntent= Intent(this,MainActivity1::class.java)
            startActivity(myIntent)
        }
    }

}