package lesson_12

class Weather3(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, _isRainy: Boolean) {
    val dayTemperatureCelsius = dayTemperatureKelvin - 273
    val nightTemperatureCelsius = nightTemperatureKelvin - 273
    val isRainy = _isRainy

    fun printWeatherData() {
        println("Дневная температура: $dayTemperatureCelsius℃")
        println("Ночная температура: $nightTemperatureCelsius℃")
        if (!isRainy) println("Без осадков")
        else println("Наблюдались осадки")
    }
}

fun main() {
    val firstDay = Weather3(300, 295, true)
    firstDay.printWeatherData()
}