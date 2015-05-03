package org.ks.kotlin.samples.m10

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Test

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