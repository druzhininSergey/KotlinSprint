package lesson_14

open class Ship2(
    val shipName: String,
    val speed: Int,
    val loadCapacity: Int,
    val loadingMethod: String,
    val hasIceBreakingAbility: Boolean = false,
) {
    fun printShipLoadingMethod() {
        println("Способ погрузки $shipName: $loadingMethod")
    }
}

class CargoShip2(
    shipName: String = "Грузовой корабль",
    speed: Int = 50,
    loadCapacity: Int = 500,
    loadingMethod: String = "Активация грузового крана.",
) : Ship2(shipName, speed, loadCapacity, loadingMethod)

class IceBreaker2(
    shipName: String = "Ледокол",
    speed: Int = 40,
    loadCapacity: Int = 150,
    loadingMethod: String = "Открывает ворота со стороны кормы.",
    hasIceBreakingAbility: Boolean = true,
) : Ship2(shipName, speed, loadCapacity, loadingMethod, hasIceBreakingAbility)

class Liner2(
    shipName: String = "Лайнер",
    speed: Int = 80,
    loadCapacity: Int = 200,
    loadingMethod: String = "Выдвигает горизонтальный трап со шкафута.",
    val passengers: Int = 500,
) : Ship2(shipName, speed, loadCapacity, loadingMethod)

fun main() {
    val cargoShip = CargoShip2().printShipLoadingMethod()
    val iceBreaker = IceBreaker2().printShipLoadingMethod()
    val liner = Liner2().printShipLoadingMethod()
}