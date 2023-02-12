package br.com.first_proj

fun main() {
    // Distinct elements
    val hashSet = hashSetOf(1, 2, 3, 4)
    val sortedSet = sortedSetOf(1, 2, 3, 4)
    val linkedSet = linkedSetOf(1, 2, 3, 4)

    hashSet.add(5) // different element
    hashSet.add(3) // existing element
    printAllElements(hashSet)
    sortedSet.add(5) // different element
    sortedSet.add(3) // existing element
    printAllElements(hashSet)
    linkedSet.add(5) // different element
    linkedSet.add(3) // existing element
    printAllElements(hashSet)

    // =========================================================

    val hashSet2 = hashSetOf("one", "two", "three")
    val sortedSet2 = sortedSetOf("a", "c", "b")
    val linkedSet2 = linkedSetOf("one", "two", "three")
    hashSet2.add("four") // more fast
    println(hashSet2.elementAt(2))

    sortedSet2.add("d") // sorted
    println(sortedSet2.elementAt(2))

    linkedSet2.add("four") // keeps order
    println(linkedSet2.elementAt(2))

}

fun <T> printAllElements(set: Set<T>) {
    println(set.joinToString(", "))
}
