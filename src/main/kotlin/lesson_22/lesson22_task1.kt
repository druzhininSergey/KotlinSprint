package lesson_22

class RegularBook(val bookName: String, val author: String,)
data class DataBook(val bookName: String, val author: String,)

fun main() {

    val regularBook1 = RegularBook("Книга", "Автор")
    val regularBook2 = RegularBook("Книга", "Автор")
    val dataBook1 = DataBook("Книга", "Автор")
    val dataBook2 = DataBook("Книга", "Автор")

    println(regularBook1.equals(dataBook1)) // При сравнении class и data class, class будет использовать для сравнения
    println(dataBook2.equals(regularBook2)) // ссылку, а data class будет всегда использовать проинициализированные данные.
                                            // Поэтому результат будет всегда false
//======================================================================================================================
    println(dataBook1 == dataBook2)         // Сравниваются проинициализированные данные экземпляров. Данные равны -> true
    println(regularBook1 == regularBook2)   // Сравниваются ссылки двух экземпляров класса. Т.к. они разные -> false
}