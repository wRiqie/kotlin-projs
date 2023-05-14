package br.com.first_proj.poo.encapsulamento

import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = Calculator()
            calculator.calculate(BigDecimal(10))
            calculator.calculate(BigDecimal(2), OperationEnum.divide)
            calculator.calculate(BigDecimal(2), OperationEnum.multiply)
            calculator.calculate(BigDecimal(10), OperationEnum.subtract)
        }
    }
}