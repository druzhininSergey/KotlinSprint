package lesson_4

const val isSunny = true
const val isAwningOpen = true
const val humidity = 20
const val seasonForBeans = "Зима"

fun main() {

    val isSunnyToday = true
    val isAwningOpenToday = true
    val humidityToday = 20
    val seasonToday = "Зима"

    val conditionsForBeans = (isSunny == isSunnyToday) && (isAwningOpen == isAwningOpenToday) && (humidity == humidityToday) && (seasonForBeans != seasonToday)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsForBeans")

}

