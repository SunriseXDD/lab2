package com.example.lab2

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import java.math.BigDecimal
import java.math.RoundingMode

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

private fun calculate (a: Double, n: Int): Pair<Double, List<String>>
{
    val steps = mutableListOf<String>()
    var sum = 0.0
    var denominator = 1.0

    for (k in 0..n) {
        if (k > 0) {
            denominator *= (a + k - 1)
        }
        val term = 1.0 / denominator
        sum += term

        // Запоминаем шаг для вывода
        steps.add("Шаг $k: 1/${if (k == 0) "1" else "%.2f".format(denominator)} = $term")
    }

    return Pair(sum, steps)
}


