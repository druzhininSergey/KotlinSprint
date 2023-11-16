package lesson_5

const val NUMBER_TO_CHECK = 8

fun main() {

    println("Чему равно выражение 3+5?")
    val botIdentify = readln().toIntOrNull()

    if (botIdentify == NUMBER_TO_CHECK) println("Добро пожаловать")
    else println("Доступ запрещен")
}