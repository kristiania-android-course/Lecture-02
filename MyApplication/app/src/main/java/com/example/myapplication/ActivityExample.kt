package com.example.myapplication

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_example.*


class ActivityExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        setSupportActionBar(toolbar)

        this.title = getString(R.string.title)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_example, menu);

        return super.onCreateOptionsMenu(menu)
    }
}
