/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false
        get(){
            println("Fungsi getter dipanggil")
            return field
        }
        set(value){
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if (sleep == true){
            println("$name, Sleeep!")
        }else{
            println("$name, Lets Play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}