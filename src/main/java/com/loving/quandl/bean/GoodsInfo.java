package com.loving.quandl.bean;

public class GoodsInfo {
    private Integer goodsid;

    private String name;

    private String introduce;

    private String details;

    private String imgurl;

    private Double originalprice;

    private Double promotionprice;

    private Integer salesvolume;

    private Integer stock;

    private Integer ishost;

    private Integer isnew;

    private Integer itemid;

    private Integer categoryid;

    private Integer brandid;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Double getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    public Double getPromotionprice() {
        return promotionprice;
    }

    public void setPromotionprice(Double promotionprice) {
        this.promotionprice = promotionprice;
    }

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIshost() {
        return ishost;
    }

    public void setIshost(Integer ishost) {
        this.ishost = ishost;
    }

    public Integer getIsnew() {
        return isnew;
    }

    public void setIsnew(Integer isnew) {
        this.isnew = isnew;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }
}