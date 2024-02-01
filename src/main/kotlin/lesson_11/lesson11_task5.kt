package lesson_11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    var authorId: Int,
    val message: String,
)

class Forum {
    private var id = 0
    private val allUsers = mutableListOf<ForumMember>()
    private val allMessages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumMember {
        val member = ForumMember(userId = ++id, userName = userName)
        allUsers.add(member)
        println("Создан аккаунт пользователя.\nЛогин: ${member.userName}\nid: ${member.userId}")
        return member
    }

    fun createNewMessage(id: Int, message: String): ForumMessage? {
        val checkId = allUsers.filter { it.userId == id }
        if (checkId.isNotEmpty()) {
            val newMessage = ForumMessage(id, message)
            allMessages.add(newMessage)
            return newMessage
        } else return null
    }

    fun printThread() {
        for (i in allMessages) {
            for (user in allUsers) {
                if (user.userId == i.authorId)
                    println("${user.userName}: ${i.message}")
            }
        }
    }

}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Пользователь 1")
    val user2 = forum.createNewUser("Пользователь 2")

    println("Впишите id ${user1.userName} для отправки сообщения")
    val message1 = forum.createNewMessage(readln().toIntOrNull() ?: 0, "Привет")
    println("Впишите id ${user2.userName} для отправки сообщения")
    val message2 = forum.createNewMessage(readln().toIntOrNull() ?: 0, "Пока")

    forum.printThread()
}
