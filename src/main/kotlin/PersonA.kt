class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val mita = PersonC("Dewi ASmita", "Lubis", 21)
    println("Name : ${mita.firstName} ${mita.lastName}")
    println("Age : ${mita.age}")
}