package br.com.first_proj

fun main() {
    var numbers1 = listOf(1, 2, 3)
    numbers1 += listOf(4)
    println(numbers1)

    val arrayList = arrayListOf(1, 2, 3)
    // Same thing ^
    val mutableList = mutableListOf(1, 2, 3)

    arrayList.add(4)
    mutableList.add(4)

    // println(arrayList)
    // println(mutableList)

    printAllElements(numbers1)
    printAllElements(arrayList)
    printAllElements(mutableList)
}

fun printAllElements(list: List<Int>) {
    println("========================")
    //for (item in list) {
    //    println("${list.indexOf(item)} $item")
    //}
    list.forEachIndexed { index, e -> println("$index - $e") }
    println("========================")
}