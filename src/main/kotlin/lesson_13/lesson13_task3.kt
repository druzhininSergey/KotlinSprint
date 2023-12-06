package lesson_13

class PhoneDirectory3(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printCompanyNames() {
        if (companyName != null) println(companyName)
    }
}

fun main() {
    val contactsList = mutableListOf(
        PhoneDirectory3("Дарт Вейдер", 89997566644, "Ситхи"),
        PhoneDirectory3("Оби-Ван Кеноби", 87549348645, "Орден Джедаев"),
        PhoneDirectory3("Лея Органа", 87468376644, null),
        PhoneDirectory3("Джабба Хатт", 84376478374, null),
        PhoneDirectory3("Генерал Гривус", 94337486734, "null"),
    )
    println("Компании телефонной книги:")
    for (i in contactsList) {
        i.printCompanyNames()
    }
}