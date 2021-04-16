package com.example.mad_customer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class customerProfile : AppCompatActivity() {
    private lateinit var btnAddCustomer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_profile)

        btnAddCustomer = findViewById(R.id.btnAddCust)
        btnAddCustomer.setOnClickListener {
            val i = Intent(this, add_customer::class.java)
            startActivity(i)
        }
        supportActionBar?.hide()
    }
}