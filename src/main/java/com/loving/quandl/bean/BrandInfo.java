package com.loving.quandl.bean;

public class BrandInfo {
    private Integer brandid;

    private String brandname;

    private String brandintroduce;

    private String brandlogo;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getBrandintroduce() {
        return brandintroduce;
    }

    public void setBrandintroduce(String brandintroduce) {
        this.brandintroduce = brandintroduce == null ? null : brandintroduce.trim();
    }

    public String getBrandlogo() {
        return brandlogo;
    }

    public void setBrandlogo(String brandlogo) {
        this.brandlogo = brandlogo == null ? null : brandlogo.trim();
    }
}