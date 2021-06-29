package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class metadata : Structure, Structure.ByValue {
    @JvmField var classes = 0
    @JvmField var names: Pointer? = null //char**

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("classes", "names")
    }
}
/*// option_list.h
typedef struct metadata {
    int classes;
    char **names;
} metadata;
*/
