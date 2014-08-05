package com.mickw.mickw.datadomain;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
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
    @SerializedName("expiry_date")
    private Date expiryDate;
    @SerializedName("earliest_redemption_date")
    private Date earliestRedemptionDate;
    private String image;
    private String price;
    private String title;
    private String uuid;
    @SerializedName("merchant_contact_email_address")
    private String email;
    @SerializedName("merchant_contact_phone_number")
    private String phone;
    @SerializedName("merchant_website")
    private String website;
    @SerializedName("how_to_use")
    private String howToUse;
    @SerializedName("terms_of_service")
    private String terms;

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

    public String getEndDateAsString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyy");
        return sdf.format(endDate);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHowToUse() {
        return howToUse;
    }

    public void setHowToUse(String howToUse) {
        this.howToUse = howToUse;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getExpiryDateAsString()
    {
        if (expiryDate == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        return sdf.format(expiryDate);
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getEarliestRedemptionDate() {
        return earliestRedemptionDate;
    }

    public String getEarliestRedemptionDateAsString()
    {
        if (earliestRedemptionDate == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        return sdf.format(earliestRedemptionDate);
    }

    public void setEarliestRedemptionDate(Date earliestRedemptionDate) {
        this.earliestRedemptionDate = earliestRedemptionDate;
    }
}
