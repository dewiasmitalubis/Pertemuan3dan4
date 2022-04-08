fun main() {
    val mita = Student("Mita", 20)
// Destructuring Declaration
    val(name, age) = mita
    println("Name = $name")
    println("Age = $age")
}