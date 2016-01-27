package com.taobao.api.internal.tdc.parser;

import java.util.Map;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.internal.tdc.TdcResponse;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

/**
 * MBP数据回流的结果解析
 * 
 * @author haofeng 2013-5-21
 * @date 2013-5-21 上午11:39:51
 */
public class TdcMbpBackParser implements TdcParser {

    @Override
    public TdcResponse parse(String rsp) throws ApiException {
        TdcResponse rsponse = new TdcResponse();
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);

        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            if (rootJson.containsKey(Constants.ERROR_RESPONSE)) {
                Map<?, ?> result = (Map<?, ?>) rootJson.get(Constants.ERROR_RESPONSE);
                rsponse.setErrorCode((String) result.get(Constants.ERROR_CODE));
                rsponse.setMsg((String) result.get(Constants.ERROR_MSG));
                rsponse.setSubCode((String) result.get(Constants.ERROR_SUB_CODE));
                rsponse.setSubMsg((String) result.get(Constants.ERROR_SUB_MSG));
            }
        }

        rsponse.setBody(rsp);
        return rsponse;
    }
}
