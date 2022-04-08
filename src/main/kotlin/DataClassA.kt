data class Student(val name: String, val age: Int)
fun main() {
    val mita = Student("Mita", 21)
    val alif = Student("Alif", 20)
    println("Student Name is: ${mita.name}")
    println("Student Age is: ${mita.age}")
    println("Student Name is: ${alif.name}")
    println("Student Age is: ${alif.age}")
}