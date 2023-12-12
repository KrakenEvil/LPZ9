package com.example.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomNumber()


    }
    fun showRandomNumber()
    {
        val random:Int = Random.nextInt(0,1000)
        var randomInt:Int = Random.nextInt(0, random)
        val textViewRandom: TextView = findViewById(R.id.textView_random2)
        val textViewLabel: TextView = findViewById(R.id.textView_label)

        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading, random)

        val ConstraintLayout: ConstraintLayout = findViewById(R.id.backgraund_root)
        ConstraintLayout.setBackgroundColor(resources.getColor(R.color.red))

    }
}