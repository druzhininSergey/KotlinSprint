package lesson_4

const val IS_SHIP_DAMAGED = false
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_BOXES = 50
const val IS_WEATHER_GOOD = true

fun main() {

    println("""Проверка состояния корабля. Введите: 
        |true - если у корабля имеются повреждения 
        |false - если повреждения отсутствуют""".trimMargin())
    val shipDamaged = readln().toBoolean()
    println(shipDamaged)

    println("Введите текущий состав экипажа:")
    val crewCheck = readln().toIntOrNull()
    println("Введите количество ящиков с провизией на борту:")
    val provisionCheck = readln().toIntOrNull()

    if (shipDamaged == IS_SHIP_DAMAGED) {
        val conditionForVoyage = (crewCheck in CREW_MIN..CREW_MAX) && (provisionCheck!! >= PROVISION_BOXES)
        println("Готовность корабля к путешествию: $conditionForVoyage")
    }
    else {
        println("Метеоусловия благоприятные? Введите true если благоприятные и false если неблагоприятные")
        val weatherCheck = readln().toBoolean()
        println(weatherCheck)
        val conditionForVoyage = (crewCheck in CREW_MIN..CREW_MAX) && (provisionCheck!! >= PROVISION_BOXES) && (weatherCheck == IS_WEATHER_GOOD)
        println("Готовность корабля к путешествию: $conditionForVoyage")
    }
}