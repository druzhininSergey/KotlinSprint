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

    companion object {
        private var id = 0
        private val allUsers = mutableListOf<ForumMember>()
        private val allMessages = mutableListOf<ForumMessage>()

        fun createNewUser(userName: String): ForumMember {
            val member = ForumMember(userId = ++id, userName = userName)
            allUsers.add(member)
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
        }
    }

}

fun main() {

    val user1 = Forum.createNewUser(readln())
    val user2 = Forum.createNewUser(readln())
    val message1 = Forum.createNewMessage(readln().toIntOrNull() ?: 0, readln())
    val message2 = Forum.createNewMessage(readln().toIntOrNull() ?: 0, readln())

    Forum.printThread()
}
