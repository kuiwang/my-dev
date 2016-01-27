package com.taobao.api.internal.tdc;

import java.util.List;

/**
 * CsvTdcResponse TDC查询结果中的csv文件结果类 主要包括了csv的metadata类信息和对应的结果集信息
 * 
 * @author haofeng 2013-1-15
 * @date 2013-1-15 上午9:47:27
 */
public class CsvTdcResponse extends TdcResponse {

    private static final long serialVersionUID = -6669330314804951303L;

    /**
     * csv格式返回的结果
     */
    private List<String[]> csvResult;

    /**
     * 查询的结果的列名
     */
    private CsvMetaData metaData;

    public List<String[]> getCsvResult() {
        return csvResult;
    }

    public CsvMetaData getMetaData() {
        return metaData;
    }

    public void setCsvResult(List<String[]> csvResult) {
        this.csvResult = csvResult;
    }

    public void setMetaData(CsvMetaData metaData) {
        this.metaData = metaData;
    }

}
