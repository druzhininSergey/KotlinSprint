package lesson_5

fun main() {

    val firstNumberSum = 3
    val secondNumberSum = 5
    val sumResult = firstNumberSum + secondNumberSum

    println("Чему равно выражение $firstNumberSum + $secondNumberSum?")
    val userSumAnswer = readln().toIntOrNull()

    if (userSumAnswer == sumResult) println("Добро пожаловать")
    else println("Доступ запрещен")
}