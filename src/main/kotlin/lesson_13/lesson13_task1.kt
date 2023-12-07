package lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
)

fun main() {
    val contact1 = PhoneDirectory(
        "Сергей",
        89997566644,
        null
    )
    val contact2 = PhoneDirectory(
        "Михаил",
        87549348645,
        "Parker"
    )
}