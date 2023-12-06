package lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
) {
    private var companyName: String? = null
    constructor(
        name: String,
        phoneNumber: Long,
        companyName: String,
        ) : this(name, phoneNumber) {
            this.companyName = companyName
        }
}

fun main() {
    val contact1 = PhoneDirectory(
        "Сергей",
        89997566644,
    )
    val contact2 = PhoneDirectory(
        "Михаил",
        87549348645,
        "Parker"
    )
}