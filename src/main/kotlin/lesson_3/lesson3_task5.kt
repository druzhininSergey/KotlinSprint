package lesson_3

fun main() {

    val fullMoveDescription = "D2-D4;0"

    val part = fullMoveDescription.split('-',';')

    val from = part[0]
    val to = part[1]
    val moveNumber = part[2]

    println("""
        |$from
        |$to
        |$moveNumber
    """.trimMargin())
}