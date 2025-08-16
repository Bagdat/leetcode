package main

fun main() {
    println(minimumOperations(intArrayOf(3,6,9)))
}

private fun minimumOperations(nums: IntArray): Int {
    var count = 0
    nums.forEach { num ->
        if ((num + 1) % 3 == 0) {
            count++
        } else if ((num - 1) % 3 == 0) {
            count++
        }
    }
    return count
}