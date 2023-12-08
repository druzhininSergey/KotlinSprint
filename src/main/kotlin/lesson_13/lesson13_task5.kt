package lesson_13

class PhoneDirectory5(
    var name: String,
    var phoneNumber: Long,
    var companyName: String? = null,
) {
    fun printContactData() {
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: ${companyName ?: "<не указано>"}")
    }

    companion object {
        private var contactList = mutableListOf<PhoneDirectory5>()
        fun getNumber(): MutableList<PhoneDirectory5> {
            println("Введите имя:")
            val name = readln()
            println("Введите номер:")
            val number = readln()
            println("Введите название компании")
            val companyName = readln()

            val newContact = PhoneDirectory5(
                name = name,
                phoneNumber = number.toLongOrNull() ?: throw NumberFormatException("Введены некорректные символы номера"),
                companyName = companyName
            )
            contactList.add(newContact)
            return contactList
        }
    }
}

fun main() {
    try {
        val contactList = PhoneDirectory5.getNumber()
        for (i in contactList) i.printContactData()
    } catch (e: NumberFormatException) {
        println(e)
    } catch (e: Exception){
        println("Ошибка!")
    }
}