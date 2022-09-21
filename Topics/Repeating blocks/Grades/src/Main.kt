fun main() {
    // put your code here
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(readln().toInt()) {
        val line = readln().toInt()
        if(line == 5) {
            a++
        } else if(line == 4) {
            b++
        } else if(line == 3) {
            c++
        } else if(line == 2) {
            d++
        }
    }

    println("$d $c $b $a")
}