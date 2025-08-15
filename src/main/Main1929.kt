package main

fun main() {
    println(getConcatenation(intArrayOf(1,2,1)))
}

private fun getConcatenation(nums: IntArray): IntArray {
    return nums.plus(nums)
}