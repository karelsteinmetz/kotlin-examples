package org.ks.kotlin.samples

import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import org.ks.kotlinfluentassertions.core.should


RunWith(javaClass<Enclosed>())
public class ConstructionTest {

    public class SingleConstructionTest {
        Test
        fun propertyHasAssignedValue() {
            SingleConstruction("Value").property
                    .should().be("Value")
        }
    }

    public class MultipleConstructionTest {
        Test
        fun propertyHasDefaultValue() {
            MultipleConstruction().property
                    .should().be("DefaultValue")
        }

        Test
        fun propertyHasAssignedValue() {
            MultipleConstruction("Value").property
                    .should().be("Value")
        }
    }
}