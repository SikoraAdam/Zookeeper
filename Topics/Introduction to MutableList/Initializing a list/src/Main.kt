fun main() {
    val numbers = MutableList(100) { 0 } // put your code here
    numbers.set(0, 1)
    numbers.set(9, 10)
    numbers.set(99, 100)

    // do not touch the lines below 
    println(numbers.joinToString())
}