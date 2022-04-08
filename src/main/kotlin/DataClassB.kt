fun main() {
    val mita = Student("Mita", 21)
    val newMita = Student("Mita", 21)
    val alif = Student("Alif", 20)
    if (mita.equals(newMita))
        println("mita is equal to newMita.")
    else
        println("mita is not equal to newMita.")
    if (mita.equals(alif))
        println("mita is equal to alif.")
    else
        println("mita is not equal to alif.")
    println("Hashcode of mita: ${mita.hashCode()}")
    println("Hashcode of newMita: ${newMita.hashCode()}")
    println("Hashcode of alif: ${alif.hashCode()}")
}