package lesson_18

class Order {
    companion object {
        var orderNumber = 0
    }

    fun getOrderData(
        product: String,
    ) {
        orderNumber++
        println("Заказан товар: $product")
    }

    fun getOrderData(
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
    x.getOrderData("Огурец")
    y.getOrderData(listOf("Помидор", "Огурец"))
}