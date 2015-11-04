package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceByDBA
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceByDBA extends TaobaoObject {

    private static final long serialVersionUID = 7887984942915145587L;

    /**
     * 优化建议
     */
    @ApiField("OptimizationText")
    private String optimizationText;

    public String getOptimizationText() {
        return this.optimizationText;
    }

    public void setOptimizationText(String optimizationText) {
        this.optimizationText = optimizationText;
    }

}
