package lesson_14

open class Ship(
    val speed: Int,
    val loadCapacity: Int,
    val hasIceBreakingAbility: Boolean = false,
)

class CargoShip(
    speed: Int = 50,
    loadCapacity: Int = 500,
) : Ship(speed, loadCapacity)

class IceBreaker(
    speed: Int = 40,
    loadCapacity: Int = 150,
    hasIceBreakingAbility: Boolean = true,
) : Ship(speed, loadCapacity, hasIceBreakingAbility)

class Liner(
    speed: Int = 80,
    loadCapacity: Int = 200,
    val passengers: Int = 500,
) : Ship(speed, loadCapacity)

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner()
}