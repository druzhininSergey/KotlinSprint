package lesson_18

abstract class Dice {
    abstract val diceRange: IntRange
    fun rollDice() {
        println("Выпало число: ${diceRange.random()}")
    }
}

class Dice4 : Dice() {
    override val diceRange = 1..4
}

class Dice6 : Dice() {
    override val diceRange = 1..6
}

class Dice8 : Dice() {
    override val diceRange = 1..8
}

fun rollAllDice(diceList: List<Dice>) = diceList.forEach { it.rollDice()}

fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()
    val listOfDices = listOf(dice4, dice6, dice8)
    rollAllDice(listOfDices)
}
