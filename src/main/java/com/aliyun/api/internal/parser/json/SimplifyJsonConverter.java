package com.aliyun.api.internal.parser.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.aliyun.api.AliyunConstants;
import com.aliyun.api.AliyunResponse;
import com.aliyun.api.internal.mapping.Converter;
import com.aliyun.api.internal.mapping.Converters;
import com.taobao.api.ApiException;
import com.taobao.api.internal.mapping.Reader;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

/**
 * 精简版JSON格式转换器。
 * 
 * @author lijie.ma
 * @since 1.0, May 19, 2014
 */
public class SimplifyJsonConverter implements Converter {

    /**
     * 把JSON格式的数据转换为对象。
     * 
     * @param <T> 泛型领域对象
     * @param json JSON格式的数据
     * @param clazz 泛型领域类型
     * @return 领域对象
     */
    public <T> T fromJson(final Map<?, ?> json, Class<T> clazz) throws ApiException {
        return Converters.convert(clazz, new Reader() {

            @Override
            public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
                    throws ApiException {
                List<Object> listObjs = null;

                Object jsonList = json.get(listName);
                if (jsonList instanceof List<?>) {
                    listObjs = new ArrayList<Object>();
                    List<?> listObj = (List<?>) jsonList;
                    for (Object tmp : listObj) {
                        if (tmp instanceof Map<?, ?>) {// object
                            Map<?, ?> subMap = (Map<?, ?>) tmp;
                            Object subObj = fromJson(subMap, subType);
                            if (subObj != null) {
                                listObjs.add(subObj);
                            }
                        } else if (tmp instanceof List<?>) {// array
                            // TODO not support yet
                        } else {// boolean, long, double, string, null
                            listObjs.add(tmp);
                        }
                    }
                }

                return listObjs;
            }

            @Override
            public Object getObject(Object name, Class<?> type) throws ApiException {
                Object tmp = json.get(name);
                if (tmp instanceof Map<?, ?>) {
                    Map<?, ?> map = (Map<?, ?>) tmp;
                    return fromJson(map, type);
                } else {
                    return null;
                }
            }

            @Override
            public Object getPrimitiveObject(Object name) {
                return json.get(name);
            }

            @Override
            public boolean hasReturnField(Object name) {
                return json.containsKey(name);
            }
        });
    }

    @Override
    public <T extends AliyunResponse> T toResponse(String rsp, Class<T> clazz) throws ApiException {
        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(rsp);
        if (rootObj instanceof Map<?, ?>) {
            Map<?, ?> rootJson = (Map<?, ?>) rootObj;
            Object errorJson = rootJson.get(AliyunConstants.ERROR_RESPONSE);
            if (errorJson instanceof Map<?, ?>) {
                return fromJson((Map<?, ?>) errorJson, clazz);
            } else {
                return fromJson(rootJson, clazz);
            }
        }
        return null;
    }

}
