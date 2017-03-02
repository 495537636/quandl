package com.loving.quandl.bean;

public class AttributeOptions {
    private Integer optionid;

    private Integer attributeid;

    private String optionname;

    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }

    public Integer getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(Integer attributeid) {
        this.attributeid = attributeid;
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }
}