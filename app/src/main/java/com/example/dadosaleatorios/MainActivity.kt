package com.example.dadosaleatorios

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button= findViewById(R.id.buttonRoll)
        val caraText: TextView= findViewById(R.id.textCara)
        val dado1=Dice(6)

        
        rollButton.setOnClickListener{

             caraText.text = dado1.roll().toString()
        }
    }


}


class Dice(val side:Int){

    fun roll():Int{
        return (1..side).random()
    }
}