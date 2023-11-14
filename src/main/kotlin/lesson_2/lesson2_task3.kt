package lesson_2

const val MINUTES_IN_HOUR = 60
fun main () {

    val departureHours = 9
    val departureMinutes = 39
    val travelTime: Int = 457

    val travelTimeHours = travelTime / MINUTES_IN_HOUR
    val travelTimeMinutes = travelTime % MINUTES_IN_HOUR

    var arrivalHours = departureHours + travelTimeHours
    var arrivalMinutes = departureMinutes + travelTimeMinutes

    if (arrivalMinutes >= MINUTES_IN_HOUR) {
        arrivalHours++
        arrivalMinutes -= MINUTES_IN_HOUR
    }
    else arrivalMinutes

    println("$arrivalHours:$arrivalMinutes")
}