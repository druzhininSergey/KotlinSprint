package lesson_8

fun main() {

    val numberOfViews = 1..100
    var arrayOfNumbersOfViews = intArrayOf()

    for (i in 0..6) {
        arrayOfNumbersOfViews += numberOfViews.random()
    }
    val sumViewsPerWeek = arrayOfNumbersOfViews.sum()
    println(sumViewsPerWeek)
}