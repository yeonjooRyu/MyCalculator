package com.example.mycalculator

fun main(){
    println("첫번째 숫자를 입력해주세요")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력해주세요")
    var num2 = readLine()!!.toInt()

    println("+,-,*,/중 연산자를 입력해주세요")
    var operator = readLine()!!

    val calculator = Calculator()
    calculator.calculate(num1, num2, operator)
    val addResult = calculator.addOperation(AddOperation(), num1, num2)
    val substractResult = calculator.substractOperation(SubstractOperation(), num1, num2)
    val multiplyResult = calculator.multiplyOperation(MultiplyOperation(), num1, num2)
    val divideResult = calculator.divideOperation(DivideOperation(), num1, num2)
}
