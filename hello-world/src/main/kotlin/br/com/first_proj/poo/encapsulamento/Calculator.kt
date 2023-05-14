package br.com.first_proj.poo.encapsulamento

import java.math.BigDecimal

enum class OperationEnum { sum, subtract, divide, multiply }

class Calculator {
    private var result = BigDecimal.ZERO

    fun calculate(value: BigDecimal, operation: OperationEnum = OperationEnum.sum) {
        when (operation) {
            OperationEnum.sum -> result += value
            OperationEnum.subtract -> result -= value
            OperationEnum.divide -> result /= value
            else -> result *= value
        }
        showResult()
    }

    private fun showResult() {
        println("O resultado é $result")
    }
}