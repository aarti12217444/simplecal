package com.example.simplecal


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    private lateinit var historyText: TextView

    private fun getInputs(): Pair<Double?, Double?> {
        val a = findViewById<EditText>(R.id.num1).text.toString().toDoubleOrNull()
        val b = findViewById<EditText>(R.id.num2).text.toString().toDoubleOrNull()
        return Pair(a, b)
    }

    private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    private fun lcm(a: Int, b: Int): Int = abs(a * b) / gcd(a, b)

    private fun showResult(result: String) {
        resultText.text = "Result: $result"
        historyText.append("\n$result")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.resultText)
        historyText = findViewById(R.id.historyText)

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null) showResult("$a + $b = ${a + b}")
        }

        findViewById<Button>(R.id.btnSub).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null) showResult("$a - $b = ${a - b}")
        }

        findViewById<Button>(R.id.btnMul).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null) showResult("$a × $b = ${a * b}")
        }

        findViewById<Button>(R.id.btnDiv).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null && b != 0.0)
                showResult("$a ÷ $b = ${a / b}")
            else resultText.text = "Cannot divide by zero"
        }

        findViewById<Button>(R.id.btnMod).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null && b != 0.0)
                showResult("$a % $b = ${a % b}")
        }

        findViewById<Button>(R.id.btnSquare).setOnClickListener {
            val a = findViewById<EditText>(R.id.num1).text.toString().toDoubleOrNull()
            if (a != null) showResult("$a² = ${a * a}")
        }

        findViewById<Button>(R.id.btnSqrt).setOnClickListener {
            val a = findViewById<EditText>(R.id.num1).text.toString().toDoubleOrNull()
            if (a != null && a >= 0)
                showResult("√$a = ${sqrt(a)}")
            else resultText.text = "Invalid input for √"
        }

        findViewById<Button>(R.id.btnLCM).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null)
                showResult("LCM($a, $b) = ${lcm(a.toInt(), b.toInt())}")
        }

        findViewById<Button>(R.id.btnHCF).setOnClickListener {
            val (a, b) = getInputs()
            if (a != null && b != null)
                showResult("HCF($a, $b) = ${gcd(a.toInt(), b.toInt())}")
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            findViewById<EditText>(R.id.num1).text.clear()
            findViewById<EditText>(R.id.num2).text.clear()
            resultText.text = "Result: "
            historyText.text = "History:\n"
        }
    }
}
