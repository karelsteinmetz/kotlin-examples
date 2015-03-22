package org.ks.kotlin.samples

import org.junit.Test
import org.ks.kotlinfluentassertions.core.should

public class LabeledReturnsTest {

    Test
    fun mapsValuesWhichAreLessThanZero() {
        val listOfInts = listOf(1, -10, 100, -1000)

        val listOfStrings = listOfInts.map { i ->
            if (i < 0)
                return@map "Negative"
            "Positive"
        }

        listOfStrings[0].should().be("Positive")
        listOfStrings[1].should().be("Negative")
        listOfStrings[2].should().be("Positive")
        listOfStrings[3].should().be("Negative")
    }
}