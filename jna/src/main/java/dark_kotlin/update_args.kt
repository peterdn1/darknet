package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class update_args : Structure {

    @JvmField val batch = 0
    @JvmField val learning_rate = 0f
    @JvmField val momentum = 0f
    @JvmField val decay = 0f
    @JvmField val adam = 0
    @JvmField val B1 = 0f
    @JvmField val B2 = 0f
    @JvmField val eps = 0f
    @JvmField val t = 0

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("batch", "learning_rate", "momentum", "decay", "adam", "B1", "B2", "eps", "t")
    }
}
