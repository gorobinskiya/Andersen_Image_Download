package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var image_button = findViewById<Button>(R.id.button)
        var image_holder = findViewById<ImageView>(R.id.imageView)
        var url_holder = findViewById<EditText>(R.id.editTextTextPersonName)

        image_button.setOnClickListener {

            var img_url = url_holder.text.toString()

            Glide.with(this)
                .load(img_url)
                .error(R.drawable.error)
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .into(image_holder)

        }
    }
}