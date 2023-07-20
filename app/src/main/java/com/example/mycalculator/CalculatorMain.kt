package com.example.mycalculator

fun main(){
    println("첫번째 숫자를 입력해주세요")
    var num1 = readLine()!!.toInt()

    println("두번째 숫자를 입력해주세요")
    var num2 = readLine()!!.toInt()

    println("+,-,*,/중 연산자를 입력해주세요")
    var operator = readLine()!!

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
    } else if(operator=="%"){
        var elseResult = num1 % num2
        println("${num1} % ${num2}의 결과는 ${elseResult}입니다. ")
    } else{
        println("잘못된 연산자입니다.")
    }
}
