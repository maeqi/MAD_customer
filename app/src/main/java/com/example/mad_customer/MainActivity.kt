package com.example.mad_customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var CustomerPro:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomerPro = findViewById(R.id.CustomerPro)


        CustomerPro.setOnClickListener{
            val intent = Intent(this, customerProfile::class.java)

            startActivity(intent)

        }
        supportActionBar?.hide()


    }
}