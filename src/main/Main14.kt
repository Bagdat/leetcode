package main

fun main() {
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
}

private fun longestCommonPrefix(strs: Array<String>): String {
    val sorted = strs.sortedBy { it.length }
    val first = sorted.first()

    val items: ArrayList<String> = arrayListOf()

    var temp = ""
    first.forEach { c ->
        temp += c

        var count = 0

        strs.forEach { str ->
            val s = str.subSequence(0, temp.length)
            if (s == temp) {
                count++
            }
        }

        if (count == strs.count()) {
            items.add(temp)
        }

        count = 0
    }

    return "".takeIf { items.isEmpty() } ?: items.last()
}