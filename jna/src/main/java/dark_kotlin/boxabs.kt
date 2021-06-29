package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class boxabs : Structure {
    val left = 0f
    val right = 0f
    val top = 0f
    val bot = 0f

    constructor() : super()

    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("left", "right", "top", "bot")
    }
}
