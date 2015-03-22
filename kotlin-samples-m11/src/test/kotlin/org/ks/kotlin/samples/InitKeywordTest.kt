package org.ks.kotlin.samples

import org.junit.Before
import org.junit.Test
import org.ks.kotlinfluentassertions.core.should
import kotlin.properties.Delegates

public class InitKeywordTest {

    private var initKeyword: InitKeyword by Delegates.notNull()

    Before
    fun before() {
        initKeyword = InitKeyword()
    }

    Test
    fun hasInitializedProperty() {
        initKeyword.property.should().be("Value")
    }
}