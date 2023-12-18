package com.example.managementask

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class RegisterActivity : AppCompatActivity() {
    private lateinit var next_1 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        next_1 = findViewById(R.id.next_1)

        next_1.setOnClickListener {
            startActivity(Intent(this, SignIn_Activity2::class.java)) }

        }
    }
