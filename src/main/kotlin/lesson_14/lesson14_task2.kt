package lesson_14

open class Liner2(
    val shipName: String = "Лайнер",
    val speed: Int = 80,
    val loadCapacity: Int = 50,
    val passengers: Int = 500,
    var isLadderExtended: Boolean = false,
) {
    open fun toggleLoadingMethod() {
        isLadderExtended = !isLadderExtended
        if (isLadderExtended) println("Горизонтальный трап выдвинут со шкафута.")
        else println("Горизонтальный трап собран в шкафут.")
    }
}

class CargoShip(
    shipName: String = "Грузовой корабль",
    speed: Int = 50,
    loadCapacity: Int = 500,
    passengers: Int = 80,
    var isCraneActivated: Boolean = false,
) : Liner2(shipName, speed, loadCapacity, passengers) {

    override fun toggleLoadingMethod() {
        isCraneActivated = !isCraneActivated
        if (isCraneActivated) println("Грузовой кран активирован")
        else println("Грузовой кран деактивирован")
    }
}

class IceBreaker(
    shipName: String = "Ледокол",
    speed: Int = 40,
    loadCapacity: Int = 150,
    passengers: Int = 150,
    var isGateOpened: Boolean = false,
    val hasIceBreakingAbility: Boolean = true,
) : Liner2(shipName, speed, loadCapacity, passengers) {

    override fun toggleLoadingMethod() {
        isGateOpened = !isGateOpened
        if (isGateOpened) println("Ворота со стороны кормы открыты")
        else println("Ворота со стороны кормы закрыты")
    }
}

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner2()

    cargoShip.toggleLoadingMethod()
    iceBreaker.toggleLoadingMethod()
    liner.toggleLoadingMethod()
}