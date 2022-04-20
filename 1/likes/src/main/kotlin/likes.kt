fun main() {
    val likes = 31
    if ((likes % 10 != 1 || likes % 100 == 11)) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }
}