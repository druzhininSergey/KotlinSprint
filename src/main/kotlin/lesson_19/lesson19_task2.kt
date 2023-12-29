package lesson_19

enum class ProductCategory{
    CLOTH {
        override fun getName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getName(): String {
            return "Канцелярские товары"
        }
    },
    OTHER {
        override fun getName(): String {
            return "Разное"
        }
    };

    abstract fun getName() :String
}
class Product(
    private val productName: String,
    private val category: ProductCategory,
) {
    companion object{
        private var id = 0
    }
    fun printProductInfo(){
        id++
        println(id)
        println(productName)
        println(category.getName())
    }
}
fun main() {
    val hoodie = Product("Толстовка", ProductCategory.CLOTH)
    val pen = Product("Ручка", ProductCategory.STATIONERY)
    val watch = Product("Часы", ProductCategory.OTHER)

    hoodie.printProductInfo()
    pen.printProductInfo()
    watch.printProductInfo()
}