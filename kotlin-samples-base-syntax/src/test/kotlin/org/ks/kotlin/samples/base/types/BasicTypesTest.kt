package org.ks.kotlin.samples.base.types

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Before
import org.junit.Test
import kotlin.properties.Delegates

public class BasicTypesTest {

    private var h: BasicTypes by Delegates.notNull()

    Before
    fun before() {
        h = BasicTypes()
    }

    Test
    fun stringHasTemplates() {
        val anotherString = "AnAnotherString"

        h.string.concat(" + $anotherString")
                .should().be("AString + AnAnotherString")
    }

    Test
    fun stringHasLiterals() {
        val anotherString = "AnAnotherString"

        val s = h.string.concat(
"""
$anotherString
""")
        println(s)
        //s.should().be("AString\nAnAnotherString")
    }

    Test
    fun numbersHasNotImplicitConversion() {
        h.float = 1F
        h.float = 1f

        //        h.Long = h.float
        //        h.Long = 1l
    }

    Test
    fun explicitConversion() {
        h.long = h.float.toLong()

        h.byte = 1
        h.long = h.byte.toLong()
    }
}