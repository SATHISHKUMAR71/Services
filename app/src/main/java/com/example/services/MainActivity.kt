package com.example.services

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    private val service= A
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    println("Main Thread id: ${Thread.currentThread().id}")
        val startBtn = findViewById<Button>(R.id.button)
        val stopBtn = findViewById<Button>(R.id.button2)
        val appService = Intent(this,RunningServices::class.java)
        startBtn.setOnClickListener{
            startService(appService)
        }
        stopBtn.setOnClickListener{
//            Intent(this,RunningServices::class.java).also {
//                stopService(it)
//            }
            this.stopService(appService)
//            stopService(appService)
        }
    }
}
