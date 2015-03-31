package org.ks.kotlin.samples.m10


inline fun methodsOf<reified T>() = javaClass<T>().getMethods()

fun main(s: Array<String>) {
    println("Methods of ${javaClass<String>()}")
    println(methodsOf<String>().joinToString("\n"))
}