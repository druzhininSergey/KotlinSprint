package lesson_17

class User(login: String, password: String){
    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            if (value != field) println("Нельзя изменить пароль")
        }
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен на $field")
        }
}
fun main() {
    val user = User("login", "password")
    user.password = "123"
    println(user.password)
    user.login = "newLogin"
}