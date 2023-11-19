package lesson_5

const val DOUGLAS_ADAMS_NUMBER = 42
const val FIBONACCI_SEQUENCE_NUMBER = 21
const val NUMBERS_IN_GAME = "Здравствуйте, напоминаем Вам, что в игре участвуют числа от 0 до 42."
const val LOST_MESSAGE = "Правильные числа были 42 и 21"

fun main() {

    println("$NUMBERS_IN_GAME\nКакое число у вас ассоциируется с именем Дуглас Адамс?")
    val userDouglasNumber = readln().toIntOrNull()
    println("Испытайте удачу, выберите любое число Фибоначчи")
    val userFibonacciNumber = readln().toIntOrNull()

    when {
        (userDouglasNumber == DOUGLAS_ADAMS_NUMBER && userFibonacciNumber == FIBONACCI_SEQUENCE_NUMBER)
                || (userDouglasNumber == FIBONACCI_SEQUENCE_NUMBER && userFibonacciNumber == DOUGLAS_ADAMS_NUMBER)
        -> println("Поздравляем, вы выиграли главный приз")

        (userDouglasNumber == DOUGLAS_ADAMS_NUMBER || userFibonacciNumber == FIBONACCI_SEQUENCE_NUMBER)
                || (userDouglasNumber == FIBONACCI_SEQUENCE_NUMBER || userFibonacciNumber == DOUGLAS_ADAMS_NUMBER)
        -> println("Вы выиграли утешительный приз. $LOST_MESSAGE")

        else -> println("Неудача. $LOST_MESSAGE")
    }
}