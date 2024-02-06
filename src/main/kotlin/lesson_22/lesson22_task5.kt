package lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val date: LocalDateTime,
    val distanceToEarthInLightYears: Double,
){
    fun printInfo() {
        println( "Название места: ${component1()}")
        println( "Описание места: ${component2()}")
        println( "Дата и время: ${component3()}")
        println( "Расстояние до земли в световых годах: ${component4()}")
    }
}
fun main() {

    val alphaCentauri = GalacticGuide(
        nameOfPlaceOrEvent = "Альфа Центавра",
        descriptionOfPlaceOrEvent = "Ближайшая к Земле звездная система",
        date = LocalDateTime.now(),
        distanceToEarthInLightYears = 4.4
    )
    alphaCentauri.printInfo()
}