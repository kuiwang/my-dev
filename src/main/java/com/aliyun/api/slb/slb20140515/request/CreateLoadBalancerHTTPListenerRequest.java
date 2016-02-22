package com.aliyun.api.slb.slb20140515.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.slb.slb20140515.response.CreateLoadBalancerHTTPListenerResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: slb.aliyuncs.com.CreateLoadBalancerHTTPListener.2014-05-15
 * request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:47
 */
public class CreateLoadBalancerHTTPListenerRequest
        implements AliyunRequest<CreateLoadBalancerHTTPListenerResponse> {

    /**
     * SLB实例后端使用的端口，范围为1-65535。<br />
     * 支持最大值为：65535<br />
     * 支持最小值为：1
     */
    private Long backendServerPort;

    /**
     * 监听的带宽峰值，范围-1-1000Mbps。针对按固定带宽计费方式的公网类型实例，
     * 不同Listener上的Bandwidth分配的带宽峰值总和不能超出在创建SLB实例时设定的Bandwidth值
     * ，且不能将Listener上的Bandwidth设置为
     * -1；针对按使用流量计费方式的公网类型实例，可以选择将Listener上的Bandwidth设置为-1，表示不限制带宽峰值。<br />
     * 支持最大值为：1000<br />
     * 支持最小值为：-1
     */
    private Long bandwidth;

    /**
     * 服务器上配置的cookie，只有在StickySession设置为on且StickySessionType设置为server时有效。
     * 长度限制为1-200，cookie必须遵守 RFC 2965。这意味着它只能包含 ASCII
     * 英文字母数字字符，不能包含逗号、分号或空格，也不能以 $ 字符开头。<br />
     * 支持最大长度为：200<br />
     * 支持的最大列表长度为：200
     */
    private String cookie;

    /**
     * cookie超时时间。
     * 该参数在StickySession为on且StickySessionType为insert时为必选，其余情况下该参数会被忽略。 取值：
     * 1-86400（单位为秒）<br />
     * 支持最大值为：86400<br />
     * 支持最小值为：1
     */
    private Long cookieTimeout;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否开启健康检查。 取值：on | off
     */
    private String healthCheck;

    /**
     * 进行健康检查时使用的端口。 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。
     * 取值：1-65535，或者’-520’ 。 用户设置此参数为’-520’时，表示使用后端<br />
     * 支持最大值为：65535<br />
     * 支持最小值为：-520
     */
    private Long healthCheckConnectPort;

    /**
     * 用于健康检查的域名。 当HealthCheck为on时，此参数为必选；当HealthCheck为 off时，此参数设置将被忽略。
     * 取值：$_ip | 用户自定义字符串 自定义字符串规则：长度限制为1-80，只能使用字母、数字、‘-’、‘.’这些字符。
     * 用户设置此参数为’$_ip’时，SLB会使用各后端服务器的私网IP当做健康检查使用的Domain。<br />
     * 支持最大长度为：80<br />
     * 支持的最大列表长度为：80
     */
    private String healthCheckDomain;

    /**
     * 进行健康检查的时间间隔。 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。
     * 取值：1-5（单位为秒）<br />
     * 支持最大值为：5<br />
     * 支持最小值为：1
     */
    private Long healthCheckInterval;

    /**
     * 每次健康检查响应的最大超时时间。
     * 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。 取值：1-50（单位为秒）
     * 注意：如果HealthCHeckTimeout <
     * HealthCheckInterval，则HCTimeout无效，超时时间为HealthCheckInterval。<br />
     * 支持最大值为：50<br />
     * 支持最小值为：1
     */
    private Long healthCheckTimeout;

    /**
     * 用于健康检查的URI。 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。
     * 取值：长度限制为1-80，必须以’/’开头。只能使用字母、数字、‘-’、‘/’、‘.’、‘%’、‘?’、‘#’、‘&’这些字符。
     */
    private String healthCheckURI;

    /**
     * 判定健康检查结果为success的阈值。即，健康检查连续成功多少次后，将后端服务器的健康检查结果由fail改为success。
     * 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。 取值：1-10<br />
     * 支持最大值为：10<br />
     * 支持最小值为：1
     */
    private Long healthyThreshold;

    /**
     * SLB实例前端使用的端口，范围为1-65535。<br />
     * 支持最大值为：65535<br />
     * 支持最小值为：1
     */
    private Long listenerPort;

    /**
     * slb id
     */
    private String loadBalancerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 调度算法。wrr或者wlc，默认wrr。
     */
    private String scheduler;

    /**
     * 是否开启会话保持。 取值：on | off
     */
    private String stickySession;

    /**
     * cookie的处理方式。 该参数在StickySession为on时为必选；当StickySession为off时，此参数设置将被忽略。
     * 取值：insert | server 设置为insert表示由SLB插入，设置为server表示SLB从后端服务器学习。
     */
    private String stickySessionType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 判定健康检查结果为fail的阈值。即，健康检查连续失败多少次后，将后端服务器的健康检查状态由success改为fail。
     * 当HealthCheck为on时，此参数为必选；当HealthCheck为off时，此参数设置将被忽略。 取值：1-10<br />
     * 支持最大值为：10<br />
     * 支持最小值为：1
     */
    private Long unhealthyThreshold;

    /**
     * 通过X-Forwarded-For的方式获取来访者真实IP。on为开启XForwardedFor，off为关闭XForwardedFor
     * ，默认为off。
     */
    private String xForwardedFor;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(backendServerPort, "backendServerPort");
        RequestCheckUtils.checkMaxValue(backendServerPort, 65535L, "backendServerPort");
        RequestCheckUtils.checkMinValue(backendServerPort, 1L, "backendServerPort");
        RequestCheckUtils.checkNotEmpty(bandwidth, "bandwidth");
        RequestCheckUtils.checkMaxValue(bandwidth, 1000L, "bandwidth");
        RequestCheckUtils.checkMinValue(bandwidth, -1L, "bandwidth");
        RequestCheckUtils.checkMaxLength(cookie, 200, "cookie");
        RequestCheckUtils.checkMaxValue(cookieTimeout, 86400L, "cookieTimeout");
        RequestCheckUtils.checkMinValue(cookieTimeout, 1L, "cookieTimeout");
        RequestCheckUtils.checkNotEmpty(healthCheck, "healthCheck");
        RequestCheckUtils.checkMaxValue(healthCheckConnectPort, 65535L, "healthCheckConnectPort");
        RequestCheckUtils.checkMinValue(healthCheckConnectPort, -520L, "healthCheckConnectPort");
        RequestCheckUtils.checkMaxLength(healthCheckDomain, 80, "healthCheckDomain");
        RequestCheckUtils.checkMaxValue(healthCheckInterval, 5L, "healthCheckInterval");
        RequestCheckUtils.checkMinValue(healthCheckInterval, 1L, "healthCheckInterval");
        RequestCheckUtils.checkMaxValue(healthCheckTimeout, 50L, "healthCheckTimeout");
        RequestCheckUtils.checkMinValue(healthCheckTimeout, 1L, "healthCheckTimeout");
        RequestCheckUtils.checkMaxValue(healthyThreshold, 10L, "healthyThreshold");
        RequestCheckUtils.checkMinValue(healthyThreshold, 1L, "healthyThreshold");
        RequestCheckUtils.checkNotEmpty(listenerPort, "listenerPort");
        RequestCheckUtils.checkMaxValue(listenerPort, 65535L, "listenerPort");
        RequestCheckUtils.checkMinValue(listenerPort, 1L, "listenerPort");
        RequestCheckUtils.checkNotEmpty(loadBalancerId, "loadBalancerId");
        RequestCheckUtils.checkNotEmpty(stickySession, "stickySession");
        RequestCheckUtils.checkMaxValue(unhealthyThreshold, 10L, "unhealthyThreshold");
        RequestCheckUtils.checkMinValue(unhealthyThreshold, 1L, "unhealthyThreshold");
    }

    @Override
    public String getApiMethodName() {
        return "slb.aliyuncs.com.CreateLoadBalancerHTTPListener.2014-05-15";
    }

    public Long getBackendServerPort() {
        return this.backendServerPort;
    }

    public Long getBandwidth() {
        return this.bandwidth;
    }

    public String getCookie() {
        return this.cookie;
    }

    public Long getCookieTimeout() {
        return this.cookieTimeout;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getHealthCheck() {
        return this.healthCheck;
    }

    public Long getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public Long getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public Long getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public Long getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public Long getListenerPort() {
        return this.listenerPort;
    }

    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<CreateLoadBalancerHTTPListenerResponse> getResponseClass() {
        return CreateLoadBalancerHTTPListenerResponse.class;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public String getStickySession() {
        return this.stickySession;
    }

    public String getStickySessionType() {
        return this.stickySessionType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("BackendServerPort", this.backendServerPort);
        txtParams.put("Bandwidth", this.bandwidth);
        txtParams.put("Cookie", this.cookie);
        txtParams.put("CookieTimeout", this.cookieTimeout);
        txtParams.put("HealthCheck", this.healthCheck);
        txtParams.put("HealthCheckConnectPort", this.healthCheckConnectPort);
        txtParams.put("HealthCheckDomain", this.healthCheckDomain);
        txtParams.put("HealthCheckInterval", this.healthCheckInterval);
        txtParams.put("HealthCheckTimeout", this.healthCheckTimeout);
        txtParams.put("HealthCheckURI", this.healthCheckURI);
        txtParams.put("HealthyThreshold", this.healthyThreshold);
        txtParams.put("ListenerPort", this.listenerPort);
        txtParams.put("LoadBalancerId", this.loadBalancerId);
        txtParams.put("Scheduler", this.scheduler);
        txtParams.put("StickySession", this.stickySession);
        txtParams.put("StickySessionType", this.stickySessionType);
        txtParams.put("UnhealthyThreshold", this.unhealthyThreshold);
        txtParams.put("XForwardedFor", this.xForwardedFor);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public String getxForwardedFor() {
        return this.xForwardedFor;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBackendServerPort(Long backendServerPort) {
        this.backendServerPort = backendServerPort;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public void setCookieTimeout(Long cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
    }

    public void setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
    }

    public void setHealthCheckConnectPort(Long healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
    }

    public void setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
    }

    public void setHealthCheckInterval(Long healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
    }

    public void setHealthCheckTimeout(Long healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }

    public void setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
    }

    public void setHealthyThreshold(Long healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public void setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
    }

    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public void setStickySession(String stickySession) {
        this.stickySession = stickySession;
    }

    public void setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUnhealthyThreshold(Long unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public void setxForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }
}
