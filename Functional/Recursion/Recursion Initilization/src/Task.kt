fun main() {
    println("Factorial 8 is: ${factorial(8)}")
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}