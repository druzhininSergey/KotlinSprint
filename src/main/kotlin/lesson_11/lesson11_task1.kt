package lesson_11

class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        1,
        "Sergei",
        "pass1234",
        "sergei@gmail.com",
    )
    val user2 = User(
        2,
        "Dima",
        "pass4321",
        "dima@gmail.com",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}