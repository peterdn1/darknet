package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Structure

class image_data : Structure() {
    lateinit var data: Array<Float>
}
