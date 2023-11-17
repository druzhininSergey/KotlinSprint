package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023

fun main() {

    println("Введите Ваш год рождения:")
    val userYearOfBirth = readln().toIntOrNull()

    val userAgeVerification = if (CURRENT_YEAR - userYearOfBirth!! >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Доступ к контенту ограничен"
    println(userAgeVerification)
}