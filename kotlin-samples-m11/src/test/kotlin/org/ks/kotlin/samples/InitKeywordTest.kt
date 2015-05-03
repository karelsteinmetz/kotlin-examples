package org.ks.kotlin.samples

import cz.krlst.kotlin.fluentassertions.core.should
import org.junit.Before
import org.junit.Test
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