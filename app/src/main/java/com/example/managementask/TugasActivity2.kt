package com.example.managementask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TugasActivity2 : AppCompatActivity() {
    private lateinit var form: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas2)

        form = findViewById(R.id.form)

        form.setOnClickListener {
            startActivity(Intent(this, HomeActivity2::class.java)) }
        }
    }
