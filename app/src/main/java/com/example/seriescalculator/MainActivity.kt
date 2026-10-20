package com.example.seriescalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
            // Логика будет позже
        }
    }
}