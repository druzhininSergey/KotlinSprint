package lesson_11

class Member(
    private val membersInRoomAvatars: MutableList<User>,
) {
    fun addUserToRoom(user: User) {
        membersInRoomAvatars.add(user)
    }

    fun showUserAvatars() {
        for (user in membersInRoomAvatars) {
            println(user.userAvatar)
        }
    }

    fun showUserInfo(avatar: String) {
        val userInfo = membersInRoomAvatars.find { it.userAvatar == avatar }
        if (userInfo != null) {
            println(userInfo.userName)
            println(userInfo.userStatus)
        } else println("Этот пользователь скрыл информацию о себе")
    }
}

class User(
    val userName: String,
    val userAvatar: String,
    val userStatus: String,
)

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
        "IMG",
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
    room1.printRoomInfo()
    println("Пользователи в комнате: ")
    println()
    member.showUserAvatars()

    println("Выберите аватарку, чей профиль вы хотите посмотреть")
    val chooseAvatar = readln()
    member.showUserInfo(chooseAvatar)
}