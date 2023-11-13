package lesson_2

fun main() {

    val employees = 50
    val trainees = 30

    val employeesSalary = 30000
    val traineesSalary = 20000

    val totalEmployeesSalary = employees * employeesSalary
    val totalExpenses = totalEmployeesSalary + (trainees * traineesSalary)
    val averageSalary = totalExpenses / (employees + trainees)

    println(totalEmployeesSalary)
    println(totalExpenses)
    println(averageSalary)
}