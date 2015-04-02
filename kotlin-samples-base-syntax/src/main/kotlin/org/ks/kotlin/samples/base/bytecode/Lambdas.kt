package org.ks.kotlin.samples.base.bytecode

public class Lambdas {

    val constructorLambda = Array(5, { i -> 42 * i })

    fun inFunction(funParamLambda: (Int) -> String) {
        funParamLambda.invoke(42)
    }
}