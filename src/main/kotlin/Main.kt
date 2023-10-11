fun main() {
    val likes = 100
    var textPrint :String

    for (i in 1..likes){
        if (i == 1 || (i in 5..21)) {
            textPrint = "$i человек"
        } else if ((i-2) % 10 == 0 || (i-3) % 10 == 0 || (i-4) % 10 == 0) {
            textPrint = "$i человека"
        } else {
            textPrint = "$i человек"
        }
        println(textPrint)
    }
}