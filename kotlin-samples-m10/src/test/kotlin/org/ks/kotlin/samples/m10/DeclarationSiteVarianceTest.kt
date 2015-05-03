package org.ks.kotlin.samples.m10

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Test

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