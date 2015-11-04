/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;

/**
 * 支付宝API请求入口。
 * 
 * @author runzhi
 */
public interface AlipayClient {

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws AlipayApiException;

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String authToken)
            throws AlipayApiException;

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String authToken,
            String version) throws AlipayApiException;
}
