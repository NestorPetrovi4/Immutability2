fun main() {
    val likes = 100
    var textPrint: String

    for (i in 1..likes) {
        textPrint = if (i in 5..20) {
            "Понравилось $i человекам"
        } else if (i == 1 || (i - 11) % 10 == 0) {
            "Понравилось $i человеку"
        } else if ((i - 12) % 10 == 0 || (i - 13) % 10 == 0 || (i - 14) % 10 == 0) {
            "Понравилось $i людям"
        } else {
            "Понравилось $i человекам"
        }
        println(textPrint)
    }
}