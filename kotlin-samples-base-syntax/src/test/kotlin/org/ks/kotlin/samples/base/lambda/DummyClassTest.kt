package org.ks.kotlin.samples.base.lambda

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Test

public class DummyClassTest {

    Test
    fun buildsDummyClass() {
        val c = buildDummyClass({
            property = "Value"
        })

        c.property.should().be("Value")
    }
}