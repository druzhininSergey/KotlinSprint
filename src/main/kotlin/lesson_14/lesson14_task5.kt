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
    val listOfMessages = mutableListOf<Message>()
    var lastMessageId = 0
    fun addMessage(userName: String, text: String): Message {
        val userMessage = Message(id = ++lastMessageId, userName = userName, userMessage = text)
        listOfMessages.add(userMessage)
        return userMessage
    }

    fun addThreadMessage(userName: String, text: String, parentMessageId: Int): ChildMessage {
        val userChildMessage =
            ChildMessage(id = ++lastMessageId, userName = userName, userMessage = text, parentMessageId = parentMessageId)
        listOfMessages.add(userChildMessage)
        return userChildMessage
    }

    fun printChat(level: Int = 0) {
        val groupedMessages =
            listOfMessages.groupBy({ if (it is ChildMessage) it.parentMessageId else it.id }, { it.userMessage })
        println(groupedMessages)
    }
}

fun main() {
    val message = Chat()
    message.addMessage("Сергей", "Всем привет")
    message.addMessage("Петя", "Какая завтра погода?")
    message.addMessage("Катя", "Здравствуйте")
    message.addThreadMessage("Женя", "29 градусов", 2)
    message.addThreadMessage("Саша", "Привет Катя", 3)
    message.addThreadMessage("Клава", "Вроде будет 25 градусов и дождь", 2)

    message.printChat()
}