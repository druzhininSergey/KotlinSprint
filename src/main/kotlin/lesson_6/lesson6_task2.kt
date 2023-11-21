package lesson_6

fun main() {

    println("Для запуска таймера, введите время в секундах, чтобы начать отчет:")
    val userTimerSeconds = readln().toIntOrNull() ?: 0
    Thread.sleep(userTimerSeconds * 1000L)

    println("Прошло $userTimerSeconds секунд")
}