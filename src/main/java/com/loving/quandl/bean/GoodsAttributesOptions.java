package com.loving.quandl.bean;

public class GoodsAttributesOptions {
    private Integer id;

    private Integer goodsid;

    private Integer optionid;

    private String attributename;

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

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename == null ? null : attributename.trim();
    }

    public String getOptionname() {
        return optionname;
    }

    public void setOptionname(String optionname) {
        this.optionname = optionname == null ? null : optionname.trim();
    }
}