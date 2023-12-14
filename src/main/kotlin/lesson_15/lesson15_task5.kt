package lesson_15

interface Movable {
    fun startEngine() = println("Запустить двигатель")
    fun startDriving() = println("Начать движение")
    fun stopDriving() = println("Остановить движение")
    fun turnRight() = println("Повернуть направо")
    fun turLeft() = println("Повернуть налево")
}

interface PassengersTransportation {
    val maxPassengers: Int

    fun pickUpPassengers(numberOfPassengers: Int): Int {
        if (numberOfPassengers > maxPassengers) {
            val passengersLeft = numberOfPassengers - maxPassengers
            println("$maxPassengers Пассажиров принято.\nОсталось $passengersLeft пассажиров")
            return passengersLeft
        } else {
            val noOneLeft = 0
            println("Все пассажиры ($numberOfPassengers) были приняты.")
            return noOneLeft
        }
    }

    fun dropOffPassengers() = println("Высадить пассажиров")
}

interface CargoTransportation {
    val maxCargoWeight: Double

    fun loadCargoInCar(cargoWeight: Double): Double {
        if (cargoWeight > maxCargoWeight) {
            val cargoLeft = cargoWeight - maxCargoWeight
            println("$maxCargoWeight тонн принято.\nОсталось $cargoLeft тонн")
            return cargoLeft
        } else {
            val noCargoLeft = 0.0
            println("Весь груз ($cargoWeight тонн) был принят.")
            return noCargoLeft
        }
    }

    fun unloadCargoFromCar() = println("Разгрузить автомобиль")
}

open class Car(val carName: String) : Movable

class PassengerClass(
    carName: String,
    override val maxPassengers: Int,
) : Car(carName), PassengersTransportation

class Truck(
    carName: String,
    override val maxPassengers: Int,
    override val maxCargoWeight: Double,
) : Car(carName), PassengersTransportation, CargoTransportation

fun main() {
    val passengerCar = PassengerClass("Копейка", 3)
    val passengerCar2 = PassengerClass("Волга", 3)
    val truck = Truck("Кибер Трак", 1, 2.0)

    var allPassengers = 6
    var allCargoWeight = 2.0
    allPassengers = truck.pickUpPassengers(allPassengers)
    allCargoWeight = truck.loadCargoInCar(allCargoWeight)
    allPassengers = passengerCar.pickUpPassengers(allPassengers)
    allPassengers = passengerCar2.pickUpPassengers(allPassengers)

}