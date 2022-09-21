fun main() {
    // write your code here
    val year = readln().toInt()
    var leap = false

    if (year % 4 == 0) {
        if (year % 100 == 0) {
            leap = year % 400 == 0
        } else {
            leap = true
        }
    } else {
        leap = false
    }

    println(if (leap) "Leap" else "Regular")

}