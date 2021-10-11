package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.ptr.PointerByReference

class load_args : Structure, Structure.ByValue {
    @JvmField var threads = 0
    @JvmField var paths: PointerByReference? = null //char**
    @JvmField var path: Pointer? = null //char*
    @JvmField var n = 0
    @JvmField var m = 0
    @JvmField var labels: PointerByReference? = null //char**
    @JvmField var h = 0
    @JvmField var w = 0
    @JvmField var c = 0 // color depth
    @JvmField var out_w = 0
    @JvmField var out_h = 0
    @JvmField var nh = 0
    @JvmField var nw = 0
    @JvmField var num_boxes = 0
    @JvmField var truth_size = 0
    @JvmField var min = 0
    @JvmField var max = 0
    @JvmField var size = 0
    @JvmField var classes = 0
    @JvmField var background = 0
    @JvmField var scale = 0
    @JvmField var center = 0
    @JvmField var coords = 0
    @JvmField var mini_batch = 0
    @JvmField var track = 0
    @JvmField var augment_speed = 0
    @JvmField var letter_box = 0
    @JvmField var mosaic_bound = 0
    @JvmField var show_imgs = 0
    @JvmField var dontuse_opencv = 0
    @JvmField var contrastive = 0
    @JvmField var contrastive_jit_flip = 0
    @JvmField var contrastive_color = 0
    @JvmField var jitter = 0f
    @JvmField var resize = 0f
    @JvmField var flip = 0
    @JvmField var gaussian_noise = 0
    @JvmField var blur = 0
    @JvmField var mixup = 0
    @JvmField var label_smooth_eps = 0f
    @JvmField var angle = 0f
    @JvmField var aspect = 0f
    @JvmField var saturation = 0f
    @JvmField var exposure = 0f
    @JvmField var hue = 0f
    @JvmField var d: Pointer? = null //data*
    @JvmField var im: Pointer? = null //image*
    @JvmField var resized: Pointer? = null //image*
    @JvmField var type = 0
    @JvmField var hierarchy: Pointer? = null //tree*

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf(
            "threads",
            "paths",
            "path",
            "n",
            "m",
            "labels",
            "h",
            "w",
            "c",
            "out_w",
            "out_h",
            "nh",
            "nw",
            "num_boxes",
            "truth_size",
            "min",
            "max",
            "size",
            "classes",
            "background",
            "scale",
            "center",
            "coords",
            "mini_batch",
            "track",
            "augment_speed",
            "letter_box",
            "mosaic_bound",
            "show_imgs",
            "dontuse_opencv",
            "contrastive",
            "contrastive_jit_flip",
            "contrastive_color",
            "jitter",
            "resize",
            "flip",
            "gaussian_noise",
            "blur",
            "mixup",
            "label_smooth_eps",
            "angle",
            "aspect",
            "saturation",
            "exposure",
            "hue",
            "d",
            "im",
            "resized",
            "type",
            "hierarchy"
        )
    }

}
