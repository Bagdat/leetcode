package main

fun main() {
    println(buildArray(intArrayOf(0,2,1,5,3,4)))
}

private fun buildArray(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    nums.forEachIndexed { i, n ->
        result[i] = nums[n]
    }
    return result
}