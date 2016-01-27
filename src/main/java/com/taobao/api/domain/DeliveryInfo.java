package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryInfo extends TaobaoObject {

    private static final long serialVersionUID = 7813748928757394153L;

    /**
     * 运费信息
     */
    @ApiListField("carriage_list")
    @ApiField("carriage")
    private List<Carriage> carriageList;

    /**
     * 物流目的地
     */
    @ApiField("destination")
    private String destination;

    /**
     * 所在地
     */
    @ApiField("location")
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
