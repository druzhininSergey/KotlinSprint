package lesson_11

class AllRooms(
    val frontCover: String,
    val roomName: String,
    val membersInRoomAvatars: List<String>,
    var userNames: List<String>,
    var userStatus: List<String> = listOf("Разговаривает", "Микрофон выключен", "Пользователь заглушен")
) {
    fun showUserInfo(avatar: String) {
        if (membersInRoomAvatars.contains(avatar)) {
            println(userNames[membersInRoomAvatars.indexOf(avatar)])
            println(userStatus.random())
        }
    }

    fun printRoomInfo() {
        println(frontCover)
        println(roomName)
        println(membersInRoomAvatars)
    }
}

fun main() {

    val room1 = AllRooms(
        "Picture 1",
        "Политика",
        membersInRoomAvatars = listOf("photo1", "photo2", "photo3"),
        userNames = listOf("Саня", "Петя", "Маша")
    )
    val room2 = AllRooms(
        "Picture 2",
        "Игры",
        membersInRoomAvatars = listOf("photo4", "photo5", "photo6"),
        userNames = listOf("Dendi", "FALLEN", "Faker")
    )

    println("Комнаты с чатами:")
    room1.printRoomInfo()
    println()
    room2.printRoomInfo()
    println()
    println("Выберите аватарку, чей профиль вы хотите посмотреть")

    val chooseAvatar = readln()
    if (room1.membersInRoomAvatars.contains(chooseAvatar)) room1.showUserInfo(chooseAvatar)
    else if (room2.membersInRoomAvatars.contains(chooseAvatar)) room2.showUserInfo(chooseAvatar)
    else println("Этот пользователь скрыл информацию о себе")
}