package com.example.laboratorio03diaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var cents10: ImageView
    private lateinit var cents5: ImageView
    private lateinit var cents25: ImageView
    private lateinit var dollar: ImageView
    private lateinit var money: TextView
    private var total = 0.00


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
    }

    private fun bind(){

        cents5 = findViewById(R.id.cents5)
        cents10 = findViewById(R.id.cents10)
        cents25 = findViewById(R.id.cents25)
        dollar = findViewById(R.id.dollar)
        money = findViewById(R.id.dinero)

        clearTextView()

        setListener()
    }


    private fun setListener(){
        cents5.setOnClickListener{
            total += 0.0
            val totalTwoDigits = String.format("%.2f", total).toFloat()

            money.text= "$" + totalTwoDigits.toString()
        }

        cents10.setOnClickListener{
            total += 0.10
            val totalTwoDigits = String.format("%.2f", total).toFloat()

            money.text= "$" + totalTwoDigits.toString()
        }

        cents25.setOnClickListener{
            total += 0.25
            val totalTwoDigits = String.format("%.2f", total).toFloat()

            money.text= "$" + totalTwoDigits.toString()
        }

        dollar.setOnClickListener{
            total += 1.00
            val totalTwoDigits = String.format("%.2f", total).toFloat()

            money.text= "$" + totalTwoDigits.toString()
        }
    }

    private fun clearTextView(){
        money.text = "$0"
    }

    //correccion

}