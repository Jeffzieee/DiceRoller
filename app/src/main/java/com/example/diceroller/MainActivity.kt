package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button Defined
        val b1 = findViewById<Button>(R.id.roll_button)
        b1.setOnClickListener{
            Toast.makeText(applicationContext,"Rolling",Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    open fun rollDice() {
      val t1 = findViewById<TextView>(R.id.result_text)
        var random = Random().nextInt(6) + 1
        t1.text=random.toString()
    }
}