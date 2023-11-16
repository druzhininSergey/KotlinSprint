package lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var fullMoveDescription = "$from-$to;$moveNumber"
    println(fullMoveDescription)

    from = "D2"
    to = "D3"

    fullMoveDescription = "$from-$to;${++moveNumber}"
    println(fullMoveDescription)
}