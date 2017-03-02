package com.loving.quandl.bean;

public class CategoryInfo {
    private Integer categoryid;

    private String categoryname;

    private String categoryintroduce;

    private Integer parentid;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public String getCategoryintroduce() {
        return categoryintroduce;
    }

    public void setCategoryintroduce(String categoryintroduce) {
        this.categoryintroduce = categoryintroduce == null ? null : categoryintroduce.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}