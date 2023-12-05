package lesson_12

import kotlin.random.Random

class Weather5(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, _isRainy: Boolean) {
    val dayTemperatureCelsius = dayTemperatureKelvin - 273
    val nightTemperatureCelsius = nightTemperatureKelvin - 273
    val isRainy = _isRainy
}

fun List<Int>.calculateAverageTemperature(): Double {
    return (this.sum().toDouble() / this.size)
}

fun List<Boolean>.calculateRainyDays(): Int {
    return (this.count { it })
}

fun main() {
    val dayTemperatureRange = 300..308
    val nightTemperatureRange = 283..300

    val monthWeatherList = mutableListOf<Weather5>()
    val dayMonthTemperature = mutableListOf<Int>()
    val nightMonthTemperature = mutableListOf<Int>()
    val isRainyMonth = mutableListOf<Boolean>()

    for (i in 1..30) {
        val monthDailyWeather = Weather5(
            dayTemperatureKelvin = dayTemperatureRange.random(),
            nightTemperatureKelvin = nightTemperatureRange.random(), _isRainy = Random.nextBoolean()
        )
        monthWeatherList.add(monthDailyWeather)
    }

    for (i in monthWeatherList) {
        dayMonthTemperature.add(i.dayTemperatureCelsius)
        nightMonthTemperature.add(i.nightTemperatureCelsius)
        isRainyMonth.add(i.isRainy)
    }

    println("Средняя дневная температура в этом месяце: ${"%.1f".format(dayMonthTemperature.calculateAverageTemperature())}")
    println("Средняя ночная температура в этом месяце: ${"%.1f".format(nightMonthTemperature.calculateAverageTemperature())}")
    println("В этом месяце было ${isRainyMonth.calculateRainyDays()} дождливых дней")
}