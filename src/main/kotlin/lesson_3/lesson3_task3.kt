package lesson_3

fun main () {

    println("Введите число:")
    val x = readLine()!!.toInt()

    val y = """
        $x * 1 = ${x * 1}
        $x * 2 = ${x * 2}
        $x * 3 = ${x * 3}
        $x * 4 = ${x * 4}
        $x * 5 = ${x * 5}
        $x * 6 = ${x * 6}
        $x * 7 = ${x * 7}
        $x * 8 = ${x * 8}
        $x * 9 = ${x * 9}
    """.trimIndent()

    println(y)
}