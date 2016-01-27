package com.scott.dev.taobao.api.hotel.domain;

/**
 * 酒店订单入住人结构。
 */
public class OrderGuest {

    /**
     * 入住人姓名
     */
    private String name;

    /**
     * 酒店订单id
     */
    private Long oid;

    /**
     * 入住人序号
     */
    private Long personPos;

    /**
     * 房间序号
     */
    private Long roomPos;

    /**
     * 入住人电话
     */
    private String tel;

    public String getName() {
        return this.name;
    }

    public Long getOid() {
        return this.oid;
    }

    public Long getPersonPos() {
        return this.personPos;
    }

    public Long getRoomPos() {
        return this.roomPos;
    }

    public String getTel() {
        return this.tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public void setPersonPos(Long personPos) {
        this.personPos = personPos;
    }

    public void setRoomPos(Long roomPos) {
        this.roomPos = roomPos;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
