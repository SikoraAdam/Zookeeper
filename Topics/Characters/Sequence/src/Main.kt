fun main() {
    // put your code here
    val a = readln().first()
    val b = readln().first()
    val c = readln().first()

    listOf<Char>(a, b, c).sorted()

    println(a + 1 == b && b + 1 == c)
}