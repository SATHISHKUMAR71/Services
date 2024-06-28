package com.example.services

import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class RunningServices:android.app.Service() {


    override fun onCreate() {
        super.onCreate()
        println("Service Created")
    }
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Thread{
//            Toast.makeText(this,"Service is Running in Background",Toast.LENGTH_SHORT).show()
            println("Service is running in background...")
        }.start()
//        while (true){}
//        return super.onStartCommand(intent, flags, startId)
            return START_STICKY
    }


    override fun onDestroy() {
        super.onDestroy()
//        Toast.makeText(this,"Service is Stopped",Toast.LENGTH_SHORT).show()
        println("Service is Destroyed")
    }

}