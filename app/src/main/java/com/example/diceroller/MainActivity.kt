package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }

    }

    private fun doLuckyNum() {
        val myFirstDice = Dice(8)
        val rollResult = myFirstDice.roll()
        //println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")

        val luckyNum = 4
//        if (rollResult == luckyNum) {
//            println("You win!")
//        } else if (rollResult == 1) {
//            println("So sorry! You rolled a 1. Try again!")
//        } else if (rollResult == 2) {
//            println("Sadly, you rolled a 2. Try again!")
//        } else if (rollResult == 3) {
//            println("Unfortunately, you rolled a 3. Try again!")
//        } else if (rollResult == 5) {
//            println("Don't cry! You rolled a 5. Try again!")
//        } else {
//            println("Apologies! You rolled a 6. Try again!")
//        }

        when (rollResult) {
            luckyNum -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! You rolled a 6. Try again!")
            else -> println("HI")
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollVal: Int = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_1)
        //val resultTextView: TextView = findViewById(R.id.imageView)
        //resultTextView.text = rollVal.toString()
    }
}