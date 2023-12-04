package lesson_11

class Member(
    private val membersInRoomAvatars: MutableList<User>,
) {
    fun addUserToRoom(user: User) {
        membersInRoomAvatars.add(user)
    }
    fun showUserInfo(avatar: String) {
        val userInfo = membersInRoomAvatars.find { it.userAvatar == avatar }
        if (userInfo != null) {
            println(userInfo.userName)
            println(userInfo.userStatus)
        }
    }
}

class User(
    val userName: String,
    val userAvatar: String,
    var userStatus: String,
){
    fun changeStatus(){
        println("""Для смены статуса $userName введите число:
            |1. Разговаривает
            |2. Микрофон выключен
            |3. Пользователь заглушен
            |При некорректном вводе будет выбран статус "Статус неизвестен"
        """.trimMargin())
        val status = readln().toIntOrNull() ?: 4
        userStatus = when (status){
            1 -> "Разговаривает"
            2 -> "Микрофон выключен"
            3 -> "Пользователь заглушен"
            else -> "Статус неизвестен"
        }
    }
}

class Room(
    private val frontCover: String,
    private val roomName: String,
) {
    fun printRoomInfo() {
        println(frontCover)
        println(roomName)
    }
}

fun main() {

    val room1 = Room(
        "Picture 2",
        "Игры",
    )
    val user1 = User(
        "Faker",
        "Picture1",
        "Разговаривает",
    )
    val user2 = User(
        "FALLEN",
        "Picture2",
        "Микрофон выключен"
    )
    val member = Member(mutableListOf())
    member.addUserToRoom(user1)
    member.addUserToRoom(user2)
    user1.changeStatus()
    println()



//    println("Комнаты с чатами:")
//    room1.printRoomInfo()
//    println()
//    println("Выберите аватарку, чей профиль вы хотите посмотреть")



}

//membersInRoomAvatars = listOf("photo1", "photo2", "photo3"),
//userNames = listOf("Саня", "Петя", "Маша")

//membersInRoomAvatars = listOf("photo4", "photo5", "photo6"),
//userNames = listOf("", "FALLEN", "Faker")

//
//if (room1.membersInRoomAvatars.) room1.showUserInfo(chooseAvatar)
//else if (room1.membersInRoomAvatars.contains(chooseAvatar)) room1.showUserInfo(chooseAvatar)
//else println("Этот пользователь скрыл информацию о себе")