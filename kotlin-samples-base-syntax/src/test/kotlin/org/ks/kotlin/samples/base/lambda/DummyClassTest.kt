package org.ks.kotlin.samples.base.lambda

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class DummyClassTest {

    Test
    fun buildsDummyClass() {
        val c = buildDummyClass({
            property = "Value"
        })

        c.property.should().be("Value")
    }
}