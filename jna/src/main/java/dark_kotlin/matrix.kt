package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.ptr.PointerByReference

class matrix : Structure {
    @JvmField val rows = 0
    @JvmField val cols = 0
    @JvmField val vals: PointerByReference? = null //float**

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("rows", "cols", "vals")
    }
}
