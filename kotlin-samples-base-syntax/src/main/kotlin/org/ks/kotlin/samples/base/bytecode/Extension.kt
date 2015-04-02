package org.ks.kotlin.samples.base.bytecode

fun String.dummize(): String {
    return "dummy ${this}"
}

val result = "Kotlin".dummize()
