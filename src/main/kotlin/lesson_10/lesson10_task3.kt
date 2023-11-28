package lesson_10

fun main() {

    println("Введите количество символов для создания пароля: ")
    val passwordLength = readln().toIntOrNull() ?: 0
    inputLength(passwordLength)
}

fun inputLength(length: Int) {
    val digits = '0'..'9'
    val symbols = ('!'..'/') + ' '
    var pass = ""

    for (i in 0..<length) {
        val digit = i % 2
        pass += if (digit == 0) digits.random()
        else symbols.random()
    }
    println(pass)
}
