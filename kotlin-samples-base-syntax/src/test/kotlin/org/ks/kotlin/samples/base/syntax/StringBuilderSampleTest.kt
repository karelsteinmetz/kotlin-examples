package org.ks.kotlin.samples.base.syntax

import org.junit.Test

public class StringBuilderSampleTest {

    Test
    fun youCanBuildStringByBuilder() {
        val builder = StringBuilder { }
                .append("Some String")
                .append(" - Second String")

        println(builder)

        println(StringBuilder({
            appendln("NewBuilder started")
        })
        .appendln(builder)
        .appendln("NewBuilder started"))
    }
}