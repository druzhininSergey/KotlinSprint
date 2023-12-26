package lesson_17

class Parcel(val parcelNumber: Int, currentLocation: String) {
    var movementsNumber = 0
    var currentLocation = currentLocation
        set(value) {
            movementsNumber++
            field = value
        }
}
fun main() {
    val parcel1 = Parcel(123, "Сортировочный центр")
    parcel1.currentLocation = "Новый пункт обработки"
    println("Местоположение посылки: ${parcel1.currentLocation}\nКоличество перемещений : ${parcel1.movementsNumber}")
}