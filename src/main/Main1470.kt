package main

fun main() {
    shuffle(intArrayOf(2,5,1,3,4,7), 3).forEach { print("$it ") } // [2,3,5,4,1,7]
}

private fun shuffle(nums: IntArray, n: Int): IntArray {
    val list: ArrayList<Int> = arrayListOf()
    for (i in 0..<n) {
        list.add(nums[i])
        list.add(nums[i + n])
    }
    return list.toIntArray()
}