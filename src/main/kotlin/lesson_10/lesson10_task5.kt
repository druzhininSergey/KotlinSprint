package lesson_10

const val USER_LOGIN = "human"
const val USER_PASSWORD = "12345"

fun main() {
    val humanCart = listOf("Сумка", "Рюкзак", "Ботинки")
    val token = authorizeUser()

    if (token == "") println("Такой логин или пароль не существует")
    else humanCart.forEach { println(it) }
}

fun authorizeUser(): String {
    println("Введите логин:")
    val loginToCheck = readln()
    println("Введите пароль:")
    val passwordToCheck = readln()
    return getToken(loginToCheck, passwordToCheck)
}

fun getToken(loginToCheck: String, passwordToCheck: String): String {
    var token = ""
    if (loginToCheck == USER_LOGIN && passwordToCheck == USER_PASSWORD) {
        val symbolsForToken = (1..9) + ('a'..'z') + ('A'..'Z')
        for (i in 1..32) {
            token += symbolsForToken.random()
        }
    }
    return token
}