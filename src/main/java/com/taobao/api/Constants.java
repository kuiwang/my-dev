package com.taobao.api;

/**
 * 公用常量类。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public abstract class Constants {

    /** TOP默认时间格式 **/
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /** TOP Date默认时区 **/
    public static final String DATE_TIMEZONE = "GMT+8";

    /** UTF-8字符集 **/
    public static final String CHARSET_UTF8 = "UTF-8";

    /** GBK字符集 **/
    public static final String CHARSET_GBK = "GBK";

    /** TOP JSON 应格式 */
    public static final String FORMAT_JSON = "json";

    /** TOP XML 应格式 */
    public static final String FORMAT_XML = "xml";

    /** MD5签名方式 */
    public static final String SIGN_METHOD_MD5 = "md5";

    /** HMAC签名方式 */
    public static final String SIGN_METHOD_HMAC = "hmac";

    /** TQL分隔符 */
    public static final String TQL_SEPERATOR = "top_tql_seperator";

    /** 授权地址 */
    public static final String PRODUCT_CONTAINER_URL = "http://container.open.taobao.com/container";

    /** SDK版本号 */
    public static final String SDK_VERSION = "top-sdk-java-20141102";

    /** 返回的错误码 */
    public static final String ERROR_RESPONSE = "error_response";

    public static final String ERROR_CODE = "code";

    public static final String ERROR_MSG = "msg";

    public static final String ERROR_SUB_CODE = "sub_code";

    public static final String ERROR_SUB_MSG = "sub_msg";
}
