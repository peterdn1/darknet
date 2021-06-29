package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

open class image: Structure, Structure.ByValue {

    @JvmField var w = 0
    @JvmField var h = 0
    @JvmField var c = 0
    @JvmField var data: Pointer? = null //float*

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("w", "h", "c", "data")
    }
}
