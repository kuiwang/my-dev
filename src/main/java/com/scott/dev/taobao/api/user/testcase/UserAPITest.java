package com.scott.dev.taobao.api.user.testcase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class UserAPITest {

    protected static String testUrl = "http://gw.api.tbsandbox.com/router/rest";//沙箱环境调用地址

    protected static String appkey = "test";

    protected static String secret = "test";

    public static String testUserGet() {

        TreeMap<String, String> paramMap = new TreeMap<String, String>();

        paramMap.put("format", "json");
        paramMap.put("method", "taobao.user.seller.get");
        paramMap.put("sign_method", "md5");
        paramMap.put("app_key", appkey);
        paramMap.put("v", "2.0");
        paramMap.put("session", "test");

        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        paramMap.put("timestamp", timestamp);

        paramMap.put("fields", "nick,user_id,type");//需要获取的字段
        // apiparamsMap.put("nick","sandbox_c_1");

        //生成签名
        String sign = Util.md5Signature(paramMap, secret);
        paramMap.put("sign", sign);

        StringBuilder param = new StringBuilder();
        for (Iterator<Map.Entry<String, String>> it = paramMap.entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, String> e = it.next();
            param.append("&").append(e.getKey()).append("=").append(e.getValue());
        }

        String params = param.toString().substring(1);
        System.out.println("params:" + params);

        return param.toString().substring(1);
    }

    public static void main(String[] args) {
        String result = Util.getResult(testUrl, testUserGet());
        System.out.print(result);
    }
}
