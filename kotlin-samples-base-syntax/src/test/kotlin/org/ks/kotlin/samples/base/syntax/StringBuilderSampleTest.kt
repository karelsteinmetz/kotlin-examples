package org.ks.kotlin.samples.base.syntax

import org.junit.Test

public class StringBuilderSampleTest {

    Test
    fun youCanBuildString() {
        val builder = StringBuilder { }
                .append("Some String")
                .append(" - Second String")

        println(builder)

        val newBuilder = StringBuilder({ })
        newBuilder.appendln("NewBuilder started")
        newBuilder.appendln(builder)
        newBuilder.appendln("NewBuilder started")

        println(newBuilder)
    }
}