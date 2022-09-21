fun main() {
    // put your code here
    var max = 0
    repeat(readln().toInt()) {
        val temp = readln().toInt()
        if(temp % 4 == 0 && max < temp) max = temp
    }

    println(max)
}