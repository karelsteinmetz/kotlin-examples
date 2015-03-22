package org.ks.kotlin.samples

public open class Base(var property: String) {
}

public class SingleConstruction(property: String) : Base(property) {
}

public class MultipleConstruction : Base {

    constructor() : this("DefaultValue") {
    }

    constructor(property: String) : super(property) {
    }
}