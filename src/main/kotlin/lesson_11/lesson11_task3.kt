package lesson_11

class Member(
    val userName: String,
    val userAvatar: String,
    val userStatus: String,
)

class Room(
    private val frontCover: String,
    private val roomName: String,
    private var memberList: MutableList<Member> = mutableListOf(),
) {
    fun addUserToRoom(user: Member) {
        memberList.add(user)
    }

    fun printRoomInfo() {
        println(frontCover)
        println(roomName)
        println("Пользователи в комнате:")
        println()
        if (memberList.isNotEmpty()) {
            for (i in memberList) {
                println(i.userAvatar)
            }
        } else println("В этой комнате нет пользователей")
    }

    fun showUserInfo(avatar: String) {
        val userInfo = memberList.find { it.userAvatar == avatar }
        if (userInfo != null) {
            println(userInfo.userName)
            println(userInfo.userStatus)
        } else println("Этот пользователь скрыл информацию о себе")
    }
}

fun main() {

    val room1 = Room(
        "IMG",
        "Игры",
    )
    val user1 = Member(
        "Faker",
        "Picture1",
        "Разговаривает",
    )
    val user2 = Member(
        "FALLEN",
        "Picture2",
        "Микрофон выключен"
    )

    room1.addUserToRoom(user1)
    room1.addUserToRoom(user2)
    room1.printRoomInfo()

    println("Выберите аватарку, чей профиль вы хотите посмотреть")
    val chooseAvatar = readln().trim().capitalize()
    room1.showUserInfo(chooseAvatar)
}