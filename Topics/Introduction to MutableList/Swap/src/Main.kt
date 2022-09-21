fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    var temp1 = numbers.get(numbers.size - 1)
    var temp2 = numbers.get(0)

    numbers.set(numbers.size - 1, temp2)
    numbers.set(0, temp1)

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}