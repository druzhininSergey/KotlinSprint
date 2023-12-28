package lesson_17

class Folder(name: String, filesQuantity: Int, private val isSecret: Boolean) {
    var name = name
        get() = if (isSecret) "Скрытая папка" else field
    var filesQuantity = filesQuantity
        get() = if (isSecret) 0 else field
}

fun main() {
    val folder1 = Folder("Секретная папка", 4, true)
    println(folder1.name)
    println(folder1.filesQuantity)
}