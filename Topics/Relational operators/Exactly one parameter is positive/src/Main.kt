
fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    var check = 0

    listOf(n1, n2, n3)
        .forEach{ a ->
            run {
                if (a > 0) {
                    check++
                }
            }
        }

    println(check == 1)
}