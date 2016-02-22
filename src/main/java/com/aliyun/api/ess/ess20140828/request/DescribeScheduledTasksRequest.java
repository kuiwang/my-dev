package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.DescribeScheduledTasksResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.DescribeScheduledTasks.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:41
 */
public class DescribeScheduledTasksRequest
        implements AliyunRequest<DescribeScheduledTasksResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * PageNumber
     */
    private Long pageNumber;

    /**
     * PageSize<br />
     * 支持最大值为：50
     */
    private Long pageSize;

    /**
     * 定时任务所属的region
     */
    private String regionId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 伸缩规则的Ari, 可以输入多个，最多可以支持20个。返回查询结果时略去失效的ScheduledAction，并且不报错。
     */
    private String scheduledAction1;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction10;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction11;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction12;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction13;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction14;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction15;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction16;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction17;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction18;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction19;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction2;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction20;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction3;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction4;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction5;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction6;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction7;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction8;

    /**
     * ScheduledAction.1
     */
    private String scheduledAction9;

    /**
     * 定时任务ID，可以输入多个，最多可以支持20个。返回查询结果时略去失效的ScheduledTaskId，并且不报错。
     */
    private String scheduledTaskId1;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId10;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId11;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId12;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId13;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId14;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId15;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId16;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId17;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId18;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId19;

    /**
     * 定时任务ID，可以输入多个，最多可以支持20个。返回查询结果时略去失效的ScheduledTaskId，并且不报错。
     */
    private String scheduledTaskId2;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId20;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId3;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId4;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId5;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId6;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId7;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId8;

    /**
     * ScheduledTaskId.
     */
    private String scheduledTaskId9;

    /**
     * 定时任务的name，可以输入多个，最多可以支持20个。返回查询结果时略去失效的ScheduledTaskName，并且不报错。
     */
    private String scheduledTaskName1;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName10;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName11;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName12;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName13;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName14;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName15;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName16;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName17;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName18;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName19;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName2;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName20;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName3;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName4;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName5;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName6;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName7;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName8;

    /**
     * ScheduledTaskName.1
     */
    private String scheduledTaskName9;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.DescribeScheduledTasks.2014-08-28";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<DescribeScheduledTasksResponse> getResponseClass() {
        return DescribeScheduledTasksResponse.class;
    }

    public String getScheduledAction1() {
        return this.scheduledAction1;
    }

    public String getScheduledAction10() {
        return this.scheduledAction10;
    }

    public String getScheduledAction11() {
        return this.scheduledAction11;
    }

    public String getScheduledAction12() {
        return this.scheduledAction12;
    }

    public String getScheduledAction13() {
        return this.scheduledAction13;
    }

    public String getScheduledAction14() {
        return this.scheduledAction14;
    }

    public String getScheduledAction15() {
        return this.scheduledAction15;
    }

    public String getScheduledAction16() {
        return this.scheduledAction16;
    }

    public String getScheduledAction17() {
        return this.scheduledAction17;
    }

    public String getScheduledAction18() {
        return this.scheduledAction18;
    }

    public String getScheduledAction19() {
        return this.scheduledAction19;
    }

    public String getScheduledAction2() {
        return this.scheduledAction2;
    }

    public String getScheduledAction20() {
        return this.scheduledAction20;
    }

    public String getScheduledAction3() {
        return this.scheduledAction3;
    }

    public String getScheduledAction4() {
        return this.scheduledAction4;
    }

    public String getScheduledAction5() {
        return this.scheduledAction5;
    }

    public String getScheduledAction6() {
        return this.scheduledAction6;
    }

    public String getScheduledAction7() {
        return this.scheduledAction7;
    }

    public String getScheduledAction8() {
        return this.scheduledAction8;
    }

    public String getScheduledAction9() {
        return this.scheduledAction9;
    }

    public String getScheduledTaskId1() {
        return this.scheduledTaskId1;
    }

    public String getScheduledTaskId10() {
        return this.scheduledTaskId10;
    }

    public String getScheduledTaskId11() {
        return this.scheduledTaskId11;
    }

    public String getScheduledTaskId12() {
        return this.scheduledTaskId12;
    }

    public String getScheduledTaskId13() {
        return this.scheduledTaskId13;
    }

    public String getScheduledTaskId14() {
        return this.scheduledTaskId14;
    }

    public String getScheduledTaskId15() {
        return this.scheduledTaskId15;
    }

    public String getScheduledTaskId16() {
        return this.scheduledTaskId16;
    }

    public String getScheduledTaskId17() {
        return this.scheduledTaskId17;
    }

    public String getScheduledTaskId18() {
        return this.scheduledTaskId18;
    }

    public String getScheduledTaskId19() {
        return this.scheduledTaskId19;
    }

    public String getScheduledTaskId2() {
        return this.scheduledTaskId2;
    }

    public String getScheduledTaskId20() {
        return this.scheduledTaskId20;
    }

    public String getScheduledTaskId3() {
        return this.scheduledTaskId3;
    }

    public String getScheduledTaskId4() {
        return this.scheduledTaskId4;
    }

    public String getScheduledTaskId5() {
        return this.scheduledTaskId5;
    }

    public String getScheduledTaskId6() {
        return this.scheduledTaskId6;
    }

    public String getScheduledTaskId7() {
        return this.scheduledTaskId7;
    }

    public String getScheduledTaskId8() {
        return this.scheduledTaskId8;
    }

    public String getScheduledTaskId9() {
        return this.scheduledTaskId9;
    }

    public String getScheduledTaskName1() {
        return this.scheduledTaskName1;
    }

    public String getScheduledTaskName10() {
        return this.scheduledTaskName10;
    }

    public String getScheduledTaskName11() {
        return this.scheduledTaskName11;
    }

    public String getScheduledTaskName12() {
        return this.scheduledTaskName12;
    }

    public String getScheduledTaskName13() {
        return this.scheduledTaskName13;
    }

    public String getScheduledTaskName14() {
        return this.scheduledTaskName14;
    }

    public String getScheduledTaskName15() {
        return this.scheduledTaskName15;
    }

    public String getScheduledTaskName16() {
        return this.scheduledTaskName16;
    }

    public String getScheduledTaskName17() {
        return this.scheduledTaskName17;
    }

    public String getScheduledTaskName18() {
        return this.scheduledTaskName18;
    }

    public String getScheduledTaskName19() {
        return this.scheduledTaskName19;
    }

    public String getScheduledTaskName2() {
        return this.scheduledTaskName2;
    }

    public String getScheduledTaskName20() {
        return this.scheduledTaskName20;
    }

    public String getScheduledTaskName3() {
        return this.scheduledTaskName3;
    }

    public String getScheduledTaskName4() {
        return this.scheduledTaskName4;
    }

    public String getScheduledTaskName5() {
        return this.scheduledTaskName5;
    }

    public String getScheduledTaskName6() {
        return this.scheduledTaskName6;
    }

    public String getScheduledTaskName7() {
        return this.scheduledTaskName7;
    }

    public String getScheduledTaskName8() {
        return this.scheduledTaskName8;
    }

    public String getScheduledTaskName9() {
        return this.scheduledTaskName9;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("ScheduledAction.1", this.scheduledAction1);
        txtParams.put("ScheduledAction.10", this.scheduledAction10);
        txtParams.put("ScheduledAction.11", this.scheduledAction11);
        txtParams.put("ScheduledAction.12", this.scheduledAction12);
        txtParams.put("ScheduledAction.13", this.scheduledAction13);
        txtParams.put("ScheduledAction.14", this.scheduledAction14);
        txtParams.put("ScheduledAction.15", this.scheduledAction15);
        txtParams.put("ScheduledAction.16", this.scheduledAction16);
        txtParams.put("ScheduledAction.17", this.scheduledAction17);
        txtParams.put("ScheduledAction.18", this.scheduledAction18);
        txtParams.put("ScheduledAction.19", this.scheduledAction19);
        txtParams.put("ScheduledAction.2", this.scheduledAction2);
        txtParams.put("ScheduledAction.20", this.scheduledAction20);
        txtParams.put("ScheduledAction.3", this.scheduledAction3);
        txtParams.put("ScheduledAction.4", this.scheduledAction4);
        txtParams.put("ScheduledAction.5", this.scheduledAction5);
        txtParams.put("ScheduledAction.6", this.scheduledAction6);
        txtParams.put("ScheduledAction.7", this.scheduledAction7);
        txtParams.put("ScheduledAction.8", this.scheduledAction8);
        txtParams.put("ScheduledAction.9", this.scheduledAction9);
        txtParams.put("ScheduledTaskId.1", this.scheduledTaskId1);
        txtParams.put("ScheduledTaskId.10", this.scheduledTaskId10);
        txtParams.put("ScheduledTaskId.11", this.scheduledTaskId11);
        txtParams.put("ScheduledTaskId.12", this.scheduledTaskId12);
        txtParams.put("ScheduledTaskId.13", this.scheduledTaskId13);
        txtParams.put("ScheduledTaskId.14", this.scheduledTaskId14);
        txtParams.put("ScheduledTaskId.15", this.scheduledTaskId15);
        txtParams.put("ScheduledTaskId.16", this.scheduledTaskId16);
        txtParams.put("ScheduledTaskId.17", this.scheduledTaskId17);
        txtParams.put("ScheduledTaskId.18", this.scheduledTaskId18);
        txtParams.put("ScheduledTaskId.19", this.scheduledTaskId19);
        txtParams.put("ScheduledTaskId.2", this.scheduledTaskId2);
        txtParams.put("ScheduledTaskId.20", this.scheduledTaskId20);
        txtParams.put("ScheduledTaskId.3", this.scheduledTaskId3);
        txtParams.put("ScheduledTaskId.4", this.scheduledTaskId4);
        txtParams.put("ScheduledTaskId.5", this.scheduledTaskId5);
        txtParams.put("ScheduledTaskId.6", this.scheduledTaskId6);
        txtParams.put("ScheduledTaskId.7", this.scheduledTaskId7);
        txtParams.put("ScheduledTaskId.8", this.scheduledTaskId8);
        txtParams.put("ScheduledTaskId.9", this.scheduledTaskId9);
        txtParams.put("ScheduledTaskName.1", this.scheduledTaskName1);
        txtParams.put("ScheduledTaskName.10", this.scheduledTaskName10);
        txtParams.put("ScheduledTaskName.11", this.scheduledTaskName11);
        txtParams.put("ScheduledTaskName.12", this.scheduledTaskName12);
        txtParams.put("ScheduledTaskName.13", this.scheduledTaskName13);
        txtParams.put("ScheduledTaskName.14", this.scheduledTaskName14);
        txtParams.put("ScheduledTaskName.15", this.scheduledTaskName15);
        txtParams.put("ScheduledTaskName.16", this.scheduledTaskName16);
        txtParams.put("ScheduledTaskName.17", this.scheduledTaskName17);
        txtParams.put("ScheduledTaskName.18", this.scheduledTaskName18);
        txtParams.put("ScheduledTaskName.19", this.scheduledTaskName19);
        txtParams.put("ScheduledTaskName.2", this.scheduledTaskName2);
        txtParams.put("ScheduledTaskName.20", this.scheduledTaskName20);
        txtParams.put("ScheduledTaskName.3", this.scheduledTaskName3);
        txtParams.put("ScheduledTaskName.4", this.scheduledTaskName4);
        txtParams.put("ScheduledTaskName.5", this.scheduledTaskName5);
        txtParams.put("ScheduledTaskName.6", this.scheduledTaskName6);
        txtParams.put("ScheduledTaskName.7", this.scheduledTaskName7);
        txtParams.put("ScheduledTaskName.8", this.scheduledTaskName8);
        txtParams.put("ScheduledTaskName.9", this.scheduledTaskName9);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScheduledAction1(String scheduledAction1) {
        this.scheduledAction1 = scheduledAction1;
    }

    public void setScheduledAction10(String scheduledAction10) {
        this.scheduledAction10 = scheduledAction10;
    }

    public void setScheduledAction11(String scheduledAction11) {
        this.scheduledAction11 = scheduledAction11;
    }

    public void setScheduledAction12(String scheduledAction12) {
        this.scheduledAction12 = scheduledAction12;
    }

    public void setScheduledAction13(String scheduledAction13) {
        this.scheduledAction13 = scheduledAction13;
    }

    public void setScheduledAction14(String scheduledAction14) {
        this.scheduledAction14 = scheduledAction14;
    }

    public void setScheduledAction15(String scheduledAction15) {
        this.scheduledAction15 = scheduledAction15;
    }

    public void setScheduledAction16(String scheduledAction16) {
        this.scheduledAction16 = scheduledAction16;
    }

    public void setScheduledAction17(String scheduledAction17) {
        this.scheduledAction17 = scheduledAction17;
    }

    public void setScheduledAction18(String scheduledAction18) {
        this.scheduledAction18 = scheduledAction18;
    }

    public void setScheduledAction19(String scheduledAction19) {
        this.scheduledAction19 = scheduledAction19;
    }

    public void setScheduledAction2(String scheduledAction2) {
        this.scheduledAction2 = scheduledAction2;
    }

    public void setScheduledAction20(String scheduledAction20) {
        this.scheduledAction20 = scheduledAction20;
    }

    public void setScheduledAction3(String scheduledAction3) {
        this.scheduledAction3 = scheduledAction3;
    }

    public void setScheduledAction4(String scheduledAction4) {
        this.scheduledAction4 = scheduledAction4;
    }

    public void setScheduledAction5(String scheduledAction5) {
        this.scheduledAction5 = scheduledAction5;
    }

    public void setScheduledAction6(String scheduledAction6) {
        this.scheduledAction6 = scheduledAction6;
    }

    public void setScheduledAction7(String scheduledAction7) {
        this.scheduledAction7 = scheduledAction7;
    }

    public void setScheduledAction8(String scheduledAction8) {
        this.scheduledAction8 = scheduledAction8;
    }

    public void setScheduledAction9(String scheduledAction9) {
        this.scheduledAction9 = scheduledAction9;
    }

    public void setScheduledTaskId1(String scheduledTaskId1) {
        this.scheduledTaskId1 = scheduledTaskId1;
    }

    public void setScheduledTaskId10(String scheduledTaskId10) {
        this.scheduledTaskId10 = scheduledTaskId10;
    }

    public void setScheduledTaskId11(String scheduledTaskId11) {
        this.scheduledTaskId11 = scheduledTaskId11;
    }

    public void setScheduledTaskId12(String scheduledTaskId12) {
        this.scheduledTaskId12 = scheduledTaskId12;
    }

    public void setScheduledTaskId13(String scheduledTaskId13) {
        this.scheduledTaskId13 = scheduledTaskId13;
    }

    public void setScheduledTaskId14(String scheduledTaskId14) {
        this.scheduledTaskId14 = scheduledTaskId14;
    }

    public void setScheduledTaskId15(String scheduledTaskId15) {
        this.scheduledTaskId15 = scheduledTaskId15;
    }

    public void setScheduledTaskId16(String scheduledTaskId16) {
        this.scheduledTaskId16 = scheduledTaskId16;
    }

    public void setScheduledTaskId17(String scheduledTaskId17) {
        this.scheduledTaskId17 = scheduledTaskId17;
    }

    public void setScheduledTaskId18(String scheduledTaskId18) {
        this.scheduledTaskId18 = scheduledTaskId18;
    }

    public void setScheduledTaskId19(String scheduledTaskId19) {
        this.scheduledTaskId19 = scheduledTaskId19;
    }

    public void setScheduledTaskId2(String scheduledTaskId2) {
        this.scheduledTaskId2 = scheduledTaskId2;
    }

    public void setScheduledTaskId20(String scheduledTaskId20) {
        this.scheduledTaskId20 = scheduledTaskId20;
    }

    public void setScheduledTaskId3(String scheduledTaskId3) {
        this.scheduledTaskId3 = scheduledTaskId3;
    }

    public void setScheduledTaskId4(String scheduledTaskId4) {
        this.scheduledTaskId4 = scheduledTaskId4;
    }

    public void setScheduledTaskId5(String scheduledTaskId5) {
        this.scheduledTaskId5 = scheduledTaskId5;
    }

    public void setScheduledTaskId6(String scheduledTaskId6) {
        this.scheduledTaskId6 = scheduledTaskId6;
    }

    public void setScheduledTaskId7(String scheduledTaskId7) {
        this.scheduledTaskId7 = scheduledTaskId7;
    }

    public void setScheduledTaskId8(String scheduledTaskId8) {
        this.scheduledTaskId8 = scheduledTaskId8;
    }

    public void setScheduledTaskId9(String scheduledTaskId9) {
        this.scheduledTaskId9 = scheduledTaskId9;
    }

    public void setScheduledTaskName1(String scheduledTaskName1) {
        this.scheduledTaskName1 = scheduledTaskName1;
    }

    public void setScheduledTaskName10(String scheduledTaskName10) {
        this.scheduledTaskName10 = scheduledTaskName10;
    }

    public void setScheduledTaskName11(String scheduledTaskName11) {
        this.scheduledTaskName11 = scheduledTaskName11;
    }

    public void setScheduledTaskName12(String scheduledTaskName12) {
        this.scheduledTaskName12 = scheduledTaskName12;
    }

    public void setScheduledTaskName13(String scheduledTaskName13) {
        this.scheduledTaskName13 = scheduledTaskName13;
    }

    public void setScheduledTaskName14(String scheduledTaskName14) {
        this.scheduledTaskName14 = scheduledTaskName14;
    }

    public void setScheduledTaskName15(String scheduledTaskName15) {
        this.scheduledTaskName15 = scheduledTaskName15;
    }

    public void setScheduledTaskName16(String scheduledTaskName16) {
        this.scheduledTaskName16 = scheduledTaskName16;
    }

    public void setScheduledTaskName17(String scheduledTaskName17) {
        this.scheduledTaskName17 = scheduledTaskName17;
    }

    public void setScheduledTaskName18(String scheduledTaskName18) {
        this.scheduledTaskName18 = scheduledTaskName18;
    }

    public void setScheduledTaskName19(String scheduledTaskName19) {
        this.scheduledTaskName19 = scheduledTaskName19;
    }

    public void setScheduledTaskName2(String scheduledTaskName2) {
        this.scheduledTaskName2 = scheduledTaskName2;
    }

    public void setScheduledTaskName20(String scheduledTaskName20) {
        this.scheduledTaskName20 = scheduledTaskName20;
    }

    public void setScheduledTaskName3(String scheduledTaskName3) {
        this.scheduledTaskName3 = scheduledTaskName3;
    }

    public void setScheduledTaskName4(String scheduledTaskName4) {
        this.scheduledTaskName4 = scheduledTaskName4;
    }

    public void setScheduledTaskName5(String scheduledTaskName5) {
        this.scheduledTaskName5 = scheduledTaskName5;
    }

    public void setScheduledTaskName6(String scheduledTaskName6) {
        this.scheduledTaskName6 = scheduledTaskName6;
    }

    public void setScheduledTaskName7(String scheduledTaskName7) {
        this.scheduledTaskName7 = scheduledTaskName7;
    }

    public void setScheduledTaskName8(String scheduledTaskName8) {
        this.scheduledTaskName8 = scheduledTaskName8;
    }

    public void setScheduledTaskName9(String scheduledTaskName9) {
        this.scheduledTaskName9 = scheduledTaskName9;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
