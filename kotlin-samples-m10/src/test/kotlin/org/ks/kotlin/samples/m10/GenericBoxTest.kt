package org.ks.kotlin.samples.m10

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should
import kotlin.test.assertEquals

public class GenericBoxTest {

    Test
    fun genericTypeShouldBeSpecifiedExplicitly() {
        GenericBox<Int>(1)
                .value.should().be(1)
    }

    Test
    fun genericTypeShouldBeInferred() {
        GenericBox(1)
                .value.should().be(1)
    }
}