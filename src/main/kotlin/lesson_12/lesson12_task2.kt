package lesson_12

class Weather2(_dayTemperature: Int, _nightTemperature: Int, _isRainy: Boolean) {
    private var dayTemperature = _dayTemperature
    private var nightTemperature = _nightTemperature
    private var isRainy = _isRainy

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