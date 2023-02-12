package br.com.first_proj

fun main() {
    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var total = calculateTotal(numbers)


    println("Total [Function]: $total")
}

fun calculateTotal(numbers: Array<Int>) : Int {
    var total = 0;
    for (number in numbers) {
        total += number
    }
    return total
}