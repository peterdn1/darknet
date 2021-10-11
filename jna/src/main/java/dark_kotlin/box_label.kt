package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class box_label : Structure {
    @JvmField val id = 0
    @JvmField val track_id = 0
    @JvmField val x = 0f
    @JvmField val y = 0f
    @JvmField val w = 0f
    @JvmField val h = 0f
    @JvmField val left = 0f
    @JvmField val right = 0f
    @JvmField val top = 0f
    @JvmField val bottom = 0f

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("id", "track_id", "x", "y", "w", "h", "left", "right", "top", "bottom")
    }
}
