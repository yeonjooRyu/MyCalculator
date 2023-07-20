package com.example.mycalculator

fun main(){
    println("첫번째 숫자를 입력해주세요")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력해주세요")
    var num2 = readLine()!!.toInt()

    println("+,-,*,/, % 중 연산자를 입력해주세요")
    var operator = readLine()!!

    val calc = Calculator()
    calc.calculator(num1, num2, operator)
    val addResult = calc.addOperation(AddOperation(), num1, num2)
    val abstractResult = calc.abstractOperation(AbstractOperation(), num1, num2)
    val multiplyResult = calc.multiplyOperation(MultiplyOperation(), num1, num2)
    val divideResult = calc.divideOperation(DivideOperation(), num1, num2)
}
