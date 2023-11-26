package lesson_10

fun main() {
    println("Игрок бросает кубики")
    val humanResultOfRolling = rollDice()
    println("Умная кофеварка бросает кубики")
    val machineResultOfRolling = rollDice()

    if (humanResultOfRolling == machineResultOfRolling) println("Ничья")
    else if (humanResultOfRolling > machineResultOfRolling) println("Победило человечество")
    else println("Победила машина")
}

fun rollDice(): Int {
    val dice = (1..6).random()
    println("Результат броска: $dice")
    return dice
}
