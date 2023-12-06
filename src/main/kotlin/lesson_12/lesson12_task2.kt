package lesson_12

class Weather2(val dayTemperature: Int, val nightTemperature: Int, val isRainy: Boolean) {

    fun printWeatherData() {
        println("Дневная температура: $dayTemperature℃")
        println("Ночная температура: $nightTemperature℃")
        if (!isRainy) println("Без осадков")
        else println("Наблюдались осадки")
    }
}

fun main() {
    val firstDay = Weather2(23, 19, true)
    firstDay.printWeatherData()
}