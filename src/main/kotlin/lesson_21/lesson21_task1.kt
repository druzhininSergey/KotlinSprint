package lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf("a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y")
    val symbols = this.split("")
    val count = symbols.count { it in vowels }
    println("В строке \"$this\" находятся $count гласных букв")
    return count
}

fun main() {
    val string = "hello, how are you?"
    string.vowelCount()
}