package lesson_16

class Player(
    private val playerName: String,
    private var healthPoints: Int,
    var attackDamage: Int,
) {
    fun heal() {
        if (healthPoints > 0) {
            val healPoints = (healthPoints * 0.5).toInt()
            healthPoints += healPoints
            println("Лечение! Здоровье $playerName: $healthPoints")
        } else {
            println("Ты уже мертв, лечение не поможет...")
        }
    }

    fun takeDamage(attack: Int) {
        healthPoints -= attack
        if (healthPoints <= 0) {
            die()
        } else {
            println("Здоровье $playerName: $healthPoints")
        }
    }

    private fun die() {
        println("Игрок $playerName на помойке.")
        healthPoints = 0
        attackDamage = 0
    }
}

fun main() {
    val hero1 = Player("Ash", 400, 300)
    val hero2 = Player("Kalista", 516, 280)

    hero2.takeDamage(hero1.attackDamage)
    hero1.takeDamage(hero2.attackDamage)
    hero1.heal()
    hero1.takeDamage(hero2.attackDamage)
    hero1.heal()
}
