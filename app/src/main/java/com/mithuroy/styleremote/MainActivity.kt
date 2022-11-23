package com.mithuroy.styleremote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // This is to check git
        // Another comment
    }

    override fun hashCode(): Int {
        val a = 10
        val b = 20
        return a + b
    }
}