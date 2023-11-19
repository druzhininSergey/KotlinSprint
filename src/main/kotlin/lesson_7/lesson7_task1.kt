package lesson_7

fun main() {

    val letterForPassword = 'a'..'z'
    val digitForPassword = 0..9

    val randomPassword = "${letterForPassword.random()}${digitForPassword.random()}${letterForPassword.random()}" +
            "${digitForPassword.random()}${letterForPassword.random()}${digitForPassword.random()}"
    println(randomPassword)
}