package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var dice : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button Defined
        val b1 = findViewById<Button>(R.id.roll_button)
        dice = findViewById<ImageView>(R.id.dice_image)
        b1.setOnClickListener{
            Toast.makeText(applicationContext,"Rolling",Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }
     //function to rollDice
     fun rollDice() {
         var random = Random().nextInt(6)+1
         var current = when(random){
             1->R.drawable.dice_1

             2->R.drawable.dice_2
             3->R.drawable.dice_3
             4->R.drawable.dice_4
             5->R.drawable.dice_5
             6->R.drawable.dice_6
             else ->R.drawable.empty_dice
         }
         dice.setImageResource(current)
    }
}