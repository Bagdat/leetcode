package main

fun main() {
    println(numIdenticalPairs(intArrayOf(1,2,3)))
}

private fun numIdenticalPairs(nums: IntArray): Int {
    var count = 0
    for (i in 0..<nums.count() - 1) {
        for (j in i+1..<nums.count()) {
            if (nums[i] == nums[j]) {
                count++
            }
        }
    }
    return count
}