package lesson_13

class PhoneDirectory4(
    var name: String,
    var phoneNumber: Long,
    var companyName: String? = null,
) {
    fun printContactData() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val contactsList = mutableListOf<PhoneDirectory4>()
    var continueAnswer = ""

    do {
        println("Введите имя:")
        val name = readln().trim()

        println("Введите номер:")
        val phoneNumber = readln().trim().toLongOrNull() ?: 0
        if (phoneNumber == 0.toLong()) {
            println("Номер не может содержать буквы или быть пустым")
            continue
        }

        println("Введите название компании, или нажмите Enter для пропуска:")
        var companyName: String? = readln().trim()
        if (companyName == "") companyName = null

        val newContact = PhoneDirectory4(name, phoneNumber, companyName)
        contactsList.add(newContact)

        println("Введите \"стоп\" желаете завершить добавление контактов или любой другой символ чтобы продолжить:")
        continueAnswer = readln().trim().lowercase()

    } while (continueAnswer != "стоп")

    for (i in contactsList) {
        i.printContactData()
        println("~~~~~~~~~~~~~~~~~~~~~~~")
    }
}


