package com.taobao.api.internal.tdc.parser;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.internal.tdc.JXTdcResponse;
import com.taobao.api.internal.tdc.TdcResponse;
import com.taobao.api.internal.util.XmlUtils;

/**
 * tdc xml的解析器
 * 
 * @author haofeng 2013-1-18
 * @date 2013-1-18 上午11:38:53
 */
public class TdcXmlParser implements TdcParser {

    public TdcResponse parse(String rsp) throws ApiException {
        JXTdcResponse jxRsp = new JXTdcResponse();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        XmlReader xmlreader = new XmlReader();
        try {
            StringReader sr = new StringReader(rsp);
            InputSource is = new InputSource(sr);
            Document document = XmlUtils.getDocument(is, null);
            Element root = document.getDocumentElement();
            Map<String, Object> parserMap = xmlreader.dom2Map(root);
            if (root.getNodeName().equals(Constants.ERROR_RESPONSE)) {
                jxRsp.setErrorCode((String) parserMap.get(Constants.ERROR_CODE));
                jxRsp.setMsg((String) parserMap.get(Constants.ERROR_MSG));
                jxRsp.setSubCode((String) parserMap.get(Constants.ERROR_SUB_CODE));
                jxRsp.setSubMsg((String) parserMap.get(Constants.ERROR_SUB_MSG));
            } else {
                resultMap.put(root.getNodeName(), parserMap);
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        jxRsp.setResultMap(resultMap);
        jxRsp.setBody(rsp);
        return jxRsp;
    }

}
