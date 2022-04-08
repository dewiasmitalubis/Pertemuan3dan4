class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val mita = PersonA("Dewi Asmita", "Lubis", 21)
    println("Name : ${mita.firstName} ${mita.lastName}")
    println("Age : ${mita.age}")
}