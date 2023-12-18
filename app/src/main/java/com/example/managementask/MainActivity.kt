package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn2)
        btn1.setOnClickListener{
            startActivity(Intent(this, SignIn_Activity2::class.java))}
        btn2.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))}
        }
    }
