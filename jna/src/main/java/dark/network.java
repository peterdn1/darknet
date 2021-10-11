package dark;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class network extends Structure {
    public int n;
    public int batch;
    public Pointer seen; //uint64_t *seen;
    public Pointer badlabels_reject_threshold; //float*
    public Pointer delta_rolling_max; //float*
    public Pointer delta_rolling_avg; //float*
    public Pointer delta_rolling_std; //float*
    public int weights_reject_freq;
    public int equidistant_point;
    public float badlabels_rejection_percentage;
    public float num_sigmas_reject_badlabels;
    public float ema_alpha;
    public Pointer cur_iteration; //int*
    public float loss_scale;
    public Pointer t; //int *t;
    public float epoch;
    public int subdivisions;
    public Pointer layer; //layer *layers;
    public Pointer output; //float *output;
    public int policy; //learning_rate_policy policy;
    public int benchmark_layers;
    public Pointer total_bbox; //int*
    public Pointer rewritten_bbox; //int*
    public float learning_rate;
    public float learning_rate_min;
    public float learning_rate_max;
    public int batches_per_cycle;
    public int batches_cycle_mult;
    public float momentum;
    public float decay;
    public float gamma;
    public float scale;
    public float power;
    public int time_steps;
    public int step;
    public int max_batches;
    public int num_boxes;
    public int train_images_num;
    public Pointer seq_scales; //float *seq_scales;
    public Pointer scales; //float *scales;
    public Pointer steps; //int   *steps;
    public int num_steps;
    public int burn_in;
    public int cudnn_half;
    public int adam;
    public float B1;
    public float B2;
    public float eps;
    public int inputs;
    public int outputs;
    public int truths;
    public int notruth;
    public int h;
    public int w;
    public int c;
    public int max_crop;
    public int min_crop;
    public float max_ratio;
    public float min_ratio;
    public int center;
    public int flip; // horizontal flip 50% probability augmentaiont for classifier training (default = 1)
    public int gaussian_noise;
    public int blur;
    public int mixup;
    public float label_smooth_eps;
    public int resize_step;
    public int attention;
    public int adversarial;
    public float adversarial_lr;
    public float max_chart_loss;
    public int letter_box;
    public int mosaic_bound;
    public int contrastive;
    public int contrastive_jit_flip;
    public int contrastive_color;
    public int unsupervised;
    public float angle;
    public float aspect;
    public float exposure;
    public float saturation;
    public float hue;
    public int random;
    public int track;
    public int augment_speed;
    public int sequential_subdivisions;
    public int init_sequential_subdivisions;
    public int current_subdivision;
    public int try_fix_nan;
    public int gpu_index;
    public Pointer hierarchy; //tree *hierarchy;
    public Pointer input;//float *input;
    public Pointer truth;//float *truth;
    public Pointer delta;//float *delta;
    public Pointer workspace;//float *workspace;
    public int train;
    public int index;
    public Pointer cost;//float *cost;
    public float clip;
    public Pointer delta_gpu; //float*
    public Pointer output_gpu; //float*
    public Pointer input_state_gpu; //float*
    public Pointer input_pinned_cpu; //float*
    public int input_pinned_cpu_flag;
    public PointerByReference input_gpu; //float**
    public PointerByReference truth_gpu; //float**
    public PointerByReference input16_gpu; //float**
    public PointerByReference output16_gpu; //float**
    public Pointer max_input16_size; //size_t* == uint64_t*
    public Pointer max_output16_size; //size_t* == uint64_t*
    public int wait_stream;
    public Pointer cuda_graph; //void*
    public Pointer cuda_graph_exec; //void*
    public int use_cuda_graph;
    public Pointer cuda_graph_ready; //int*
    public Pointer global_delta_gpu; //float*
    public Pointer state_delta_gpu; //float*
    public long max_delta_gpu_size; //size_t
    public int optimized_memory;
    public int dynamic_minibatch;
    public long workspace_size_limit; //size_t

    public network() {
        super();
    }

    public network(Pointer peer) {
        super(peer);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
            "n",
            "batch",
            "seen",
            "badlabels_reject_threshold",
            "delta_rolling_max",
            "delta_rolling_avg",
            "delta_rolling_std",
            "weights_reject_freq",
            "equidistant_point",
            "badlabels_rejection_percentage",
            "num_sigmas_reject_badlabels",
            "ema_alpha",
            "cur_iteration",
            "loss_scale",
            "t",
            "epoch",
            "subdivisions",
            "layer",
            "output",
            "policy",
            "benchmark_layers",
            "total_bbox",
            "rewritten_bbox",
            "learning_rate",
            "learning_rate_min",
            "learning_rate_max",
            "batches_per_cycle",
            "batches_cycle_mult",
            "momentum",
            "decay",
            "gamma",
            "scale",
            "power",
            "time_steps",
            "step",
            "max_batches",
            "num_boxes",
            "train_images_num",
            "seq_scales",
            "scales",
            "steps",
            "num_steps",
            "burn_in",
            "cudnn_half",
            "adam",
            "B1",
            "B2",
            "eps",
            "inputs",
            "outputs",
            "truths",
            "notruth",
            "h",
            "w",
            "c",
            "max_crop",
            "min_crop",
            "max_ratio",
            "min_ratio",
            "center",
            "flip",
            "gaussian_noise",
            "blur",
            "mixup",
            "label_smooth_eps",
            "resize_step",
            "attention",
            "adversarial",
            "adversarial_lr",
            "max_chart_loss",
            "letter_box",
            "mosaic_bound",
            "contrastive",
            "contrastive_jit_flip",
            "contrastive_color",
            "unsupervised",
            "angle",
            "aspect",
            "exposure",
            "saturation",
            "hue",
            "random",
            "track",
            "augment_speed",
            "sequential_subdivisions",
            "init_sequential_subdivisions",
            "current_subdivision",
            "try_fix_nan",
            "gpu_index",
            "hierarchy",
            "input",
            "truth",
            "delta",
            "workspace",
            "train",
            "index",
            "cost",
            "clip",
            "delta_gpu",
            "output_gpu",
            "input_state_gpu",
            "input_pinned_cpu",
            "input_pinned_cpu_flag",
            "input_gpu",
            "truth_gpu",
            "input16_gpu",
            "output16_gpu",
            "max_input16_size",
            "max_output16_size",
            "wait_stream",
            "cuda_graph",
            "cuda_graph_exec",
            "use_cuda_graph",
            "cuda_graph_ready",
            "global_delta_gpu",
            "state_delta_gpu",
            "max_delta_gpu_size",
            "optimized_memory",
            "dynamic_minibatch",
            "workspace_size_limit"
        );
    }
}