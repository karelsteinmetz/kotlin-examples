package org.ks.kotlin.samples

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith


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