package lesson_22

class RegularBook2(val bookName: String, val author: String)
data class DataBook2(val bookName: String, val author: String)

fun main() {
    val regularBook2 = RegularBook2("Book", "Author")
    val dataBook2 = DataBook2("Book2", "Author2")
    println(regularBook2)
    println(dataBook2)

// В class выводит имя класса и хэш-код, потому что по умолчанию используется метод .toString, а он не переопределен.
// В data class так же по умолчанию используется метод .toString, который предоставляет содержимое всех полей объекта.
}