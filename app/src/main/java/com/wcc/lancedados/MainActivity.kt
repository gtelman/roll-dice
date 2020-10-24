package com.wcc.lancedados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollDiceButton = findViewById<Button>(R.id.rollDiceButton)
        val dice1 = findViewById<ImageView>(R.id.dice1)
        val dice2 = findViewById<ImageView>(R.id.dice2)

        rollDiceButton.setOnClickListener {

            dice1.setImageResource(rollDice())
            dice2.setImageResource(rollDice())
        }

        val playerName = getIntent().getStringExtra("playerName")
        val playerNameTextView = findViewById<TextView>(R.id.playerNameText)
        playerNameTextView.text = "Hi, $playerName"
    }
    fun rollDice(): Int{
        return getDice(getNum())
    }
    fun getDice(value: Int):Int {
        return when(value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    fun getNum(): Int {
        return (1..6).random()
    }


}