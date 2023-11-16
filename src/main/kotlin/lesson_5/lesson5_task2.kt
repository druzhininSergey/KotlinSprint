package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023

fun main() {

    println("Введите Ваш год рождения:")
    val yearOfBirth = readln().toIntOrNull()

    val checkYear = if (CURRENT_YEAR - yearOfBirth!! >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Доступ к контенту ограничен"
    println(checkYear)
}