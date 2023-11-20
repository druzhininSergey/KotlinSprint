package lesson_6

fun main() {

    println("Для запуска таймера, введите время в секундах, чтобы начать отчет")
    var userTimerSeconds = readln().toIntOrNull()

    if (userTimerSeconds != null) {
        while (userTimerSeconds > 0) {
            println("Осталось секунд: ${userTimerSeconds--}")
            Thread.sleep(1000)
        }
        println("Время вышло")
    } else println("Введен некорректный символ, попробуйте снова")
}