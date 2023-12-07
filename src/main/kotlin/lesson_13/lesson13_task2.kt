package lesson_13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printContactData() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = PhoneDirectory2(
        "Сергей",
        89997566644,
    )
    val contact2 = PhoneDirectory2(
        "Михаил",
        87549348645,
        "Parker"
    )
    contact1.printContactData()
    println()
    contact2.printContactData()
}