package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure

class ious : Structure {
    @JvmField var iou = 0f
    @JvmField var giou = 0f
    @JvmField var diou = 0f
    @JvmField var ciou = 0f
    @JvmField var dx_iou: dxrep? = null
    @JvmField var dx_giou: dxrep? = null

    constructor() : super()
    constructor(peer: Pointer) : super(peer) {
        read()
    }

    override fun getFieldOrder(): List<String> {
        return listOf("iou", "giou", "diou", "ciou", "dx_iou", "dxrep", "dx_giou")
    }
}
