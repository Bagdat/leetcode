package main

fun main() {
    transformArray(intArrayOf(1,5,1,4,2)).forEach { print("$it,") }
}

private fun transformArray(nums: IntArray): IntArray {
    var result = IntArray(nums.count())
    result = nums.map {
        if (it % 2 == 0) {
            0
        } else {
            1
        }
    }.toIntArray()
    return result.sorted().toIntArray()
}