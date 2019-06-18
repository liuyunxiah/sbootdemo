package com.xiami.springboot.sbootdemo.domain;

import java.util.Date;

/**
 * 店铺
 * @author LYX
 * @date 2019/6/15
 */
public class Merchant {
    private Integer merchant_id;
    private String  merchant_name;
    private Integer user_id;
    private Date create_time;
    private Integer version;
    private Integer bflag;

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getBflag() {
        return bflag;
    }

    public void setBflag(Integer bflag) {
        this.bflag = bflag;
    }
}
