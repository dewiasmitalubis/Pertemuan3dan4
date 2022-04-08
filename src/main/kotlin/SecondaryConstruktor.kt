class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 21
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val mita = PersonE("Dewi Asmita", "Lubis")
    mita.cetakInfo()
    println()
    val alif = PersonE("Alif", "Harrits", 21)
    alif.cetakInfo()
}