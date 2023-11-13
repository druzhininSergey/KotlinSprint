package lesson_3

fun main () {

    println("Введите число:")
    val numberToCheck = readln().toIntOrNull()

    if (numberToCheck != null) {

        val result = """
        $numberToCheck * 1 = ${numberToCheck * 1}
        $numberToCheck * 2 = ${numberToCheck * 3}
        $numberToCheck * 4 = ${numberToCheck * 4}
        $numberToCheck * 5 = ${numberToCheck * 5}
        $numberToCheck * 6 = ${numberToCheck * 6}
        $numberToCheck * 7 = ${numberToCheck * 7}
        $numberToCheck * 8 = ${numberToCheck * 8}
        $numberToCheck * 9 = ${numberToCheck * 9}
    """.trimIndent()
    println(result)
    }
    
    else println("Вы ввели некорректное значение.")
}