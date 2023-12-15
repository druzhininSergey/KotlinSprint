package lesson_16

class Player(
    private val playerName: String,
    private var healthPoints: Int,
    private var attackDamage: Int,
) {
    fun attackEnemy(enemy: Player): Any {
        enemy.healthPoints -= attackDamage
        if (enemy.healthPoints > 0) {
            println("Здоровье ${enemy.playerName}: ${enemy.healthPoints}")
            return enemy.healthPoints
        } else return enemyDead(enemy)
    }

    fun healMyself(): Int? {
        if (healthPoints > 0) {
            val healPoints = (healthPoints * 0.5).toInt()
            healthPoints += healPoints
            println("Лечение! Здоровье $playerName: $healthPoints")
            return healthPoints
        } else {
            println("Ты уже мертв, лечение не поможет...")
            return null
        }
    }

    private fun enemyDead(enemy: Player) {
        println("Игрок ${enemy.playerName} на помойке.")
        enemy.healthPoints = 0
        enemy.attackDamage = 0
    }
}

fun main() {
    val hero1 = Player("Ash", 400, 300)
    val hero2 = Player("Kalista", 516, 280)
    hero1.attackEnemy(hero2)
    hero2.attackEnemy(hero1)
    hero1.healMyself()
    hero2.attackEnemy(hero1)
    hero1.healMyself()
}