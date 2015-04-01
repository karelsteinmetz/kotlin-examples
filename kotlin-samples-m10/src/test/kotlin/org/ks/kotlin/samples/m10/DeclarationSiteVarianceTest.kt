package org.ks.kotlin.samples.m10

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class DeclarationSiteVarianceTest {

    Test
    fun castIntToLong() {
        DeclarationSiteVariance<Float, Long>()
            .cast(1F)
            .should().be(1L)



    }

    Test
    fun castLongToInt() {
        DeclarationSiteVariance<Long, Float>()
                .cast(1L)
                .should().be(1F)
    }
}