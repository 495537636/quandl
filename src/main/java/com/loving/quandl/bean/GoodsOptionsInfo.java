package com.loving.quandl.bean;

public class GoodsOptionsInfo {
    private Integer id;

    private Integer goodsid;

    private Integer optionid;

    private String specificationname;

    private String optionname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getOptionid() {
        return optionid;
    }

    public void setOptionid(Integer optionid) {
        this.optionid = optionid;
    }

    public String getSpecificationname() {
        return specificationname;
    }

    public void setSpecificationname(String specificationname) {
        this.specificationname = specificationname == null ? null : specificationname.trim();
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }
}