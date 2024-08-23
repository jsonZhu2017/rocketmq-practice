package com.rocketmq.cloud.youxia.bo;

import lombok.Data;

import java.io.Serializable;

//@Data
public class SevenGoodBo implements Serializable {
    private Long goodId;
    private String skuId;
    private Integer num;
    private String price;
    private Long gobalUuid;
    private Long parentUuid;
    private Long currentUuid;
    private Long userId;
    private Long uk;

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getGobalUuid() {
        return gobalUuid;
    }

    public void setGobalUuid(Long gobalUuid) {
        this.gobalUuid = gobalUuid;
    }

    public Long getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(Long parentUuid) {
        this.parentUuid = parentUuid;
    }

    public Long getCurrentUuid() {
        return currentUuid;
    }

    public void setCurrentUuid(Long currentUuid) {
        this.currentUuid = currentUuid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUk() {
        return uk;
    }

    public void setUk(Long uk) {
        this.uk = uk;
    }
}
