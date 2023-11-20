package lesson_7

fun main() {

    println("Для запуска таймера введите время в секундах, чтобы начать отчет:")
    val userTimerSeconds = readln().toIntOrNull() ?: 0

    for (i in userTimerSeconds downTo 1) {
        println("Осталось $i секунд.")
        Thread.sleep(1000)
    }
    println("Время вышло")
}