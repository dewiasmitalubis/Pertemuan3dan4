fun main(){
    val mita = Student("Mita", 20)
    val alif = mita.copy("Alif")
    if(mita.equals(alif))
        println("mita is equal to badu.")
    else
        println("mita is not equal to alif.")
    println("Hashcode of mita: ${mita.hashCode()}")
    println("Hashcode of alif: ${alif.hashCode()}")
}