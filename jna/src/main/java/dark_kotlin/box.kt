package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure


open class box : Structure, Structure.ByValue {
    @JvmField var x = 0f
    @JvmField var y = 0f
    @JvmField var w = 0f
    @JvmField var h = 0f

    constructor() : super()
    constructor(peer: Pointer) : super(peer) {
        read()
    }

    constructor(x: Float, y: Float, w: Float, h: Float) {
        this.x = x
        this.y = y
        this.w = w
        this.h = h
    }

    constructor(bbox: Array<Float>) {
        x = bbox[0]
        y = bbox[1]
        w = bbox[2]
        h = bbox[3]
    }

    override fun getFieldOrder(): List<String> {
        return listOf("x", "y", "w", "h")
    }

    class ByValue : box(), Structure.ByValue
    class ByReference() : detection(), Structure.ByReference {
        init {
            read()
        }
    }
}
