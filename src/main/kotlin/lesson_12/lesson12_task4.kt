package lesson_12


class Weather4(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, _isRainy: Boolean) {
    val dayTemperatureCelsius = dayTemperatureKelvin - 273
    val nightTemperatureCelsius = nightTemperatureKelvin - 273
    var isRainy = _isRainy

    fun printWeatherData() {
        println("Дневная температура: $dayTemperatureCelsius℃")
        println("Ночная температура: $nightTemperatureCelsius℃")
        if (!isRainy) println("Без осадков")
        else println("Наблюдались осадки")
    }

    init {
        printWeatherData()
    }
}

fun main() {
    val firstDay = Weather4(300, 295, true)
}