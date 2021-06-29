package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.ptr.PointerByReference


class tree : Structure() {

    @JvmField var leaf: Pointer? = null //int*
    @JvmField var n = 0
    @JvmField var parent: Pointer? = null //int*
    @JvmField var child: Pointer? = null //int*
    @JvmField var group: Pointer? = null //int*
    @JvmField var name: PointerByReference? = null //char**
    @JvmField var groups = 0
    @JvmField var group_size: Pointer? = null //int*
    @JvmField var group_offset: Pointer? = null //int*
}

/*

// tree.h
typedef struct tree {
    int *leaf;
    int n;
    int *parent;
    int *child;
    int *group;
    char **name;

    int groups;
    int *group_size;
    int *group_offset;
} tree;

 */
