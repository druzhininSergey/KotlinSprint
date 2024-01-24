package lesson_20

const val HEALING_POTION = 20

class Gamer(
    val gamerName: String,
    var currentHealthPoints: Int,
    val maxHealthPoints: Int,
)

fun main() {
    val pickUpHealthPotion: (Gamer, Int) -> Unit = { gamer: Gamer, healingPotion: Int ->
        gamer.currentHealthPoints += healingPotion
        if (gamer.currentHealthPoints > gamer.maxHealthPoints) {
            gamer.currentHealthPoints = gamer.maxHealthPoints
        }
    }

    val gamer = Gamer("Sage", 50, 60)
    println("Текущее здоровье ${gamer.gamerName}: ${gamer.currentHealthPoints} единиц")
    pickUpHealthPotion(gamer, HEALING_POTION)
    println("Текущее здоровье ${gamer.gamerName}: ${gamer.currentHealthPoints} единиц")
}