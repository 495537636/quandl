package com.loving.quandl.bean;

public class SpecificationOptions {
    private Integer optionid;

    private Integer specificationid;

    private String optionname;

    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }

    public Integer getSpecificationid() {
        return specificationid;
    }

    public void setSpecificationid(Integer specificationid) {
        this.specificationid = specificationid;
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }
}