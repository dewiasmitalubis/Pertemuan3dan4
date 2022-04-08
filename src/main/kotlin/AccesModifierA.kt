open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info() {
        println(nama +'\n'+ nrp);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}
class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    @Override
    override fun info(){
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}
fun main(){
    val mita = Mahasiswa("Dewi Asmita Lubis", 1106123)
    val andi = KetuaHima("Andi", 1106789, "Teknik Informatika")
    println(andi.toString());
    println()
    andi.info()
    println("Jenis Kelas = " + andi.javaClass.simpleName)
    println()
    mita.info()
    println("Jenis Kelas = " + mita.javaClass.simpleName)
    val alif = KetuaHima("Alif", 1105239, "Teknik Elektro")
    println()
    alif.info()
    println("Jenis Kelas = " + alif.javaClass.simpleName)
}