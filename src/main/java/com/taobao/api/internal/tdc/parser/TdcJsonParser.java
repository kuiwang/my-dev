package com.taobao.api.internal.tdc.parser;

import java.util.Map;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.internal.tdc.JXTdcResponse;
import com.taobao.api.internal.tdc.TdcResponse;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

/**
 * tdc json的解析器
 * 
 * @author haofeng 2013-1-18
 * @date 2013-1-18 上午11:38:24
 */
public class TdcJsonParser implements TdcParser {

    @Override
    public TdcResponse parse(String rsp) throws ApiException {
        JXTdcResponse jxRsp = new JXTdcResponse();
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);

        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            if (rootJson.containsKey(Constants.ERROR_RESPONSE)) {
                Map<?, ?> result = (Map<?, ?>) rootJson.get(Constants.ERROR_RESPONSE);
                jxRsp.setErrorCode((String) result.get(Constants.ERROR_CODE));
                jxRsp.setMsg((String) result.get(Constants.ERROR_MSG));
                jxRsp.setSubCode((String) result.get(Constants.ERROR_SUB_CODE));
                jxRsp.setSubMsg((String) result.get(Constants.ERROR_SUB_MSG));
            } else {
                jxRsp.setResultMap(rootJson);
            }
        }

        jxRsp.setBody(rsp);
        return jxRsp;
    }

}
