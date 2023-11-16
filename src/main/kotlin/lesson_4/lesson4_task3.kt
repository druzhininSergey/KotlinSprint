package lesson_4

fun main() {

    val sun = true
    val tartOpened = true
    val humidity = 20
    val season = "Не зима"

    val sunToday = true
    val tartOpenedToday = true
    val humidityToday = 20
    val seasonToday = "Зима"

    val conditionsForBeans = (sun == sunToday) && (tartOpened == tartOpenedToday) && (humidity == humidityToday) && (season == seasonToday)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsForBeans")

}

