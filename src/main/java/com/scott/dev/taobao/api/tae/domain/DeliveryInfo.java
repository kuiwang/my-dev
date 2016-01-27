package com.scott.dev.taobao.api.tae.domain;

import java.util.List;

/**
 * 物流信息
 */
public class DeliveryInfo {

    /**
     * 运费信息
     */
    private List<Carriage> carriageList;

    /**
     * 物流目的地
     */
    private String destination;

    /**
     * 所在地
     */
    private String location;

    public List<Carriage> getCarriageList() {
        return this.carriageList;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getLocation() {
        return this.location;
    }

    public void setCarriageList(List<Carriage> carriageList) {
        this.carriageList = carriageList;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
