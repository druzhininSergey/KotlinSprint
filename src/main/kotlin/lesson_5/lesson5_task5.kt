package lesson_5

const val GAME_RULES = "Здравствуйте, напоминаем Вам, что в игре участвуют только числа от 0 до 42 включительно"

fun main() {

    val numbersInLottery = 0..42
    val firstWinNumber = numbersInLottery.random()
    val secondWinNumber = numbersInLottery.random()
    val thirdWinNumber = numbersInLottery.random()
    val listOfWinNumber = listOf(firstWinNumber, secondWinNumber, thirdWinNumber)

    println(GAME_RULES)
    println()
    println("Введите первое число: ")
    val userFirstNumber = readln().toIntOrNull()
    println("Введите второе число: ")
    val userSecondNumber = readln().toIntOrNull()
    println("Введите третье число: ")
    val userThirdNumber = readln().toIntOrNull()
    val listOfUserNumber = listOf(userFirstNumber, userSecondNumber, userThirdNumber)

    val userIntersection = listOfUserNumber.intersect(listOfWinNumber)

    when (userIntersection.size) {
        3 -> println("Поздравляем, Вы угадали все числа! Вы выиграли джекпот.")
        2 -> println("Поздравляем, вы угадали два числа! Вы выиграли крупный приз.")
        1 -> println("Поздравляем, вы угадали одно числа! Вы выиграли утешительный приз.")
        0 -> println("К сожалению, удача отвернулась от вас.")
    }
    println("Числа для победы были: $listOfWinNumber")
}