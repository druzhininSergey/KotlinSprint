package lesson_10

fun main() {
    var humanVictories = 0
    do {
        if (startGame() == 1) humanVictories++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln().capitalize() == "Да")
    println("Количество выигранных игр: $humanVictories")
}

fun startGame(): Int {
    var humanScore = 0
    println("Игрок бросает кубики")
    val humanRollDice = rollTheDice()
    println("Умная кофеварка бросает кубики ")
    val machineRollDice = rollTheDice()

    if (humanRollDice > machineRollDice) {
        humanScore++
        println("Победило человечество")
    } else if (humanRollDice < machineRollDice) println("Победила машина")
    else println("Ничья")
    return humanScore
}

fun rollTheDice(): Int {
    val dice = (1..6).random()
    println("Результат броска: $dice")
    return dice
}