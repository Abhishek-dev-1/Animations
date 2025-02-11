package com.example.animations

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  lateinit  var imageview: ImageView
    private  lateinit  var btnblink: Button
    private  lateinit  var btnrotate: Button
    private  lateinit  var btnfade: Button
    private  lateinit  var btnmove: Button
    private  lateinit  var btnslide: Button
    private  lateinit  var btnzoom: Button
    private  lateinit  var btnstop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        imageview=findViewById(R.id.imageView)
        btnblink=findViewById(R.id.blink)
        btnrotate=findViewById(R.id.Rotate)
        btnfade=findViewById(R.id.Fade)
        btnmove=findViewById(R.id.Move)
        btnslide=findViewById(R.id.Slide)
        btnzoom=findViewById(R.id.Zoom)
        btnstop=findViewById(R.id.Stop)

        btnblink.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.blink)
            imageview.startAnimation(animation)
        }
        btnrotate.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.rotate)
            imageview.startAnimation(animation)
        }
        btnfade.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.fade)
            imageview.startAnimation(animation)
        }
        btnmove.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.move)
            imageview.startAnimation(animation)
        }
        btnslide.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.slide)
            imageview.startAnimation(animation)
        }
        btnzoom.setOnClickListener {
            val animation=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.zoom)
            imageview.startAnimation(animation)
        }
        btnstop.setOnClickListener {
            imageview.clearAnimation()
        }
    }
}