package com.mickw.mickw.dummy;

import com.mickw.mickw.datadomain.OfferItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /*
    Nasty hacks going on, I should be getting this elsewhere I think, probably retrieve in the fragment?
     */

    /**
     * An array of sample (dummy) items.
     */
    public static List<OfferItem> ITEMS = new ArrayList<OfferItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, OfferItem> ITEM_MAP = new HashMap<String, OfferItem>();




    public static void addItem(OfferItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getUuid(), item);
    }


    public static void init() {
        ITEMS.clear();
        ITEM_MAP.clear();
    }
}
