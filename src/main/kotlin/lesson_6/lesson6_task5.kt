package lesson_6

fun main() {

    val numbersForTest = 1..9
    var attemptsAmount = 3
    println("Пожалуйста, пройдите проверку, чтобы мы убедились, что вы не человек.")

    do {
        val firstRandomNumber = numbersForTest.random()
        val secondRandomNumber = numbersForTest.random()
        val sumAnswerForTest = firstRandomNumber + secondRandomNumber
        println("Чему равна сумма чисел $firstRandomNumber и $secondRandomNumber")
        println("Введите результат:")
        val userTestAnswer = readln().toIntOrNull()

        if (userTestAnswer != null && userTestAnswer == sumAnswerForTest) println("Добро пожаловать!")
        else {
            attemptsAmount--
            println("Результат сложения неверный, попробуйте снова. Осталось попыток: $attemptsAmount")
            if (attemptsAmount == 0) println("Доступ запрещен")
        }
    } while (attemptsAmount > 0 && userTestAnswer != sumAnswerForTest)
}