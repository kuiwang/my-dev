package com.taobao.api.internal.tdc.parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.internal.tdc.CsvMetaData;
import com.taobao.api.internal.tdc.CsvTdcResponse;

/**
 * CSV的解析器
 * 
 * @author haofeng 2013-1-15
 * @date 2013-1-15 下午5:13:16
 */
public class TdcCsvParser implements TdcParser {

    private void errorRecord(CsvReader cr, CsvTdcResponse csvRsp, String rsp, String[] headers)
            throws IOException {

        cr.readRecord();
        String[] errorMsg = cr.getValues();
        if ((null == errorMsg) || (errorMsg.length == 0)) {
            return;
        }
        for (int i = 1; i < errorMsg.length; i++) {
            if (headers[i].equals(Constants.ERROR_MSG)) {
                csvRsp.setMsg(errorMsg[i]);
            }
            if (headers[i].equals(Constants.ERROR_CODE)) {
                csvRsp.setErrorCode(errorMsg[i]);
            }
            if (headers[i].equals(Constants.ERROR_SUB_CODE)) {
                csvRsp.setSubCode(errorMsg[i]);
            }
            if (headers[i].equals(Constants.ERROR_SUB_MSG)) {
                csvRsp.setSubMsg(errorMsg[i]);
            }
        }
        csvRsp.setBody(rsp);
    }

    @Override
    public CsvTdcResponse parse(String rsp) throws ApiException {
        CsvTdcResponse csvRsp = new CsvTdcResponse();
        CsvReader cr = CsvReader.parse(rsp);
        CsvMetaData metaData = new CsvMetaData();
        List<String[]> csvResult = new ArrayList<String[]>();
        try {
            boolean hasReadHeader = false;
            while (cr.readRecord()) {
                if (!hasReadHeader) {
                    String[] headers = cr.getValues();
                    for (String header : headers) {
                        int index = header.indexOf(".");
                        if (index == -1) {
                            if (header.equals(Constants.ERROR_RESPONSE)) {
                                errorRecord(cr, csvRsp, rsp, headers);
                                return csvRsp;
                            }
                            metaData.addMetaData(null, null, header);
                        } else {
                            metaData.addMetaData(header.substring(0, index),
                                    header.substring(index + 1, header.length()), header);
                        }
                    }
                    hasReadHeader = true;
                } else {
                    String[] values = cr.getValues();
                    csvResult.add(values);
                }
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
        csvRsp.setMetaData(metaData);
        csvRsp.setCsvResult(csvResult);
        csvRsp.setBody(rsp);

        return csvRsp;
    }
}
