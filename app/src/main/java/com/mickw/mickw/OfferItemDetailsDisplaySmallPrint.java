package com.mickw.mickw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mickw.mickw.datadomain.OfferItem;
import com.mickw.mickw.dummy.DummyContent;

/**
 * Created by mick on 04/08/2014.
 */
public class OfferItemDetailsDisplaySmallPrint extends Fragment {

    private View smallPrintView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.offer_item_small_print, container, false);
        smallPrintView = v.findViewById(R.id.smallPrintView);
        populateView(smallPrintView);
        return v;
    }


    private void populateView(View smallPrintView) {

        OfferItem mItem = DummyContent.ITEM_MAP.get(DummyContent.getCurrentSelectedItem());
        TextView useView = (TextView) smallPrintView.findViewById(R.id.offerItemDetailHowToUse);
        useView.setText(mItem.getHowToUse());
        TextView termsView = (TextView) smallPrintView.findViewById(R.id.offerItemDetailTerms);
        termsView.setText(mItem.getTerms());
        TextView redeemView = (TextView) smallPrintView.findViewById(R.id.offerItemDescriptionEarliestRedemptionDate);
        redeemView.setText(mItem.getEarliestRedemptionDateAsString());
        TextView expireView = (TextView) smallPrintView.findViewById(R.id.offerItemDescriptionExpiryDate);
        expireView.setText(mItem.getExpiryDateAsString());
    }
}
