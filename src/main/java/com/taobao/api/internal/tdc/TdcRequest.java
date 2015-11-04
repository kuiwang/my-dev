package com.taobao.api.internal.tdc;

import java.util.Map;

import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TdcRequest,TDC查询的请求类，主要包括了请求中字段
 * 
 * @author haofeng 2013-1-15
 * @date 2013-1-15 上午9:47:22 {@link}详细说明可参照TDC说明文档
 */
public class TdcRequest {

    public static final String P_TOP = "top";

    public static final String P_OFFSET = "offset";

    public static final String P_WHERE = "where";

    public static final String P_ORDERBY = "orderby";

    public static final String P_JOIN = "join";

    public static final String P_SELECT = "select";

    public static final String PATH_INFO = "path_info";

    public static final String P_MODE = "mode";

    public static final String P_SQL = "sql";

    /**
     * TDC查询的参数top:获取结果的前几个
     */
    private String paramTop;

    /**
     * TDC查询的参数offset:忽略前N个结果,即从第N+1个结果开始输出
     */
    private String paramOffset;

    /**
     * TDC查询的参数where:查询条件
     */
    private String paramWhere;

    /**
     * TDC查询的参数orderby:结果排序
     */
    private String paramOrderby;

    /**
     * TDC查询的参数join:多表联合查询
     */
    private String paramJoin;

    /**
     * TDC查询的参数select:只选择某些字段进行查询
     */
    private String paramSelect;

    /**
     * TDC查询的参数pathInfo:TDC查询路径
     */
    private String pathInfo;

    private String sql;

    /**
     * 使用方法名时的参数
     */
    private Map<String, String> methodParams;

    public String getParamTop() {
        return paramTop;
    }

    public void setParamTop(String paramTop) {
        this.paramTop = paramTop;
    }

    public String getParamOffset() {
        return paramOffset;
    }

    public void setParamOffset(String paramOffset) {
        this.paramOffset = paramOffset;
    }

    public String getParamWhere() {
        return paramWhere;
    }

    public void setParamWhere(String paramWhere) {
        this.paramWhere = paramWhere;
    }

    public String getParamOrderby() {
        return paramOrderby;
    }

    public void setParamOrderby(String paramOrderby) {
        this.paramOrderby = paramOrderby;
    }

    public String getParamJoin() {
        return paramJoin;
    }

    public void setParamJoin(String paramJoin) {
        this.paramJoin = paramJoin;
    }

    public String getParamSelect() {
        return paramSelect;
    }

    public void setParamSelect(String paramSelect) {
        this.paramSelect = paramSelect;
    }

    public String getPathInfo() {
        return pathInfo;
    }

    public void setPathInfo(String pathInfo) {
        this.pathInfo = pathInfo;
    }

    public Map<String, String> getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(Map<String, String> methodParams) {
        this.methodParams = methodParams;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public TaobaoHashMap getParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (StringUtils.areNotEmpty(this.paramSelect)) {
            txtParams.put(P_SELECT, this.paramSelect);
        }
        if (StringUtils.areNotEmpty(this.paramWhere)) {
            txtParams.put(P_WHERE, this.paramWhere);
        }
        if (StringUtils.areNotEmpty(this.paramOffset)) {
            txtParams.put(P_OFFSET, this.paramOffset);
        }
        if (StringUtils.areNotEmpty(this.paramOrderby)) {
            txtParams.put(P_ORDERBY, this.paramOrderby);
        }
        if (StringUtils.areNotEmpty(this.paramJoin)) {
            txtParams.put(P_JOIN, this.paramJoin);
        }
        if (StringUtils.areNotEmpty(this.paramTop)) {
            txtParams.put(P_TOP, this.paramTop);
        }
        if (StringUtils.areNotEmpty(this.sql)) {
            txtParams.put(P_MODE, TdcRequestMode.MODE_SQL_SELECT);
            txtParams.put(P_SQL, this.sql);
        }
        if (null != methodParams && !methodParams.isEmpty()) {
            txtParams.putAll(methodParams);
        }

        return txtParams;
    }

    /**
     * 设置查询的pathInfo属性
     * 
     * @param pathInfo
     * @return
     */
    public TdcRequest pathInfo(String pathInfo) {
        if (!pathInfo.startsWith("/")) {
            pathInfo = "/" + pathInfo;
        }
        this.pathInfo = pathInfo;
        return this;
    }

    /**
     * 设置查询的select属性
     * 
     * @param select
     * @return
     */
    public TdcRequest select(String select) {
        this.paramSelect = select;
        return this;
    }

    /**
     * 设置查询的where属性
     * 
     * @param where
     * @return
     */
    public TdcRequest where(String where) {
        this.paramWhere = where;
        return this;
    }

    /**
     * 设置查询的join属性
     * 
     * @param join
     * @return
     */
    public TdcRequest join(String join) {
        this.paramJoin = join;
        return this;
    }

    /**
     * 设置查询的top属性
     * 
     * @param top
     * @return
     */
    public TdcRequest top(String top) {
        this.paramTop = top;
        return this;
    }

    /**
     * 设置查询的offset属性
     * 
     * @param offset
     * @return
     */
    public TdcRequest offset(String offset) {
        this.paramOffset = offset;
        return this;
    }

    /**
     * 设置查询的orderby属性
     * 
     * @param orderby
     * @return
     */
    public TdcRequest orderby(String orderby) {
        this.paramOrderby = orderby;
        return this;
    }

    /**
     * 设置使用方法名查询时的
     * 
     * @param methodParams
     * @return
     */
    public TdcRequest methodParams(Map<String, String> methodParams) {
        this.methodParams = methodParams;
        return this;
    }
}
