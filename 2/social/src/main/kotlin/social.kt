fun main() {
    println(agoToText("Alex", 1100))
    println(agoToText("Alex", 660))
    println(agoToText("Alex", 1260))
    println(agoToText("Alex", 50))
    println(agoToText("Alex", 3120))
    println(agoToText("Alex", 40600))
    println(agoToText("Alex", 79000))
    println(agoToText("Alex", 82000))
    println(agoToText("Alex", 90000))
    println(agoToText("Alex", 173000))
    println(agoToText("Alex", 260000))
}

fun agoToText(name: String, time: Int): String {
    return when (time) {
        in 0..60 -> "$name был(а) только что"
        in 61..60 * 60 -> "$name был(а) ${minutes(time)} назад"
        in 60 * 60 + 1..24 * 60 * 60 -> "$name был(а) ${hours(time)} назад"
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> "$name был(а) сегодня"
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> "$name был(а) вчера"
        else -> "$name был(а) давно"
    }
}

fun minutes(time: Int): String {
    return when {
        time / 60 % 10 == 1 && time / 60 !=11 -> "${time / 60} минуту"
        time / 60 % 10 == 2 || time / 60 % 10 == 3 || time / 60 % 10 == 4 -> "${time / 60} минуты"
        else -> "${time / 60} минут"
    }
}

fun hours(time: Int): String {
    return when {
        time / 3600 == 1 || time /3600 == 21 -> "${time / 3600} час"
        time / 3600 % 10 == 2 || time / 3600 % 10 == 3 || time / 3600 % 10 == 4 -> "${time / 3600} часа"
        else -> "${time / 3600} часов"
    }
}

