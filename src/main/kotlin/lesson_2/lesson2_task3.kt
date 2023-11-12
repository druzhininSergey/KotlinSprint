package lesson_2

fun main () {

    val departureHours = 9
    val departureMinutes = 39
    val travelTime: Int = 457

    val travelTimeHours = travelTime / 60
    val travelTimeMinutes = travelTime % 60

    var arrivalHours = departureHours + travelTimeHours
    var arrivalMinutes = departureMinutes + travelTimeMinutes

    if (arrivalMinutes >= 60) {
        arrivalHours++
        arrivalMinutes -= 60
    }
    else arrivalMinutes

    println("$arrivalHours:$arrivalMinutes")
}