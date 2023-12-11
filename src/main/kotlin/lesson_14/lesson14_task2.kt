package lesson_14

open class Liner2(
    val shipName: String = "Лайнер",
    val speed: Int = 80,
    val loadCapacity: Int = 50,
    val passengers: Int = 500,
    val loadingMethod: String = "Выдвигает горизонтальный трап со шкафута.",
) {
    fun printShipLoadingMethod() {
        println("Способ погрузки $shipName: $loadingMethod")
    }
}

class CargoShip(
    shipName: String = "Грузовой корабль",
    speed: Int = 50,
    loadCapacity: Int = 500,
    passengers: Int = 80,
    loadingMethod: String = "Активация грузового крана.",
) : Liner2(shipName, speed, loadCapacity, passengers, loadingMethod)

class IceBreaker(
    shipName: String = "Ледокол",
    speed: Int = 40,
    loadCapacity: Int = 150,
    passengers: Int = 150,
    loadingMethod: String = "Открывает ворота со стороны кормы.",
    val hasIceBreakingAbility: Boolean = true,
) : Liner2(shipName, speed, loadCapacity, passengers, loadingMethod)

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner2()
}