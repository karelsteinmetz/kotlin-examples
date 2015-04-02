package org.ks.kotlin.samples.reflection

public class DummyClass (
        var double: Double = 64.0,
        var float: Float = 32F,
        var long: Long = 64L,
        var int: Int = 23,
        var short: Short = 16,
        var byte: Byte = 8,
        var char: Char = 'a',
        var string: String = "AString",
        var boolean: Boolean = true,
        var nullableDouble: Double? = 64.0
) {
    var _value: Int? = null

    fun print(text: String) {
        println(text)
    }
}

var DummyClass.nullableInt: Int?
    get() {
        return _value
    }
    set(value) {
        _value = value
    }

val DummyClass.ImutablleNullableInt: Int?
    get() {
        return _value
    }