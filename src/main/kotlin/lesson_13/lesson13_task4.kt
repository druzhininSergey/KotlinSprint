package lesson_13

import java.util.*

class PhoneDirectory4(
    var name: String,
    var phoneNumber: Long,
    var companyName: String? = null,
) {
    fun printContactData() {
        if (companyName != null) println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: $companyName")
        else println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: <не указано>")
    }
}

fun main() {
    val contactsList = mutableListOf<PhoneDirectory4>()
    val redColor = "\u001B[31m"
    val resetColor = "\u001B[0m"

    do {
        println("Введите имя$redColor или \"стоп\" чтобы завершить$resetColor:")
        val name = readln().trim()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        if (name == "Стоп") break

        println("Введите номер:")
        val phoneNumber = readln().trim().toLongOrNull() ?: 0
        if (phoneNumber == 0.toLong()) {
            println("Номер не может содержать буквы или быть пустым")
            continue
        }

        println("Введите название компании,$redColor \"стоп\" чтобы завершить$resetColor или нажмите Enter для пропуска:")
        var companyName: String? = readln().trim()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        if (companyName == "Стоп") break
        else if (companyName == "") companyName = null

        val newContact = PhoneDirectory4(name, phoneNumber, companyName)
        contactsList.add(newContact)
    } while (true)

    for (i in contactsList) {
        i.printContactData()
        println("~~~~~~~~~~~~~~~~~~~~~~~")
    }
}

