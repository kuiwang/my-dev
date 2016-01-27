package com.aliyun.api.slb.slb20140515.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API:
 * slb.aliyuncs.com.DescribeLoadBalancerHTTPListenerAttribute.2014-05-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 8821551253233495977L;

    /**
     * SLB实例后端使用的端口
     */
    @ApiField("BackendServerPort")
    private Long backendServerPort;

    /**
     * 监听的带宽峰值
     */
    @ApiField("Bandwidth")
    private Long bandwidth;

    /**
     * 服务器上配置的cookie。 只有在Type为server时有效。
     */
    @ApiField("Cookie")
    private String cookie;

    /**
     * cookie超时时间
     */
    @ApiField("CookieTimeout")
    private Long cookieTimeout;

    /**
     * 是否开启健康检查。on为开启健康检查，off为关闭健康检查。
     */
    @ApiField("HealthCheck")
    private String healthCheck;

    /**
     * 用于健康检查的域名。
     */
    @ApiField("HealthCheckDomain")
    private String healthCheckDomain;

    /**
     * 健康检查正常的http状态码。
     */
    @ApiField("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    /**
     * 健康检查的时间间隔，单位为秒。
     */
    @ApiField("HealthCheckInterval")
    private Long healthCheckInterval;

    /**
     * 每次健康检查响应的最大超时，单位为秒
     */
    @ApiField("HealthCheckTimeout")
    private Long healthCheckTimeout;

    /**
     * 用于健康检查的URI。
     */
    @ApiField("HealthCheckURI")
    private String healthCheckURI;

    /**
     * 后端服务器从fail到success的连续健康检查成功次数。
     */
    @ApiField("HealthyThreshold")
    private Long healthyThreshold;

    /**
     * SLB实例前端使用的端口
     */
    @ApiField("ListenerPort")
    private Long listenerPort;

    /**
     * 请求的唯一号
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 调度算法。wrr或者wlc。
     */
    @ApiField("Scheduler")
    private String scheduler;

    /**
     * Listener当前状态。包含5种状态：starting、running、configuring、stopping、stopped
     */
    @ApiField("Status")
    private String status;

    /**
     * 是否开启会话保持。on为开启会话保持，off为关闭会话保持。
     */
    @ApiField("StickySession")
    private String stickySession;

    /**
     * cookie的处理方式，设置为insert表示由SLB插入；设置为server表示SLB从后端服务器学习。
     */
    @ApiField("StickySessionType")
    private String stickySessionType;

    /**
     * 后端服务器从success到fail的连续健康检查失败次数。
     */
    @ApiField("UnhealthyThreshold")
    private Long unhealthyThreshold;

    /**
     * 是否开启通过X-Forwarded-For的方式获取来访者真实IP。on为开启XForwardedFor，
     * off为关闭XForwardedFor
     */
    @ApiField("XForwardedFor")
    private String xForwardedFor;

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

    public String getHealthCheck() {
        return this.healthCheck;
    }

    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
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

    public String getRequestId() {
        return this.requestId;
    }

    public String getScheduler() {
        return this.scheduler;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStickySession() {
        return this.stickySession;
    }

    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public Long getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public String getxForwardedFor() {
        return this.xForwardedFor;
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

    public void setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
    }

    public void setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
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

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStickySession(String stickySession) {
        this.stickySession = stickySession;
    }

    public void setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
    }

    public void setUnhealthyThreshold(Long unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public void setxForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }

}
