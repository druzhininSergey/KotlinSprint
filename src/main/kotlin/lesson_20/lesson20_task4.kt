package lesson_20

fun main() {
    val listOfStrings =
        listOf("Строка 1", "Строка 2", "Строка 3", "Строка 4", "Строка 5", "Строка 6", "Строка 7", "Строка 8")
    val lambdaList = listOfStrings.mapIndexed() { index: Int, string: String ->
        if (index % 2 == 1) println("Нажат элемент: $string")
    }
}