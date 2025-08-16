package main

fun main() {
    println(finalValueAfterOperations(arrayOf("--X","X++","X++")))
}

private fun finalValueAfterOperations(operations: Array<String>): Int {
    var sum = 0
    operations.forEach { operation ->
        when(operation) {
            "X++", "++X" -> sum += 1
            "--X","X--" -> sum -= 1
        }
    }
    return sum
}