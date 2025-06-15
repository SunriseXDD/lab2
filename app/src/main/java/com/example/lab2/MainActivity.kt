package com.example.lab2

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val button = findViewById<Button>(R.id.button)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        button.setOnClickListener {
            val a = editText1.text.toString().toDouble()
            val n = editText2.text.toString().toInt()

            val (result, steps) = calculate(a, n)
        }
        }
    }

private fun calculate (a: Double, n: Int): Pair<BigDecimal, List<String>>
{

}


