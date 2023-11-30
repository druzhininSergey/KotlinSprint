package lesson_10

const val USER_LOGIN = "human"
const val USER_PASSWORD = "12345"
val humanCart = listOf("Сумка", "Рюкзак", "Ботинки")

fun main() {
    println("Введите логин:")
    val loginToCheck = readln()
    println("Введите пароль:")
    val passwordToCheck = readln()

    val token = authorizeUser(loginToCheck, passwordToCheck)
    if (token != null) getToken()
    else println("Такой логин или пароль не существует")
}

fun authorizeUser(loginToCheck: String, passwordToCheck: String): String? {
    return if (loginToCheck == USER_LOGIN && passwordToCheck == USER_PASSWORD) ({
        val symbolsForToken = (1..9) + ('a'..'z') + ('A'..'Z')
        var token = ""
        for (i in 1..32) token += symbolsForToken.random()
    }).toString()
    else null
}

fun getToken(): Unit = humanCart.forEach { println(it) }


