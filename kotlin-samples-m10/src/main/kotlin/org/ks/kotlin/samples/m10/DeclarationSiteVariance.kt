package org.ks.kotlin.samples.m10

public class DeclarationSiteVariance<in TIn, out TOut> {
    fun cast(value: TIn) : TOut {
        return value as TOut
    }
}