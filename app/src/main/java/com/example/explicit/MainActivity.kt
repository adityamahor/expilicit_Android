package com.example.explicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplicit = findViewById<Button>(R.id.button)

        btnExplicit.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}