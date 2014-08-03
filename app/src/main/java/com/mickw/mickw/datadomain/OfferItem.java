package com.mickw.mickw.datadomain;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by mick on 28/07/2014.
 */
public class OfferItem {
    @SerializedName("available_count")
    private int availableCount;
    private String description;
    private String discount;
    @SerializedName("end_date")
    private Date endDate;
    private String image;
    private String price;
    private String title;
    private String uuid;

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String toString() {
        return "Desc: " + getDescription();
    }
}
