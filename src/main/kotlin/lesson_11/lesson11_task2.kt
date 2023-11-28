package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUserInfo() {
        println("Информация о пользователе:")
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun setUserBio() {
        println("Введите информацию \"О себе\":")
        bio = readln()
    }

    fun setNewPassword() {
        println("Для смены пароля укажите предыдущий пароль:")
        if (password == readln()) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен.")
        } else println("Введен неверный пароль")
    }
}

fun main() {

    val user1 = User2(
        1,
        "Sergei",
        "pass1234",
        "sergei@gmail.com",
    )
    user1.setUserBio()
    user1.setNewPassword()
    user1.printUserInfo()
}

