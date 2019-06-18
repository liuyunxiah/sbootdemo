package com.xiami.springboot.sbootdemo.domain.dto;

import java.util.Date;

/**
 * 商品类型
 * @author LYX
 * @date 2019/6/15
 */
public class TypeDTO {
    private Integer type_id;
    private String type_name;
    private String type_code;
    private Integer type_bflag;
    private Date create_time;
    private Integer version;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_code() {
        return type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
    }

    public Integer getType_bflag() {
        return type_bflag;
    }

    public void setType_bflag(Integer type_bflag) {
        this.type_bflag = type_bflag;
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
}
