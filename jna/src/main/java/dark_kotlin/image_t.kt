package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import java.nio.FloatBuffer

open class image_t : Structure, Structure.ByReference {
    @JvmField var h = 0  // height
    @JvmField var w = 0 // width
    @JvmField var c = 0 // number of chanels (3 - for RGB)
    @JvmField var data: FloatBuffer? = null // pointer to the image data

    constructor() : super()
    constructor(peer: Pointer) : super(peer) {
        read()
    }

    internal class ByReference : image_t, Structure.ByReference {
        constructor() {}
        constructor(p: Pointer) : super(p) {
            read()
        }
    }

    constructor(h: Int, w: Int, c: Int, data: FloatBuffer) : super() {
        this.h = h
        this.w = w
        this.c = c
        this.data = data
    }

    override fun getFieldOrder(): List<String>? {
        return listOf("h", "w", "c", "data")
    }


}
