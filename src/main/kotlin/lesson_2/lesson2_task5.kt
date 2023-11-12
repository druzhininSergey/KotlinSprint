package lesson_2

import kotlin.math.pow

fun main() {

    val initialInvestmentAmount = 70000
    val annualRate = 0.167
    val paymentsPerYear = 12
    val yearsToPay = 20

    val newInvestmentAmount = initialInvestmentAmount * (1 + annualRate / paymentsPerYear).pow (paymentsPerYear * yearsToPay)

    println("%.3f".format(newInvestmentAmount))

}