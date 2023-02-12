package br.com.first_proj

fun main() {
    var total = 0;
    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (number in numbers) {
        total += number
    }

    println("Total [FOR]: $total")
    total = 0;

    var counter = 0;
    while(counter < numbers.size) {
        total += numbers[counter]
        counter++
    }

    println("Total [WHILE]: $total")
    total = 0;
    counter = 0;

    do {
        total += numbers[counter]
        counter++
    } while (counter < numbers.size)

    println("Total [DoWHILE]: $total")

    println("Total [Reduce]: ${numbers.reduce { a, b -> a + b }}")

    println("Total [SumOf]: ${numbers.sumOf { it }}")
}