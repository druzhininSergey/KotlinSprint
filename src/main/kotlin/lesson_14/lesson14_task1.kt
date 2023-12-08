package lesson_14

open class Ship(
    val shipName: String,
    val speed: Int,
    val loadCapacity: Int,
    val hasIceBreakingAbility: Boolean = false,
)

class CargoShip(
    shipName: String = "Грузовой корабль",
    speed: Int = 50,
    loadCapacity: Int = 500,
) : Ship(shipName, speed, loadCapacity)

class IceBreaker(
    shipName: String = "Ледокол",
    speed: Int = 40,
    loadCapacity: Int = 150,
    hasIceBreakingAbility: Boolean = true,
) : Ship(shipName, speed, loadCapacity, hasIceBreakingAbility)

class Liner(
    shipName: String = "Лайнер",
    speed: Int = 80,
    loadCapacity: Int = 200,
    val passengers: Int = 500,
) : Ship(shipName, speed, loadCapacity)

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner()
}