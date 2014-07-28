package com.mickw.mickw.datadomain;

import java.util.Date;

/**
 * Created by mick on 28/07/2014.
 */
public class OfferItem {
    private int available_count; // would like to change names to more Java like - check GSON mapping possibilities
    private String description;
    private String discount;
    private Date end_date;
    private String image;
    private String price;
    private String title;
    private String uuid;

    public int getAvailable_count() {
        return available_count;
    }

    public void setAvailable_count(int available_count) {
        this.available_count = available_count;
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

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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
