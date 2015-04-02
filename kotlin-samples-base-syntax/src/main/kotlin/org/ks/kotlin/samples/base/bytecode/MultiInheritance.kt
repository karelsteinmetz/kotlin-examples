package org.ks.kotlin.samples.base.bytecode

trait Trait1 {

    fun abstractMethod()
}

trait Trait2 {

    fun implementedMethod() {
        println("implementation in trait")
    }
}

class MultiClass : Trait1, Trait2 {

    override fun abstractMethod() {
        println("implemented abstract method")
    }

}