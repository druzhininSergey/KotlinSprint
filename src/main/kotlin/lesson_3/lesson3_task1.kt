package lesson_3

fun main () {

    val goodAfternoon = "Добрый день, "
    val goodEvening = "Добрый вечер, "

    val name = "Сергей."

    val dayGreeting = "$goodAfternoon$name"
    val eveningGreeting = "$goodEvening$name"

    println(dayGreeting)
    println(eveningGreeting)
}