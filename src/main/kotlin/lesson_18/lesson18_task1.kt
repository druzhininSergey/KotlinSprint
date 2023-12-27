package lesson_18

class Order {
    companion object {
        var orderNumber = 0
    }

    fun printOrderData(
        product: String,
    ) {
        orderNumber++
        println("Заказан товар: $product")
    }

    fun printOrderData(
        products: List<String>,
    ) {
        orderNumber++
        val productString = products.joinToString(", ")
        println("Заказаны товары: $productString")
    }
}

fun main() {
    val x = Order()
    val y = Order()
    x.printOrderData("Огурец")
    y.printOrderData(listOf("Помидор", "Огурец"))
}