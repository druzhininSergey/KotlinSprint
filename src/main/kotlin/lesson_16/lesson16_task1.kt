package lesson_16

class Dice(private val diceNumber: IntRange = 1..6){
    fun throwDice(): Int {
        val randomDiceNumber = diceNumber.random()
        println(randomDiceNumber)
        return randomDiceNumber
    }
}