package com.example.mycalculator

class SubstractOperation {
    //정보(프로퍼티)
    var num1:Int = readLine()!!.toInt()
    var num2:Int = readLine()!!.toInt()

    //명시적 생성자(부)
    constructor(_num1:Int, _num2:Int){
        println("${_num1}을 생성자로 넘겼어요")
        println("${_num2}을 생성자로 넘겼어요")
    }

    //행위(메소드)
    fun substract(num1:Int, num2:Int){
        var result = num1 - num2
        println("${num1} - ${num2}는 ${result}입니다.")
    }
}