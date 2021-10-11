package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure


open class detection : Structure {
        /*
        typedef struct detection{
            box bbox;
            int classes;
            float *prob;
            float *mask;
            float objectness;
            int sort_class;
            float *uc; // Gaussian_YOLOv3 - tx,ty,tw,th uncertainty
            int points; // bit-0 - center, bit-1 - top-left-corner, bit-2 - bottom-right-corner
            float *embeddings;  // embeddings for tracking
            int embedding_size;
            float sim;
            int track_id;
        } detection;
        */

        @JvmField var bbox: box.ByValue? = null
        @JvmField var classes = 0
        @JvmField var prob: Pointer? = null //float*
        @JvmField var mask: Pointer? = null //float*
        @JvmField var objectness = 0f
        @JvmField var sort_class = 0
        @JvmField var uc: Pointer? = null //float*
        @JvmField var points = 0
        @JvmField var embeddings: Pointer? = null //float*
        @JvmField var embedding_size = 0
        @JvmField var sim = 0f
        @JvmField var track_id = 0

        constructor(): super()
        constructor(p: Pointer) : super(){
            useMemory(p)
            read()
        }

        override fun getFieldOrder(): List<String> {
            return listOf("bbox", "classes", "prob", "mask", "objectness", "sort_class", "uc",
                "points", "embeddings", "embedding_size", "sim", "track_id")
        }

        class ByReference : detection, Structure.ByReference {
            constructor() {}
            constructor(p: Pointer) : super(p) {
                read()
            }
        }
    }
