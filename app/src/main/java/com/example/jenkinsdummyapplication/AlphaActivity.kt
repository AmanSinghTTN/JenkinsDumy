package com.example.jenkinsdummyapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlphaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)
        Toast.makeText(this, "This is alpha activity", Toast.LENGTH_SHORT).show()
    }
}