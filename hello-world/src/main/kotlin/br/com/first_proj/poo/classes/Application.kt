package br.com.first_proj.poo.classes

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val person1 = Person(
                "111.111.111-11",
                "wRiqie",
                LocalDate.of(2000, 6, 10),
                )
            person1.speak("Hello world!")
        }
    }
}