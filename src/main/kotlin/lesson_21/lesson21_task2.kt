package lesson_21

fun List<Int>.evenNumbersSum(): Int {
    val evenList = this.filter {
        it % 2 == 0
    }
    return evenList.sum()
}

fun main() {
    val listOfNumbers = listOf(1, 32, 231, 34, 52, 21)
    println("Сумма четных чисел равна: ${listOfNumbers.evenNumbersSum()}")
}