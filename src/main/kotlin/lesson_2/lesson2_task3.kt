package lesson_2

const val minutesInHour = 60
fun main () {

    val departureHours = 9
    val departureMinutes = 39
    val travelTime: Int = 457

    val travelTimeHours = travelTime / minutesInHour
    val travelTimeMinutes = travelTime % minutesInHour

    var arrivalHours = departureHours + travelTimeHours
    var arrivalMinutes = departureMinutes + travelTimeMinutes

    if (arrivalMinutes >= minutesInHour) {
        arrivalHours++
        arrivalMinutes -= minutesInHour
    }
    else arrivalMinutes

    println("$arrivalHours:$arrivalMinutes")
}