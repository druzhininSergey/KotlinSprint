package lesson_20

class Player(
    val playerName: String,
    var hasKey: Boolean = false,
) {
    fun collectKey() {
        hasKey = true
    }

    fun useKey() {
        hasKey = false
    }
}

fun main() {
    val isKeyFound = { player: Player ->
        if (player.hasKey) {
            player.useKey()
            println("Игрок открыл дверь")
        } else println("Дверь заперта")
    }
    val player = Player("Jett")
    isKeyFound(player)
    player.collectKey()
    isKeyFound(player)
    isKeyFound(player)
}