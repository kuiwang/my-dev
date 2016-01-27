package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.DBInstanceAttribute;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeDBInstanceAttribute.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeDBInstanceAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 5727365529368719458L;

    /**
     * DBInstanceAttribute
     */
    @ApiListField("Items")
    @ApiField("DBInstanceAttribute")
    private List<DBInstanceAttribute> items;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public List<DBInstanceAttribute> getItems() {
        return this.items;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setItems(List<DBInstanceAttribute> items) {
        this.items = items;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
