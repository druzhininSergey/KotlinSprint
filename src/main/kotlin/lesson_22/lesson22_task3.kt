package lesson_22

data class TopDrive(
    val topDriveName: String,
    val horsePower: Int,
    val capacityTons: Int,
)

fun main() {
    val topDrive = TopDrive("NOV", 2680, 1250)

    val (topDriveName, horsePower, capacityTons) = topDrive
    println(topDriveName)
    println(horsePower)
    println(capacityTons)
}