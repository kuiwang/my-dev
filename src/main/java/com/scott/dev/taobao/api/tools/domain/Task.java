package com.scott.dev.taobao.api.tools.domain;

import java.util.Date;

/*
 * 批量异步任务结果
 */
public class Task {

    /*
     * 异步任务id。创建异步任务时返回的任务id号
     */
    private Long taskId;

    /*
     * 异步任务处理状态。new（还未开始处理），doing（处理中），done（处理结束）。
     */
    private String status;

    /*
     *  子任务处理结果，如果任务还没有处理完，返回的结果列表为空。如果任务处理完毕，返回子任务结果列表
     */
    private SubTask[] subtasks;

    /*
     * 此任务是由哪个api产生的
     */
    private String method;

    /*
     * 任务创建时间
     */
    private Date created;

    /*
     * 大任务结果下载地址。当创建的认任务是大数据量的任务时，获取结果会返回此字段，
     * 同时subtasks列表会为空。 通过这个地址可以下载到结果的结构体，格式同普通任务下载的一样。 
     * 每次获取到的地址只能下载一次。下载的文件加上后缀名.zip打开。
     */
    private String downloadUrl;

    /*
     * 下载文件的MD5校验码，通过此校验码可以检查下载的文件是否是完整的。
     */
    private String checkCode;

    /*
     * 定时类型任务的执行时间点
     */
    private Date schedule;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubTask[] getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(SubTask[] subtasks) {
        this.subtasks = subtasks;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }
}
