package lesson_15

interface Searchable {
    fun searchSparePart() = println("Выполняется поиск")
}

abstract class Products(
    val name: String,
    val numberOfUnitsInStock: Int,
)

class MusicalInstrument(
    name: String,
    numberOfUnitsInStock: Int,
) : Products(name, numberOfUnitsInStock), Searchable

class SparePart(
    name: String,
    numberOfUnitsInStock: Int,
) : Products(name, numberOfUnitsInStock)