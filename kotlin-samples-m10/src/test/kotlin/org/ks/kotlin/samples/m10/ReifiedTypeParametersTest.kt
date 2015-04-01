package org.ks.kotlin.samples.m10

import org.junit.Test


public class ReifiedTypeParametersTest {

    Test
    fun printAllMethodsViaReifiedType() {
        val arrayOfMethods = methodsOf<String>()

        println(arrayOfMethods.joinToString("\n"))
    }

    Test
    fun printAllMethodsViaParameter() {
        val arrayOfMethods = methodsOfOld(javaClass<String>())

        println(arrayOfMethods.joinToString("\n"))
    }
}