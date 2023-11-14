package lesson_3

fun main() {

    var fromLetter = "E"
    var fromNumber = 2
    var toLetter = "E"
    val toNumber = 4
    var moveNumber = 1

    var fullMoveDescription = "$fromLetter$fromNumber-$toLetter$toNumber;$moveNumber"
    println(fullMoveDescription)

    fromLetter = "D"
    fromNumber = 2
    toLetter = "D"
    moveNumber ++

    fullMoveDescription = "$fromLetter$fromNumber-$toLetter${fromNumber + 1};$moveNumber"
    println(fullMoveDescription)
}