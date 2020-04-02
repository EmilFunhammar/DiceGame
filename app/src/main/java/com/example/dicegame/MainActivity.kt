package com.example.dicegame

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var imageView : ImageView
    val numbers = (0..9).toList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.imageSpot)
    }

    fun rollDice(view : View){
        val rnds = (1..6).random()
       
        when (rnds){
            1 -> imageView.setImageResource(R.drawable.dice1)
            2 -> imageView.setImageResource(R.drawable.dice2)
            3 -> imageView.setImageResource(R.drawable.dice3)
            4 -> imageView.setImageResource(R.drawable.dice4)
            5 -> imageView.setImageResource(R.drawable.dice5)
            6 -> imageView.setImageResource(R.drawable.dice6)
        }
    }
}
