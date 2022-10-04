package com.home_work.my_math

class MyMath {


    fun plus(n1: Int, n2: Int): Int {
        return n1 + n2
    }

     fun minus(n1: Int, n2: Int): Int {
        return n1 - n2
    }

     fun multiply(n1: Int, n2: Int): Int {
        return n1 * n2
    }

     fun divide(n1: Int, n2: Int): Int {
        return if (n2 != 0) {
            n1 / n2
        }else{
            0
        }
    }


    fun doSomething(){
        println("Do Something!!!")
    }
}