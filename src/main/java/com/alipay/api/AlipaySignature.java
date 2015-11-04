/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.taobao.api.internal.util.Base64;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * 支付宝API签名算法。
 * 
 * @author runzhi
 */
public class AlipaySignature {

    public static String getSignatureContent(RequestParametersHolder requestHolder) {
        Map<String, String> sortedParams = new TreeMap<String, String>();
        TaobaoHashMap appParams = requestHolder.getApplicationParams();
        if (appParams != null && appParams.size() > 0) {
            sortedParams.putAll(appParams);
        }
        TaobaoHashMap protocalMustParams = requestHolder.getProtocalMustParams();
        if (protocalMustParams != null && protocalMustParams.size() > 0) {
            sortedParams.putAll(protocalMustParams);
        }
        TaobaoHashMap protocalOptParams = requestHolder.getProtocalOptParams();
        if (protocalOptParams != null && protocalOptParams.size() > 0) {
            sortedParams.putAll(protocalOptParams);
        }

        StringBuffer content = new StringBuffer();
        List<String> keys = new ArrayList<String>(sortedParams.keySet());
        Collections.sort(keys);
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = sortedParams.get(key);
            content.append((i == 0 ? "" : "&") + key + "=" + value);
        }
        return content.toString();
    }

    public static String rsaSign(String content, String privateKey, String charset)
            throws AlipayApiException {
        try {
            PrivateKey priKey = getPrivateKeyFromPKCS8(AlipayConstants.SIGN_TYPE_RSA,
                    new ByteArrayInputStream(privateKey.getBytes()));
            java.security.Signature signature = java.security.Signature
                    .getInstance(AlipayConstants.SIGN_ALGORITHMS);

            signature.initSign(priKey);

            if (StringUtils.isEmpty(charset)) {
                signature.update(content.getBytes());
            } else {
                signature.update(content.getBytes(charset));
            }

            byte[] signed = signature.sign();

            return Base64.encodeToString(signed, false);
        } catch (Exception e) {
            throw new AlipayApiException("RSAcontent = " + content + "; charset = " + charset, e);
        }
    }

    public static PrivateKey getPrivateKeyFromPKCS8(String algorithm, InputStream ins)
            throws Exception {
        if (ins == null || StringUtils.isEmpty(algorithm)) {
            return null;
        }

        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);

        byte[] encodedKey = StreamUtil.readText(ins).getBytes();

        encodedKey = Base64.decode(encodedKey);

        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(encodedKey));
    }

}
