package com.example.seriescalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etEpsilon: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvSum: TextView
    private lateinit var tvLastTerm: TextView
    private lateinit var tvIterations: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEpsilon = findViewById(R.id.etEpsilon)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvSum = findViewById(R.id.tvSum)
        tvLastTerm = findViewById(R.id.tvLastTerm)
        tvIterations = findViewById(R.id.tvIterations)

        btnCalculate.setOnClickListener {
            val epsilonStr = etEpsilon.text.toString()

            if (epsilonStr.isEmpty()) {
                Toast.makeText(this, "Пожалуйста, введите значение epsilon", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try {
                val epsilon = epsilonStr.toDouble()
                if (epsilon <= 0) {
                    Toast.makeText(this, "Epsilon должно быть больше 0", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val result = calculateSeries(epsilon)

                tvSum.text = "Сумма: ${result.sum}"
                tvLastTerm.text = "Последнее слагаемое: ${result.lastTerm}"
                tvIterations.text = "Количество повторений цикла: ${result.iterations}"

            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Неверный формат числа", Toast.LENGTH_SHORT).show()
            }
        }
    }
}