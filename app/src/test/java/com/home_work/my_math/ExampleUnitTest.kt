package com.home_work.my_math

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val myMath = MyMath()

    @Test
    fun testPlus() {
        val ex = 4
        val res = myMath.plus(2, 2)
        assertEquals(ex,res)
    }

    @Test
    fun testMinus() {
        val ex = 4
        val res = myMath.minus(6, 2)
        assertEquals(ex,res)
    }

    @Test
    fun testMultiply() {
        val ex = 4
        val res = myMath.multiply(2, 2)
        assertEquals(ex,res)
    }

    @Test
    fun testDividing() {
        val ex = 4
        val res = myMath.divide(8, 2)
        assertEquals(ex,res)
    }
}