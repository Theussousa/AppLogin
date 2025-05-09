package com.app.applogin

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val gifView = findViewById<ImageView>(R.id.imageGif)

        Glide.with(this)
            .asGif()
            .load(R.drawable.gif)
            .into(gifView)
    }
}