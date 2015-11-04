package com.taobao.api.internal.tdc.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Element;

import com.taobao.api.internal.util.XmlUtils;

/**
 * tdc xml解析map类
 * 
 * @author haofeng 2013-1-18
 */
public class XmlReader {

    @SuppressWarnings("unchecked")
    public Map<String, Object> dom2Map(Element e) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<?> list = XmlUtils.getChildElements(e);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Element iter = (Element) list.get(i);
                List<Object> mapList = new ArrayList<Object>();
                if (XmlUtils.getChildElements(iter).size() > 0) {
                    Map<?, ?> m = dom2Map(iter);
                    if (map.get(iter.getNodeName()) != null) {
                        Object obj = map.get(iter.getNodeName());
                        if (!obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = new ArrayList<Object>();
                            mapList.add(obj);
                            mapList.add(m);
                        }
                        if (obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = (List<Object>) obj;
                            mapList.add(m);
                        }
                        map.put(iter.getNodeName(), mapList);
                    } else map.put(iter.getNodeName(), m);
                } else {
                    if (map.get(iter.getNodeName()) != null) {
                        Object obj = map.get(iter.getNodeName());
                        if (!obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = new ArrayList<Object>();
                            mapList.add(obj);
                            mapList.add(iter.getTextContent());
                        }
                        if (obj.getClass().getName().equals("java.util.ArrayList")) {
                            mapList = (List<Object>) obj;
                            mapList.add(iter.getTextContent());
                        }
                        map.put(iter.getNodeName(), mapList);
                    } else map.put(iter.getNodeName(), iter.getTextContent());
                }
            }
        } else {
            map.put(e.getNodeName(), e.getTextContent());
        }
        return map;
    }

}
