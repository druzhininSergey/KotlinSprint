package lesson_17

class Ship {
    var name: String = "Алексей Чириков"
        set(value) {
            if (value != field) println("Нельзя менять имя корабля")
        }
    val averageSpeed = 7.7
    val homePort = "Санкт-Петербург"
}

fun main() {
    val ship = Ship()
    ship.name = "New name"
    println(ship.name)
}