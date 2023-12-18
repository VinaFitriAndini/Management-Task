package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profileActivity2 : AppCompatActivity() {
    private lateinit var editprofile: Button
    private lateinit var edittugas: Button
    private lateinit var logout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        editprofile = findViewById(R.id.editprofile)
        edittugas = findViewById(R.id.edittugas)
        logout = findViewById(R.id.logout)

        edittugas.setOnClickListener {
            startActivity(Intent(this, formActivity2::class.java)) }
        logout.setOnClickListener {
            startActivity(Intent(this, SignIn_Activity2::class.java)) }
        }
        }