package lesson_6

const val GREETING_AND_INSTRUCTIONS = "Привет! Чтобы выиграть эту игру, нужно угадать число от 1 до 9." +
        " У тебя 5 попыток, удачи!"

fun main() {

    val numberInGame = 1..9
    val randomNumber = numberInGame.random()
    var numbersOfAttempts = 5
    val failedAttemptMessages = listOf("Упс, мимо", "Неа", "Не угадал ха-ха", "Близко, но нет", "Не вышло...")
    println(GREETING_AND_INSTRUCTIONS)

    do {
        println("Введи число:")
        val userNumberChoice = readln().toIntOrNull()
        if (userNumberChoice != null && userNumberChoice == randomNumber)
            println("Ты выиграл! Это была великолепная игра!!!")
        else {
            println(failedAttemptMessages.random())
            println("У тебя осталось ${--numbersOfAttempts} попыток")
            if (numbersOfAttempts == 0) println("GAME OVER нужно было написать всего лишь число $randomNumber эх ты...")
        }
    } while (numbersOfAttempts > 0 && userNumberChoice != randomNumber)
}