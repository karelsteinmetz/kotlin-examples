package org.ks.kotlin.samples.base.bytecode

public class Lambdas {

    val constructorLambda = Array(5, { i -> 42 * i })

    fun inFunction(funParamLambda: (Int) -> String) {
        funParamLambda.invoke(42)
    }

    fun inFunction22(funParamLambda22: (p1: Int, p2: Int, p3: Int, p4: Int, p5: Int,
                                        p6: Int, p7: Int, p8: Int, p9: Int, p10: Int,
                                        p11: Int, p12: Int, p13: Int, p14: Int, p15: Int,
                                        p16: Int, p17: Int, p18: Int, p19: Int, p20: Int,
                                        p21: Int, p22: Int) -> String) {
        // 22 is maximum, when you raise to 23, Kotlin compiler will fail on KotlinBuiltIns.getBuiltInClassByName
        funParamLambda22.invoke(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    }
}