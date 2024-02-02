package lesson_21

import java.io.File

fun File.writeWordToBeginning(word: String) {
    createNewFile()
    val previousText = this.readLines().joinToString()
    writeText(word.lowercase() + previousText)
}

fun main() {
    val file = File("textFile.txt")
    file.writeWordToBeginning("Привет")
    file.writeWordToBeginning("Пока")
}