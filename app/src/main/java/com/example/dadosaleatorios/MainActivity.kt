package com.example.dadosaleatorios

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button= findViewById(R.id.buttonRoll)
        val caraText: TextView= findViewById(R.id.textCara)
        val contadorText : TextView= findViewById(R.id.textContador)
        val dado1=Dice(6)
        var contador=0
        contadorText.textSize=30f


        rollButton.setOnClickListener{
            contador++
            caraText.text = dado1.roll().toString()
            contadorText.text="NUMBER ROLL: ${contador.toString()}"
            if (dado1.roll()>=4){
                Toast.makeText(this, "great", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "retry", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
class Dice(val side:Int){

    fun roll():Int{
        return (1..side).random()
    }
}