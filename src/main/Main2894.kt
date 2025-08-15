package main

fun main() {
    println(differenceOfSums(5, 1))
}

private fun differenceOfSums(n: Int, m: Int): Int {
    var a = 0
    var b = 0
    for (i in 1..n) {
        if (i%m == 0) {
            b+=i
        } else {
            a+=i
        }
    }
    return a-b
}