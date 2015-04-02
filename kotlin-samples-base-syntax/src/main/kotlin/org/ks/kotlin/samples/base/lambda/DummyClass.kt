package org.ks.kotlin.samples.base.lambda

public class DummyClass {
    var property: String = "AValue"
}

fun buildDummyClass(init: DummyClass.() -> Unit): DummyClass {
    val l = DummyClass()
    l.init()
    return l
}