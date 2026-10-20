package com.example.seriescalculator

data class CalculationResult(
    val sum: Double,
    val lastTerm: Double,
    val iterations: Int
)

fun calculateSeries(epsilon: Double): CalculationResult {
    var sum = 0.0
    var n = 1.0
    var lastTerm = 1.0
    var iterations = 0

    lastTerm = 1.0 / (n * n);
    while (Math.abs(lastTerm) >= epsilon) {
        sum += lastTerm;
        iterations++;
        n++;
        lastTerm = 1.0 / (n * n); // Вычисляем следующее слагаемое для проверки на новой итерации
    }

    return CalculationResult(sum, lastTerm, iterations)
}