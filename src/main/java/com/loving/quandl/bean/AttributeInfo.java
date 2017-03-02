package com.loving.quandl.bean;

public class AttributeInfo {
    private Integer attributeid;

    private String attributename;

    private Integer categoryid;

    public Integer getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(Integer attributeid) {
        this.attributeid = attributeid;
    }

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename == null ? null : attributename.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
}