fun main() {
    // put your code here
    val input = 7
    val result = mutableListOf<String>()
    var temp = 1

    while (result.size + temp < input) {
        repeat(temp) {
            result.add(temp.toString())
        }

        temp++
    }

    if (result.size < input) {
        repeat(input - result.size) {
            result.add(temp.toString())
        }
    }

    println(result.joinToString(" "))

    var i = 0
    while (i < 10) {
        i++
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}