package main

import kotlin.math.log2

fun main() {
    println(isPowerOfFour(-64))
}

fun isPowerOfFour(n: Int): Boolean {
    val num = log2(n.toDouble())
    return num%2 == 0.0
}