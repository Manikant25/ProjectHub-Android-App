package com.mani.projecthub

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val backgroundExecutor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
//        Handler().postDelayed({ #Depricated
//            startActivity(Intent(this,introActivity::class.java))
//            finish()
//        },2500)
        // Execute a task in the background thread after 3 seconds.
        backgroundExecutor.schedule({
            // Your code logic goes here
            startActivity(Intent(this,introActivity::class.java))
            finish()
        }, 3, TimeUnit.SECONDS)
    }
}