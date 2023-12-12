package lesson_14

open class Message(
    val id: Int,
    val userName: String,
    val userMessage: String,
)

class ChildMessage(
    id: Int,
    userName: String,
    userMessage: String,
    val parentMessageId: Int,
) : Message(id, userName, userMessage)

class Chat() {

    companion object {
        val listOfMessages = mutableListOf<Message>()
        var id = 0
        fun addMessage(userName: String, text: String) {
            val userMessage = Message(id = ++id, userName = userName, userMessage = text)
            listOfMessages.add(userMessage)
        }

        fun addThreadMessage(userName: String, text: String, parentMessageId: Int) {
            val userChildMessage =
                ChildMessage(id = ++id, userName = userName, userMessage = text, parentMessageId = parentMessageId)
            listOfMessages.add(userChildMessage)
        }

        fun printChat(level: Int = 0) {
            val groupedMessages = listOfMessages.groupBy({ if (it is ChildMessage) it.parentMessageId else it.id }, { it.userMessage })
            println(groupedMessages)
        }
    }
}

fun main() {
    val message1 = Chat.addMessage("Сергей", "Всем привет")
    val message2 = Chat.addMessage("Петя", "Какая завтра погода?")
    val message3 = Chat.addMessage("Катя", "Здравствуйте")
    val message4 = Chat.addThreadMessage("Женя", "29 градусов", 2)
    val message5 = Chat.addThreadMessage("Саша", "Привет Катя", 3)
    val message6 = Chat.addThreadMessage("Клава", "Вроде будет 25 градусов и дождь", 2)

    Chat.printChat()
}