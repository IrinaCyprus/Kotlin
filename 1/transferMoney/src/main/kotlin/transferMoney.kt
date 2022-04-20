fun main() {
    val amount = 15000000L
    val commission = 0.75
    val minCommission = 3500

    val result = (amount / 100 * commission).toInt()
    if (result <= minCommission) {
        println(minCommission)
    } else
        println(result)
}