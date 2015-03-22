package org.ks.kotlin.samples

import kotlin.properties.Delegates

public class InitKeyword {

    var property: String by Delegates.notNull()

    init {
        property = "Value"
    }
}