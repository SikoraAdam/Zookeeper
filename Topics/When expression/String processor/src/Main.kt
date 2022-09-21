fun main() {
    // write your code here
    val input1 = readln()
    val input2 = readln()
    val input3 = readln()

    when(input2) {
        "equals" -> println(input1.equals(input3))
        "plus" -> println(input1 + input3)
        "endsWith" -> println(input1.endsWith(input3))
        else -> println("Unknown operation")
    }
}