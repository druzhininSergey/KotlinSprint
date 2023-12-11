package lesson_14

open class Liner(
    val shipName: String = "Лайнер",
    val speed: Int = 80,
    val loadCapacity: Int = 50,
    val passengers: Int = 500,
)

class CargoShip(
    shipName: String = "Грузовой корабль",
    speed: Int = 50,
    loadCapacity: Int = 500,
    passengers: Int = 80,
) : Liner (shipName, speed, loadCapacity, passengers)

class IceBreaker(
    shipName: String = "Ледокол",
    speed: Int = 40,
    loadCapacity: Int = 150,
    passengers: Int = 150,
    val hasIceBreakingAbility: Boolean = true,
) : Liner(shipName, speed, loadCapacity, passengers)

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner()
}