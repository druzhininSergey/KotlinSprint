package lesson_16

class Player(
    private val playerName: String,
    private var healthPoints: Int,
    private var attackDamage: Int,
) {
    fun attack(enemy: Player) {
        enemy.takeDamage(attackDamage)
    }

    fun heal() {
        if (healthPoints > 0) {
            val healPoints = (healthPoints * 0.5).toInt()
            healthPoints += healPoints
            println("Лечение! Здоровье $playerName: $healthPoints")
        } else {
            println("Ты уже мертв, лечение не поможет...")
        }
    }

    private fun takeDamage(damage: Int) {
        healthPoints -= damage
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

    hero1.attack(hero2)
    hero2.attack(hero1)
    hero1.heal()
    hero2.attack(hero1)
    hero1.heal()
}
