package com.mickw.mickw.datadomain;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by mick on 28/07/2014.
 */
public class OfferItems {

    int page;
    int page_size;
    int total_count;
    ArrayList<OfferItem> offers = new ArrayList<OfferItem>();

}
