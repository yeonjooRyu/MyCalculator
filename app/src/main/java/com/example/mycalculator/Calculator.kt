package com.example.mycalculator

class Calculator {
    fun calculator(num1: Int, num2: Int, operator: String) {


        if(operator=="+") {
            var addResult = num1 + num2
            println("${num1} + ${num2}의 결과는 ${addResult}입니다.")
        } else if(operator=="-"){
            var substractResult = num1 - num2
            println("${num1} - ${num2}의 결과는 ${substractResult}입니다.")
        } else if(operator=="*") {
            var multiplyResult = num1 * num2
            println("${num1} * ${num2}의 결과는 ${multiplyResult}입니다.")
        } else if(operator=="/"){
            var divideResult = num1 / num2
            println("${num1} / ${num2}의 결과는 ${divideResult}입니다.")
        } else{
            println("잘못된 연산자입니다")
        }
    }

    fun addOperation(addOperation: AddOperation, num1: Int, num2: Int): Int {
        return addOperation.add(num1, num2)
    }

    fun abstractOperation(abstractOperation: AbstractOperation, num1: Int, num2: Int): Int {
        return abstractOperation.abstract(num1, num2)
    }

    fun multiplyOperation(multiplyOperation: MultiplyOperation, num1: Int, num2: Int): Int {
        return multiplyOperation.multiply(num1, num2)
    }

    fun divideOperation(divideOperation: DivideOperation, num1: Int, num2: Int): Int {
        return divideOperation.divide(num1, num2)
    }
}