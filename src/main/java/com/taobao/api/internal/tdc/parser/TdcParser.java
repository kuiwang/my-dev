package com.taobao.api.internal.tdc.parser;

import com.taobao.api.ApiException;
import com.taobao.api.internal.tdc.TdcResponse;

/**
 * TDC解析器
 * 
 * @author haofeng 2013-1-18
 * @date 2013-1-18 上午11:38:43
 */
public interface TdcParser {

    /**
     * 把响应字符串解释成相应的领域对象。
     * 
     * @param rsp 响应字符串
     * @return 领域对象
     */
    public TdcResponse parse(String rsp) throws ApiException;

}
