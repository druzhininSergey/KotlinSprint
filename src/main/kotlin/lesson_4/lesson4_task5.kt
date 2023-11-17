package lesson_4

const val IS_SHIP_DAMAGED = false
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_BOXES = 50
const val IS_WEATHER_GOOD = true

fun main() {

    println("""
        |Проверка состояния корабля. Введите: 
        |true - если у корабля имеются повреждения 
        |false - если повреждения отсутствуют""".trimMargin()
    )
    val isShipDamagedNow = readln().toBoolean()
    println(isShipDamagedNow)
    println("Введите текущий состав экипажа:")
    val crewAmount = readln().toIntOrNull()
    println("Введите количество ящиков с провизией на борту:")
    val provisionAmount = readln().toIntOrNull()
    println("Метеоусловия благоприятные? Введите true если благоприятные и false если неблагоприятные")
    val isWeatherGoodNow = readln().toBoolean()
    println(isWeatherGoodNow)

    val isCrewAndProvisionReady = (crewAmount in CREW_MIN..CREW_MAX && provisionAmount!! >= PROVISION_BOXES)

    val isShipReadyForVoyage = (isShipDamagedNow == IS_SHIP_DAMAGED && isCrewAndProvisionReady) ||
            (isShipDamagedNow != IS_SHIP_DAMAGED && isCrewAndProvisionReady && isWeatherGoodNow == IS_WEATHER_GOOD)

    println("Готовность корабля к путешествию: $isShipReadyForVoyage")
}