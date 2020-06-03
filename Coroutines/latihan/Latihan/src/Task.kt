/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(300L)
    return valueA+valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(200L)
    return valueA*valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum : ${resultSum.await()}")
    println("Result Multiple: ${resultMultiple.await()}")
}