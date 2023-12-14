package lesson_16

class UserOrder(
    private val orderNumber: Int,
    private var orderStatus: String = "Ожидание подтверждения заказа.",
) {
    fun requestManagerForStatusChange(newStatus: String) {
        changeOrderStatus(newStatus)
    }

    private fun changeOrderStatus(newStatus: String) {
        println("Статус заказа №$orderNumber успешно изменен на:\n\"$newStatus\"")
        orderStatus = newStatus
    }
}
fun main() {
    val order1 = UserOrder(1)
    order1.requestManagerForStatusChange("Заказ подтвержден. Упаковка товара перед отправкой.")
}
