package org.ks.kotlin.samples

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class ObjectWithCompanionTest {

    Test
    fun addsIncrementToSingletonValue() {
        ObjectWithCompanion.Singleton.value
                .should().be(0)

        ObjectWithCompanion.Singleton.plus(666)

        ObjectWithCompanion.Singleton.value
                .should().be(666)

        ObjectWithCompanion.Singleton.plus(10)

        ObjectWithCompanion.Singleton.value
                .should().be(676)
    }

    Test
    fun addIncrementToCompanionSingletonValue() {
        ObjectWithCompanion.value
                .should().be(0L)

        ObjectWithCompanion.plus(10L)

        ObjectWithCompanion.value
                .should().be(10L)
    }

    Test
    fun operatesWithCompanionSingletonValue() {
        ObjectWithCompanion.value
                .should().be(0L)

        ObjectWithCompanion.minus(10L)
        ObjectWithCompanion.plus(666L)

        ObjectWithCompanion.value
                .should().be(656L)
    }

}