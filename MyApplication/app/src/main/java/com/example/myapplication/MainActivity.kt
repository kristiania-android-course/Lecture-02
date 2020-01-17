package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<View>(R.id.textView1)

        view.setOnClickListener {

            Toast.makeText(this@MainActivity, R.string.my_message, Toast.LENGTH_SHORT).show()
        }
    }
}