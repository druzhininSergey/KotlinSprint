package lesson_15

abstract class ForumMembers(
    val userId: Int,
    val userName: String,
) {
    abstract fun readMessage()
    abstract fun addMessage()
}

class User(
    userId: Int,
    userName: String,
) : ForumMembers(userId, userName) {
    override fun readMessage() = println("Пользователь $userName читает сообщения")
    override fun addMessage() = println("Пользователь $userName добавил сообщение")
}

class Admin(
    userId: Int,
    userName: String,
) : ForumMembers(userId, userName) {
    override fun readMessage() = println("Администратор $userName читает сообщения")
    override fun addMessage() = println("Администратор $userName добавил сообщение")
    fun deleteMessage() = println("Администратор $userName удалил сообщение")
    fun deleteMember() = println("Администратор $userName удалил пользователя")
}

fun main() {
    val user1 = User(1, "Sergei")
    val user2 = Admin(2, "Boss")
    user1.readMessage()
    user1.addMessage()
    user2.deleteMember()
    user2.deleteMessage()
}
