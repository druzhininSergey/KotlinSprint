package lesson_15

abstract class WeatherStationStats
class Temperature(val temperature: Double) : WeatherStationStats()
class PrecipitationAmount(val precipitations: Double) : WeatherStationStats()

class WeatherServer() {
    val weatherData = mutableListOf<WeatherStationStats>()

    fun sendMessageToServer(data: WeatherStationStats): MutableList<WeatherStationStats>? {
        if (data is Temperature) {
            weatherData.add(data)
            println("Данные о температуре добавлены на сервер (${data.temperature} °C)")
            return weatherData
        } else if (data is PrecipitationAmount) {
            weatherData.add(data)
            println("Данные об осадках добавлены на сервер (${data.precipitations} мм.)")
            return weatherData
        } else {
            println("Неизвестный тип данных. Информация не добавлена")
            return null
        }
    }

    fun printWeatherData() {
        for (i in weatherData) {
            if (i is Temperature) println("Температура ${i.temperature} °C")
            else if (i is PrecipitationAmount) println("Осадки ${i.precipitations} мм")
        }
    }
}

fun main() {
    val weatherServer = WeatherServer()
    val temperature = Temperature(30.0)
    val precipitations = PrecipitationAmount(5.3)

    weatherServer.sendMessageToServer(temperature)
    weatherServer.sendMessageToServer(precipitations)
    weatherServer.printWeatherData()
}