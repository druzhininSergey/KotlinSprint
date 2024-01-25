package lesson_21

class Gamer1(
    val gamerName: String,
    var currentHealthPoints: Int,
    val maxHealthPoints: Int,
)

fun Gamer1.isHealthy(): Boolean = this.currentHealthPoints == this.maxHealthPoints

fun main() {
    val gamer1 = Gamer1("Omen", 20, 60)
    val gamer2 = Gamer1("Astra", 60, 60)

    println(gamer1.isHealthy())
    println(gamer2.isHealthy())
}