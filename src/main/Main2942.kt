package main

fun main() {
    println(findWordsContaining(arrayOf("abc","bcd","aaaa","cbc"), 'a'))
}

private fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val list: ArrayList<Int> = arrayListOf()
    words.forEachIndexed { i, s ->
        if (s.contains(x)) {
            list.add(i)
        }
    }
    return list
}