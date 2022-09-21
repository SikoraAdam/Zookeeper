fun main() {
    // write your code here
    var q1 = readln().split(" ").map { t -> t.toInt() }
    var q2 = readln().split(" ").map { t -> t.toInt() }

    if (q1.get(0) == q2.get(0) ||
        q1.get(1) == q2.get(1) ||
        Math.abs(q1.get(0) - q2.get(0)) == Math.abs(q1.get(1) - q2.get(1))) {
        println("YES")
    } else {
        println("NO")
    }
}