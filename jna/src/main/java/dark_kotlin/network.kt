package com.sl.microservice.ai.runtime.impl.darknet.dark

import com.sun.jna.Pointer
import com.sun.jna.Structure
import com.sun.jna.ptr.PointerByReference
import java.util.*

class network : Structure {
    @JvmField var n = 0
    @JvmField var batch = 0
    @JvmField var seen: Pointer? = null //uint64_t *seen;
    @JvmField var badlabels_reject_threshold: Pointer? = null //float*
    @JvmField var delta_rolling_max: Pointer? = null //float*
    @JvmField var delta_rolling_avg: Pointer? = null //float*
    @JvmField var delta_rolling_std: Pointer? = null //float*
    @JvmField var weights_reject_freq = 0
    @JvmField var equidistant_point = 0
    @JvmField var badlabels_rejection_percentage = 0f
    @JvmField var num_sigmas_reject_badlabels = 0f
    @JvmField var ema_alpha = 0f
    @JvmField var cur_iteration: Pointer? = null //int*
    @JvmField var loss_scale = 0f
    @JvmField var t: Pointer? = null //int *t;
    @JvmField var epoch = 0f
    @JvmField var subdivisions = 0
    @JvmField var layer: Pointer? = null //layer *layers;
    @JvmField var output: Pointer? = null //float *output;
    @JvmField var policy = 0  //learning_rate_policy policy;
    @JvmField var benchmark_layers = 0
    @JvmField var total_bbox: Pointer? = null //int*
    @JvmField var rewritten_bbox: Pointer? = null //int*
    @JvmField var learning_rate = 0f
    @JvmField var learning_rate_min = 0f
    @JvmField var learning_rate_max = 0f
    @JvmField var batches_per_cycle = 0
    @JvmField var batches_cycle_mult = 0
    @JvmField var momentum = 0f
    @JvmField var decay = 0f
    @JvmField var gamma = 0f
    @JvmField var scale = 0f
    @JvmField var power = 0f
    @JvmField var time_steps = 0
    @JvmField var step = 0
    @JvmField var max_batches = 0
    @JvmField var num_boxes = 0
    @JvmField var train_images_num = 0
    @JvmField var seq_scales: Pointer? = null //float *seq_scales;
    @JvmField var scales: Pointer? = null //float *scales;
    @JvmField var steps: Pointer? = null //int   *steps;
    @JvmField var num_steps = 0
    @JvmField var burn_in = 0
    @JvmField var cudnn_half = 0
    @JvmField var adam = 0
    @JvmField var B1 = 0f
    @JvmField var B2 = 0f
    @JvmField var eps = 0f
    @JvmField var inputs = 0
    @JvmField var outputs = 0
    @JvmField var truths = 0
    @JvmField var notruth = 0
    @JvmField var h = 0
    @JvmField var w = 0
    @JvmField var c = 0
    @JvmField var max_crop = 0
    @JvmField var min_crop = 0
    @JvmField var max_ratio = 0f
    @JvmField var min_ratio = 0f
    @JvmField var center = 0
    @JvmField var flip = 0 // horizontal flip 50% probability augmentaiont for classifier training (default = 1)
    @JvmField var gaussian_noise = 0
    @JvmField var blur = 0
    @JvmField var mixup = 0
    @JvmField var label_smooth_eps = 0f
    @JvmField var resize_step = 0
    @JvmField var attention = 0
    @JvmField var adversarial = 0
    @JvmField var adversarial_lr = 0f
    @JvmField var max_chart_loss = 0f
    @JvmField var letter_box = 0
    @JvmField var mosaic_bound = 0
    @JvmField var contrastive = 0
    @JvmField var contrastive_jit_flip = 0
    @JvmField var contrastive_color = 0
    @JvmField var unsupervised = 0
    @JvmField var angle = 0f
    @JvmField var aspect = 0f
    @JvmField var exposure = 0f
    @JvmField var saturation = 0f
    @JvmField var hue = 0f
    @JvmField var random = 0
    @JvmField var track = 0
    @JvmField var augment_speed = 0
    @JvmField var sequential_subdivisions = 0
    @JvmField var init_sequential_subdivisions = 0
    @JvmField var current_subdivision = 0
    @JvmField var try_fix_nan = 0
    @JvmField var gpu_index = 0
    @JvmField var hierarchy: Pointer? = null //tree *hierarchy;
    @JvmField var input: Pointer? = null //float *input;
    @JvmField var truth: Pointer? = null //float *truth;
    @JvmField var delta: Pointer? = null //float *delta;
    @JvmField var workspace: Pointer? = null //float *workspace;
    @JvmField var train = 0
    @JvmField var index = 0
    @JvmField var cost: Pointer? = null //float *cost;
    @JvmField var clip = 0f
    @JvmField var delta_gpu: Pointer? = null //float*
    @JvmField var output_gpu: Pointer? = null //float*
    @JvmField var input_state_gpu: Pointer? = null //float*
    @JvmField var input_pinned_cpu: Pointer? = null //float*
    @JvmField var input_pinned_cpu_flag = 0
    @JvmField var input_gpu: PointerByReference? = null //float**
    @JvmField var truth_gpu: PointerByReference? = null //float**
    @JvmField var input16_gpu: PointerByReference? = null //float**
    @JvmField var output16_gpu: PointerByReference? = null //float**
    @JvmField var max_input16_size: Pointer? = null //size_t* == uint64_t*
    @JvmField var max_output16_size: Pointer? = null //size_t* == uint64_t*
    @JvmField var wait_stream = 0
    @JvmField var cuda_graph: Pointer? = null //void*
    @JvmField var cuda_graph_exec: Pointer? = null //void*
    @JvmField var use_cuda_graph = 0
    @JvmField var cuda_graph_ready: Pointer? = null //int*
    @JvmField var global_delta_gpu: Pointer? = null //float*
    @JvmField var state_delta_gpu: Pointer? = null //float*
    @JvmField var max_delta_gpu_size: Long = 0 //size_t
    @JvmField var optimized_memory = 0
    @JvmField var dynamic_minibatch = 0
    @JvmField var workspace_size_limit: Long = 0 //size_t

    constructor() : super()
    constructor(peer: Pointer) : super(peer)

    override fun getFieldOrder(): List<String> {
        return listOf(
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
        )
    }

}
