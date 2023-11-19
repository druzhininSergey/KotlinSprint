package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023

fun main() {

    println("Введите Ваш год рождения:")
    val userYearOfBirth = readln().toIntOrNull()

    if (userYearOfBirth != null) {
        if (CURRENT_YEAR - userYearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
        else println("Доступ к контенту ограничен")
    }
    else println("Введите корректные данные")
}