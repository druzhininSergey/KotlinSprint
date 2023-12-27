package lesson_18

open class Dice {
    open fun rollDice() {}
}

class Dice4 : Dice() {
    private val diceRange = 1..4
    override fun rollDice() {
        println("Выпало число: ${diceRange.random()}")
    }
}

class Dice6 : Dice() {
    private val diceRange = 1..6
    override fun rollDice() {
        println("Выпало число: ${diceRange.random()}")
    }
}

class Dice8 : Dice() {
    private val diceRange = 1..8
    override fun rollDice() {
        println("Выпало число: ${diceRange.random()}")
    }
}

fun rollAllDice(diceList: List<Dice>) = diceList.forEach { it.rollDice() }

fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()
    val listOfDices = listOf(dice4, dice6, dice8)
    rollAllDice(listOfDices)
}
