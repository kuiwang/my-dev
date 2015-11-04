package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 操作锁原因
 *
 * @author auto create
 * @since 1.0, null
 */
public class LockReason extends TaobaoObject {

    private static final long serialVersionUID = 2786989285168315134L;

    /**
     * 操作锁的原因
     */
    @ApiField("LockReason")
    private String lockReason;

    public String getLockReason() {
        return this.lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

}
