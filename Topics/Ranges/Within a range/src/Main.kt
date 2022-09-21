
fun main() {
    // write your code here
    val a = readln().toDouble()
    var x3 = Math.pow(a, 3.0)
    var x2 = a.pow(2.0)
    println(x3.plus(x2).plus(a).plus(1))
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()

    println(e in a..b || e in c..d)
    println("content".substring(0,0).isEmpty())
}