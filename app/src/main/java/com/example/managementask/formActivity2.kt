package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class formActivity2 : AppCompatActivity() {
    private lateinit var create1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)
        create1 = findViewById(R.id.create1)
        create1.setOnClickListener {
            startActivity(Intent(this, TugasActivity2::class.java)) }
        }
    }
