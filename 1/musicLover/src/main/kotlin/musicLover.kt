import kotlin.math.roundToInt

fun main() {
    val amount = 10001.00
    var discount = 0.00
    var musicLover = true

    if (amount in 1_001.00..10_000.00) {
        discount = 100.00
    } else {
        (amount > 10_000)
            discount = (amount / 100 * 5)
        }
    if (musicLover) discount -= Math.round(discount * 0.01)
    println("Ваша скидка составляет :  $discount рублей")
    }
