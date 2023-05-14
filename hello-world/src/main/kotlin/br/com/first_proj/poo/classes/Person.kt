package br.com.first_proj.poo.classes

import java.time.LocalDate

class Person(
    val cpf: String,
    val name: String,
    val birthDate: LocalDate
) {
    val idade: Int = LocalDate.now().year - birthDate.year

    fun speak(message: String) {
        println("$name spoke: $message")
    }
}