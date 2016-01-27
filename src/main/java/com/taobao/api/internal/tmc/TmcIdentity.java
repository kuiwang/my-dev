package com.taobao.api.internal.tmc;

import java.util.Map;

import com.taobao.top.link.LinkException;
import com.taobao.top.link.endpoint.Identity;

/**
 * 消息服务-连接身份标识
 */
class TmcIdentity implements Identity {

    private String appKey;

    private String groupName;

    public TmcIdentity(String appKey, String groupName) {
        this.appKey = appKey;
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Identity id) {
        return id.getClass().equals(TmcIdentity.class)
                && this.appKey.equals(((TmcIdentity) id).appKey)
                && this.groupName.equals(((TmcIdentity) id).groupName);
    }

    @Override
    public int hashCode() {
        return (this.appKey + this.groupName).hashCode();
    }

    @Override
    public Identity parse(Object data) throws LinkException {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void render(Object to) {
        ((Map<String, String>) to).put("app_key", this.appKey);
        ((Map<String, String>) to).put("group_name", this.groupName);
    }

    @Override
    public String toString() {
        return this.appKey + "~" + this.groupName;
    }
}
