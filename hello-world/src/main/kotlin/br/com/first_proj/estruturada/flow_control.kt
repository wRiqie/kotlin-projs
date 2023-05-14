package br.com.first_proj.estruturada

fun main() {
    println("Digite 1 para sim e 2 para não")
    var option = readLine();

    if (option != null && option.isNotEmpty()) {
        if (option == "1") {
            println("Sim")
            return
        } else if (option == "2") {
            println("Não")
            return
        }
    }

    println("Opção não reconhecida!")

    var number = 10;
    when (number) {
        0 -> println("É 0")
        5 -> println("É 5")
        10 -> println("É 10")
        else -> println("nenhum")
    }
}