package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn_Activity2 : AppCompatActivity() {
    private lateinit var btnsign : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)
        btnsign = findViewById(R.id.btnsign)

        btnsign.setOnClickListener {
            startActivity(Intent(this, HomeActivity2::class.java))
        }
    }
}