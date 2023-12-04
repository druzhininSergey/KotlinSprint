package lesson_12

class Weather() {
    var dayTemperature = 0
    var nightTemperature = 0
    var isRainy = false

    fun printWeatherData() {
        println("Дневная температура: $dayTemperature℃")
        println("Ночная температура: $nightTemperature℃")
        if (!isRainy) println("Без осадков")
        else println("Наблюдались осадки")
    }
}
fun main() {
    val firstDay = Weather()
    firstDay.dayTemperature = 31
    firstDay.nightTemperature = 21

    val secondDay = Weather()
    secondDay.dayTemperature = 28
    secondDay.nightTemperature = 20
    secondDay.isRainy = true

    firstDay.printWeatherData()
    secondDay.printWeatherData()
}