package lesson_4

fun main() {

    val shipIsNotDamaged = true
    val crew = 55..70
    val provisionBoxes = 50
    val weatherIsGood = true


    println("Проверка состояния корабля. Введите true если корабль не имеет повреждений и false если имеются поврежнения")
    val shipDamaged = readln().toBoolean()
    println(shipDamaged)

    if (shipDamaged == shipIsNotDamaged) {
        println("Введите текущий состав экипажа:")
        val crewCheck = readln().toIntOrNull()
        println("Введите количество ящиков с провизией на борту:")
        val provisionCheck = readln().toIntOrNull()
        val conditionForVoyage = (crewCheck in crew) && (provisionCheck!! >= provisionBoxes)
        println("Готовность корабля к путешествию: $conditionForVoyage")
    }
    else {println("Введите текущий состав экипажа:")
        val crewCheck = readln().toIntOrNull()
        println("Введите количество ящиков с провизией на борту:")
        val provisionCheck = readln().toIntOrNull()
        println("Метеоусловия благоприятные? Введите true если благоприятные и false если неблагоприятные")
        val weatherCheck = readln().toBoolean()
        println(weatherCheck)
        val conditionForVoyage = (crewCheck in crew) && (provisionCheck!! >= provisionBoxes) && (weatherCheck == weatherIsGood)
        println("Готовность корабля к путешествию: $conditionForVoyage")
    }
}