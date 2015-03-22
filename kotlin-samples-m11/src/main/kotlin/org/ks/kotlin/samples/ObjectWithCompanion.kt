package org.ks.kotlin.samples

public class ObjectWithCompanion {

    //    class object {
    //        var value: Int = 0
    //
    //        fun plus(increment: Int) {
    //            value += increment
    //        }
    //    }

    object Singleton {
        var value: Int = 0

        fun plus(increment: Int) {
            value += increment
        }
    }

    companion object CompanionSingleton {
        var value: Long = 0L

        fun plus(increment: Long) {
            value += increment
        }
    }
}

fun ObjectWithCompanion.CompanionSingleton.minus(decrement: Long) {
    value -= decrement
}