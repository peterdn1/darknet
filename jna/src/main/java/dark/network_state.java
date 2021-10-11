package dark;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class network_state extends Structure {
   public Pointer truth; //float*
   public Pointer input; //float*
   public Pointer delta; //float*
   public Pointer workspace; //float*
   public int train;
   public int index;
   public network net;

   public network_state() {
      super();
   }

   public network_state(Pointer peer) {
      super(peer);
   }

   @Override
   protected List<String> getFieldOrder() {
      return Arrays.asList("truth","input","delta","workspace","train","index","net");
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