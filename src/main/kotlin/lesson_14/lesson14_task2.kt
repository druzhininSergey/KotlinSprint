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
        if (isLadderExtended) println("${shipName}: Горизонтальный трап выдвинут со шкафута.")
        else println("${shipName}: Горизонтальный трап собран в шкафут.")
    }
    open fun printLoadingMethodCondition() {
        if (isLadderExtended) println("${shipName}: Горизонтальный трап сейчас выдвинут со шкафута.")
        else println("${shipName}: Горизонтальный трап сейчас собран в шкафут.")
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
        if (isCraneActivated) println("${shipName}: Грузовой кран активирован")
        else println("${shipName}: Грузовой кран деактивирован")
    }

    override fun printLoadingMethodCondition() {
        if (isCraneActivated) println("${shipName}: Грузовой кран сейчас активирован")
        else println("${shipName}: Грузовой кран сейчас деактивирован")
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
        if (isGateOpened) println("${shipName}: Ворота со стороны кормы открыты")
        else println("${shipName}: Ворота со стороны кормы закрыты")
    }

    override fun printLoadingMethodCondition() {
        if (isGateOpened) println("${shipName}: В данный момент ворота со стороны кормы открыты")
        else println("${shipName}: В данный момент ворота со стороны кормы закрыты")
    }
}

fun main() {
    val cargoShip = CargoShip()
    val iceBreaker = IceBreaker()
    val liner = Liner2()

    cargoShip.printLoadingMethodCondition()
    iceBreaker.printLoadingMethodCondition()
    liner.printLoadingMethodCondition()
}