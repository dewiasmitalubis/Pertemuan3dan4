class PersonB (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi cuy!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val mita = PersonB("Dewi Asmita", "Lubis")
    val alif = PersonB("Alif", "Harrits", 21)
    val dina = PersonB("Dina", "Saputri", "Indonesia")
    val anjani = PersonB("Dewi", "Anjani", 21, "Indonesia")
}