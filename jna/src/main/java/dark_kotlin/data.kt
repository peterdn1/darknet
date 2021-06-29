package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.ptr.PointerByReference

class data : Structure {
    @JvmField val w = 0
    @JvmField val h = 0
    @JvmField val X: matrix? = null
    @JvmField val Y: matrix? = null
    @JvmField val shallow = 0
    @JvmField val num_boxes: Pointer? = null //int*
    @JvmField val boxes: PointerByReference? = null //box**

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("w", "h", "X", "Y", "shallow", "num_boxes", "boxes")
    }
}
