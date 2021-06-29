package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class dxrep : Structure {
    @JvmField val dt = 0f
    @JvmField val db = 0f
    @JvmField val dl = 0f
    @JvmField val dr = 0f

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("dt", "db", "dl", "dr")
    }
}
