package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity2 : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var pribadi: ImageView
    private lateinit var semua: ImageView
    private lateinit var profile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
        image = findViewById(R.id.image)
        pribadi = findViewById(R.id.pribadi)
        semua = findViewById(R.id.semua)
        profile = findViewById(R.id.profile)

        image.setOnClickListener {
            startActivity(Intent(this, formActivity2::class.java)) }
        pribadi.setOnClickListener {
            startActivity(Intent(this, formActivity2::class.java)) }
        semua.setOnClickListener {
            startActivity(Intent(this, formActivity2::class.java)) }
        profile.setOnClickListener {
            startActivity(Intent(this, profileActivity2::class.java)) }
        }
        }

