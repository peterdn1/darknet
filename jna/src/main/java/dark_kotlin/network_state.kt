package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class network_state : Structure {
    @JvmField val truth: Pointer? = null //float*
    @JvmField val input: Pointer? = null //float*
    @JvmField val delta: Pointer? = null //float*
    @JvmField val workspace: Pointer? = null //float*
    @JvmField val train = 0
    @JvmField val index = 0
    @JvmField val net: network? = null


    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("truth", "input", "delta", "workspace", "train", "index", "net")
    }
}
/*
typedef struct network_state {
    float *truth;
    float *input;
    float *delta;
    float *workspace;
    int train;
    int index;
    network net;
} network_state;
 */
