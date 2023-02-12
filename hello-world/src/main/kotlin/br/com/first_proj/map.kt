package br.com.first_proj

fun main() {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3)

    println(map)
    println(map["two"])

    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    // mutableMap.put("three", 3)
    mutableMap["three"] = 3

    println(mutableMap)
    println(mutableMap["three"])


}