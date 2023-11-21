package lesson_7

fun main() {

    val letterForPassword = 'a'..'z'
    val digitForPassword = 0..9
    var randomPassword = ""

    for (i in 1..3) {
        randomPassword += "${letterForPassword.random()}${digitForPassword.random()}"
    }
    println(randomPassword)
}