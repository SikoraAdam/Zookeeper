fun main() {
    val peanutButterCups = readln().toInt()
    val isWeekend = readln().toBooleanStrict()

    println(isWeekend && 15 <= peanutButterCups &&  peanutButterCups <= 25 || !isWeekend && 10 <= peanutButterCups &&  peanutButterCups <= 20)
}