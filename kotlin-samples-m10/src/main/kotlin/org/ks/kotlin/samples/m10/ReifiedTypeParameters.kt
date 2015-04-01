package org.ks.kotlin.samples.m10


inline fun methodsOf<reified T>() = javaClass<T>().getMethods()

fun methodsOfOld(clazz: Class<*>) = clazz.getMethods()
