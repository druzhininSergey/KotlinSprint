package lesson_7

fun main() {

    println("Введите число, до которого вам будет выдан список четных чисел, начиная с 0:")
    val userDigitForEvenCheck = readln().toIntOrNull() ?: 0

    for (i in 0..userDigitForEvenCheck step 2)
        println(i)
}