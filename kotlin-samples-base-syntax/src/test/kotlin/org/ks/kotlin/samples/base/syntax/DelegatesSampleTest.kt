package org.ks.kotlin.samples.base.syntax

import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import org.ks.kotlinfluentassertions.core.should
import kotlin.properties.Delegates
import kotlin.test.failsWith

RunWith(javaClass<Enclosed>())
public class DelegatesSampleTest {

    public class LazyDelegatesSampleTest {
        val lazyProperty: String by Delegates.lazy { "DefaultLazyValue" }

        Test
        fun delegatesCanBeSpecifiedAsLocalVariables() {
            //        val lazyProperty: String by Delegates.lazy { "DefaultLazyValue" }
        }

        Test
        fun lazyAddsValueFromLambda() {
            lazyProperty.should().be("DefaultLazyValue")
        }
    }

    public class NotNullDelegatesSampleTest {
        //    val notNullProperty: String by Delegates.notNull()
        var notNullProperty: String by Delegates.notNull()

        Test
        fun propertyShouldBeInitializedBeforeGetIsNull() {
            val e = failsWith(javaClass<IllegalStateException>(), {
                println(notNullProperty)
            })
            println(e)
        }

        Test
        fun propertyInitialization() {
            notNullProperty = "Value"

            println(notNullProperty)

            notNullProperty.should().be("Value")
        }
    }
}