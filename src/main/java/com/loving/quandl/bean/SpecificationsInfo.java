package com.loving.quandl.bean;

public class SpecificationsInfo {
    private Integer specificationid;

    private String specificationname;

    public Integer getSpecificationid() {
        return specificationid;
    }

    public void setSpecificationid(Integer specificationid) {
        this.specificationid = specificationid;
    }

    public String getSpecificationname() {
        return specificationname;
    }

    public void setSpecificationname(String specificationname) {
        this.specificationname = specificationname == null ? null : specificationname.trim();
    }
}