package com.example.dadosaleatorios

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val contadorText : TextView= findViewById(R.id.textContador)
        val diceImage: ImageView= findViewById(R.id.imageDiceView)
        val dado1=Dice(6)
        var contador=0
        var valorRoll:Int


        contadorText.text="NUMBER ROLLs: "
        contadorText.textSize=30f


        rollButton.setOnClickListener{
            contador++
            valorRoll=dado1.roll()

            contadorText.text="NUMBER ROLLs: ${contador.toString()}"

            dado1.cambiarImagen(diceImage, valorRoll)

            mostrarMensaje(valorRoll,6)


        }
    }
fun mostrarMensaje( sideDice:Int, winCondition: Int){
    when(sideDice){
        winCondition-> Toast.makeText(this,"GREAAAAT, WIN CHICKEN DINNER", Toast.LENGTH_SHORT).show()
        1-> Toast.makeText(this,"LOSEE, ROLL DOWN", Toast.LENGTH_SHORT).show()
        2-> Toast.makeText(this,"LOSEE, ROLL DOWN", Toast.LENGTH_SHORT).show()
        3-> Toast.makeText(this,"LOSEE, ROLL DOWN", Toast.LENGTH_SHORT).show()
        4-> Toast.makeText(this,"LOSEE, ROLL DOWN", Toast.LENGTH_SHORT).show()
        5-> Toast.makeText(this,"LOSEE, ROLL DOWN", Toast.LENGTH_SHORT).show()


    }
}
}
class Dice(val sides:Int){

    fun roll():Int{ return(1..sides).random() }

    fun cambiarImagen(imagen: ImageView, sideDice: Int){

        when(sideDice){
            1->imagen.setImageResource(R.drawable.dice_1)
            2->imagen.setImageResource(R.drawable.dice_2)
            3->imagen.setImageResource(R.drawable.dice_3)
            4->imagen.setImageResource(R.drawable.dice_4)
            5->imagen.setImageResource(R.drawable.dice_5)
            6->imagen.setImageResource(R.drawable.dice_6)
        }
    }


}