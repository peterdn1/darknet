package dark;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;

public class tree extends Structure {
        Pointer leaf; //int*
        int n;
        Pointer parent; //int*
        Pointer child; //int*
        Pointer group; //int*
        PointerByReference name; //char**
        int groups;
        Pointer group_size; //int*
        Pointer group_offset; //int*
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
