package lesson_16

class Member(
    val login: String,
    private val password: String,
) {
    fun checkPassword(passwordInput: String): Boolean {
        val isPasswordValid = passwordInput == password
        return isPasswordValid
    }
}

fun main() {
    val user = Member("user", "password")
    println("Введите пароль")
    if (user.checkPassword(readln())) println("Добро пожаловать!")
    else println("Неверный пароль")
}