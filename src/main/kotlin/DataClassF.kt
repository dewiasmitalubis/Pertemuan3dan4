fun main() {
    val mita = Student("Mita", 20)
// Destructuring Declaration with componentN() method
    val name = mita.component1()
    val age = mita.component2()
    println("Name = $name")
    println("Age = $age")
}