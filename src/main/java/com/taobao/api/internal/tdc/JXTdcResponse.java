package com.taobao.api.internal.tdc;

import java.util.Map;

/**
 * JXTdcResponse TDC查询的xml和json格式的结果类
 * 
 * @author haofeng 2013-1-15
 * @date 2013-1-15 上午9:47:27
 */
public class JXTdcResponse extends TdcResponse {

    private static final long serialVersionUID = -2907237253058633574L;

    /**
     * xml/json格式返回的结果
     */
    private Map<?, ?> resultMap;

    public Map<?, ?> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<?, ?> resultMap) {
        this.resultMap = resultMap;
    }

}
