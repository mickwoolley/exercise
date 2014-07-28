package com.mickw.mickw.datadomain;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by mick on 28/07/2014.
 */
public class OfferItems {

    private int page;
    private int page_size;
    private int total_count;
    private ArrayList<OfferItem> offers = new ArrayList<OfferItem>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public ArrayList<OfferItem> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<OfferItem> offers) {
        this.offers = offers;
    }
}
