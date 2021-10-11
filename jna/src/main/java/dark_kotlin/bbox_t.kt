package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure


class bbox_t : Structure, Structure.ByValue {
    @JvmField val x = null
    @JvmField val y = null
    @JvmField val w = null
    @JvmField val h = null  // (x,y) - top-left corner, (w, h) - width & height of bounded box
    @JvmField val prob = 0f // confidence - probability that the object was found correctly
    @JvmField val obj_id = 0 // class of object - from range [0, classes-1]
    @JvmField val track_id = 0 // tracking id for video (0 - untracked, 1 - inf - tracked object)
    @JvmField val frames_counter = 0// counter of frames on which the object was detected
    @JvmField val x_3d = 0f
    @JvmField val y_3d = 0f
    @JvmField val z_3d = 0f // center of object (in Meters) if ZED 3D Camera is used

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf("x", "y", "w", "h", "prob", "obj_id", "track_id", "frames_counter", "x_3d", "y_3d", "z_3d")
    }
}
