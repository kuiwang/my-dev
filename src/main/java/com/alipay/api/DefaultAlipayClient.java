/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoParser;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.WebUtils;

/**
 * 支付宝API请求入口默认实现。
 * 
 * @author runzhi
 */
public class DefaultAlipayClient implements AlipayClient {

    private String serverUrl;

    private String appId;

    private String privateKey;

    private String format = Constants.FORMAT_JSON;

    private String sign_type = AlipayConstants.SIGN_TYPE_RSA;

    private int connectTimeout = 3000;

    private int readTimeout = 15000;

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
    }

    public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        this(serverUrl, appId, privateKey);
        this.format = format;
    }

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request) throws AlipayApiException {
        return execute(request, null);
    }

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String accessToken)
            throws AlipayApiException {
        return execute(request, accessToken, "1.0");
    }

    public <T extends TaobaoResponse> T execute(TaobaoRequest<T> request, String authToken,
            String version) throws AlipayApiException {
        TaobaoParser<T> parser = null;
        if (Constants.FORMAT_XML.equals(this.format)) {
            parser = new ObjectXmlParser<T>(request.getResponseClass());
        } else {
            parser = new ObjectJsonParser<T>(request.getResponseClass());
        }

        return _execute(request, parser, authToken, version);
    }

    private <T extends TaobaoResponse> T _execute(TaobaoRequest<T> request, TaobaoParser<T> parser,
            String authToken, String version) throws AlipayApiException {
        RequestParametersHolder context = doPost(request, authToken, version);

        T tRsp = null;
        try {
            tRsp = parser.parse(context.getResponseBody());
            tRsp.setBody(context.getResponseBody());
        } catch (RuntimeException e) {
            TaobaoLogger.logBizError(context.getResponseBody());
            throw e;
        } catch (ApiException e) {
            TaobaoLogger.logBizError(context.getResponseBody());
            throw new AlipayApiException(e);
        }

        tRsp.setParams(context.getApplicationParams());
        if (!tRsp.isSuccess()) {
            TaobaoLogger.logErrorScene(context, tRsp, "");
        }
        return tRsp;
    }

    public <T extends TaobaoResponse> RequestParametersHolder doPost(TaobaoRequest<T> request,
            String accessToken, String version) throws AlipayApiException {
        RequestParametersHolder requestHolder = new RequestParametersHolder();
        TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
        requestHolder.setApplicationParams(appParams);

        TaobaoHashMap protocalMustParams = new TaobaoHashMap();
        protocalMustParams.put(AlipayConstants.METHOD, request.getApiMethodName());
        protocalMustParams.put(AlipayConstants.VERSION, version);
        protocalMustParams.put(AlipayConstants.APP_ID, this.appId);

        Long timestamp = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
        protocalMustParams.put(AlipayConstants.TIMESTAMP, df.format(new Date(timestamp)));
        requestHolder.setProtocalMustParams(protocalMustParams);

        TaobaoHashMap protocalOptParams = new TaobaoHashMap();
        protocalOptParams.put(AlipayConstants.FORMAT, format);
        protocalOptParams.put(AlipayConstants.SIGN_TYPE, this.sign_type);
        protocalOptParams.put(AlipayConstants.ACCESS_TOKEN, accessToken);
        protocalOptParams.put(AlipayConstants.ALIPAY_SDK, Constants.SDK_VERSION);
        requestHolder.setProtocalOptParams(protocalOptParams);

        if (AlipayConstants.SIGN_TYPE_RSA.equals(this.sign_type)) {
            String signContent = AlipaySignature.getSignatureContent(requestHolder);
            protocalMustParams.put(AlipayConstants.SIGN,
                    AlipaySignature.rsaSign(signContent, privateKey, Constants.CHARSET_UTF8));
        } else {
            protocalMustParams.put(AlipayConstants.SIGN, "");
        }

        StringBuffer requestUrl = new StringBuffer(serverUrl);
        try {
            String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(),
                    Constants.CHARSET_UTF8);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(),
                    Constants.CHARSET_UTF8);

            if (requestUrl.indexOf("?") != -1) {
                requestUrl.append("&");
            } else {
                requestUrl.append("?");
            }
            requestUrl.append(sysMustQuery);
            if (sysOptQuery != null & sysOptQuery.length() > 0) {
                requestUrl.append("&").append(sysOptQuery);
            }
            requestHolder.setRequestUrl(requestUrl.toString());
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        String rsp = null;
        try {
            if (request instanceof TaobaoUploadRequest) {
                TaobaoUploadRequest<T> uRequest = (TaobaoUploadRequest<T>) request;
                Map<String, FileItem> fileParams = TaobaoUtils.cleanupMap(uRequest.getFileParams());
                rsp = WebUtils.doPost(requestUrl.toString(), appParams, fileParams, connectTimeout,
                        readTimeout);
            } else {
                rsp = WebUtils
                        .doPost(requestUrl.toString(), appParams, connectTimeout, readTimeout);
            }
            requestHolder.setResponseBody(rsp);
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        return requestHolder;
    }

}
