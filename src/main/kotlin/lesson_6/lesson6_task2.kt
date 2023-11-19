package lesson_6

fun main() {

    println("Для запуска таймера, введите время в секундах, чтобы начать отчет")
    var userTimerSeconds = readln().toIntOrNull()
    val firstUserValue = userTimerSeconds

    if (userTimerSeconds != null) {
        while (userTimerSeconds > 0) {
            userTimerSeconds--
            Thread.sleep(1000)
        }
        println("Прошло $firstUserValue секунд")
    } else println("Введены некорректные данные, попробуйте снова")
}