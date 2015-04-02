package org.ks.kotlin.samples.reflection

import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

public class DummyClassTest {

    private var dummy: DummyClass by Delegates.notNull()

    Before
    fun before() {
        dummy = DummyClass()
    }

    Test
    fun printProperties() {
        val r = DummyClass::class

        println("Properties:")
        r.properties.forEach {
            println(StringBuilder {
                appendln("name: ${it.name}")
                appendln("value: ${it.get(dummy)}")
                appendln("type: ${it.javaClass.getSimpleName()}")
            })
        }

        println("Extension properties:")
        r.extensionProperties.forEach {
            println(StringBuilder {
                appendln("name: ${it.name}")
//                appendln("value: ${it.get(dummy)}")
                appendln("type: ${it.javaClass.getSimpleName()}")
            })
        }
    }
    
    Test
    fun functionHasReference() {
        fun isOdd(x: Int) = x % 2 != 0

        val numbers = listOf(1, 2, 3)
        println(numbers.filter(::isOdd))
    }

    var x = 1

    Test
    fun propertyHasReference() {
//        var x = 1 // Unsupported yet

        println(::x.get(this)) // prints "1"
        ::x.set(this, 2)
        println(x)
    }
}