package com.wcc.lancedados

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.lanceDadosBotao).setOnClickListener{
            findViewById<TextView>(R.id.dado1).text = lancarDado().toString()
            findViewById<TextView>(R.id.dado2).text = lancarDado().toString()
        }
    }
    fun lancarDado(): Int{
        return (1..6).random()
    }
}