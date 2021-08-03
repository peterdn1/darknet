package dark;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import jdk.internal.vm.compiler.word.PointerBase;

import java.util.Arrays;
import java.util.List;

public class detection extends Structure   {
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

        public box.ByValue bbox;
        public int classes;
        public Pointer prob; //float*
        public Pointer mask; //float*
        public float objectness;
        public int sort_class;
        public Pointer uc; //float*
        public int points;
        public Pointer embeddings; //float*
        public int embedding_size;
        public float sim;
        public int track_id;

    public detection() {
        super();
    }

    public detection(Pointer peer) {
        // cannot use super(p) because of fixed-size array fields
        super();
        useMemory(peer); // set pointer
        read(); // initialize fields
    }

    public detection(box bbox,int classes){

    }


    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("bbox", "classes", "prob", "mask", "objectness", "sort_class", "uc",
        "points", "embeddings", "embedding_size", "sim", "track_id");
    }


    public static class ByReference extends detection implements Structure.ByReference {
        public ByReference() { }
        public ByReference(Pointer p) { super(p); read(); }
    }

}