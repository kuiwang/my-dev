package com.taobao.api.internal.tdc;

import com.taobao.api.ApiException;

/**
 * TdcClient TDC查询的客户端
 * 
 * @author haofeng 2013-1-15
 * @date 2013-1-15 上午9:47:16
 */
public interface TdcClient {

    /**
     * Csv格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @return CsvTdcResponse csv格式对应的结果集
     * @throws ApiException
     */
    public CsvTdcResponse csvExecute(TdcRequest request) throws ApiException;

    /**
     * Csv格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @param session 请求api的用户的session
     * @return CsvTdcResponse csv格式对应的结果集
     * @throws ApiException
     */
    public CsvTdcResponse csvExecute(TdcRequest request, String session) throws ApiException;

    /**
     * json格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @return JXTdcResponse json格式对应的结果集
     * @throws ApiException
     */
    public JXTdcResponse jsonExecute(TdcRequest request) throws ApiException;

    /**
     * json格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @param session 请求api的用户的session
     * @return JXTdcResponse json格式对应的结果集
     * @throws ApiException
     */
    public JXTdcResponse jsonExecute(TdcRequest request, String session) throws ApiException;

    /**
     * xml格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @return JXTdcResponse xml格式对应的结果集
     * @throws ApiException
     */
    public JXTdcResponse xmlExecute(TdcRequest request) throws ApiException;

    /**
     * xml格式的执行方法
     * 
     * @param request tdc查询的请求类
     * @param session 请求api的用户的session
     * @return JXTdcResponse xml格式对应的结果集
     * @throws ApiException
     */
    public JXTdcResponse xmlExecute(TdcRequest request, String session) throws ApiException;

    /**
     * MBP的数据回流
     * 
     * @param request
     * @param session
     * @throws ApiException
     */
    public TdcResponse execute(TdcReflowRequest request, String session) throws ApiException;

}
