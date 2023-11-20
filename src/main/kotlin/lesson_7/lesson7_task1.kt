package lesson_7

fun main() {

    val letterForPassword = 'a'..'z'
    val digitForPassword = 0..9

    for (i in 1..3) {
        val randomPassword = "${letterForPassword.random()}${digitForPassword.random()}"
        print(randomPassword)
    }
}