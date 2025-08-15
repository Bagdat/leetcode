package main

import kotlin.math.abs

fun main() {
    println(scoreOfString("hello"))
}

private fun scoreOfString(s: String): Int {
    var sum = 0
    for (index in 0..<s.length-1) {
        val a = s[index]
        val b = s[index + 1]
        sum += abs(a-b)
    }
    return sum
}