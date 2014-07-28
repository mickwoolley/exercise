package com.mickw.mickw.datadomain;

import java.util.Date;

/**
 * Created by mick on 28/07/2014.
 */
public class OfferItem {
    int available_count; // would like to change names to more Java like - check GSON mapping possibilities
    String description;
    String discount;
    Date end_date;
    String image;
    String price;
    String title;
}
