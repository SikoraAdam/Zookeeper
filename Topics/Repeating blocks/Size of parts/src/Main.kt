fun main() {
    // put your code here
    var p = 0
    var l = 0
    var s = 0

    repeat(readln().toInt()) {
        val a = readln().toInt()

        if (a < 0) {
            s++
        } else if (a > 0) {
            l++
        } else {
            p++
        }
    }

    println("$p $l $s")
}