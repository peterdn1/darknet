package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class bbox_t_container : Structure, Structure.ByReference {
    val candidates = arrayOfNulls<bbox_t>(1000)

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("candidates")
    }
}
