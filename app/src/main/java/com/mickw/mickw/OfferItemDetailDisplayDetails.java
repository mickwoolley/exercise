package com.mickw.mickw;

import android.support.v4.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mickw.mickw.datadomain.OfferItem;
import com.mickw.mickw.dummy.DummyContent;

/**
 * Created by mick on 04/08/2014.
 */
public class OfferItemDetailDisplayDetails extends Fragment {

    private View detailsView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.offer_item_details, container, false);
        detailsView = v.findViewById(R.id.offerDetailsView);
        populateView(detailsView);
        return v;
    }


    private void populateView(View detailsView) {
        OfferItem mItem = DummyContent.ITEM_MAP.get(DummyContent.getCurrentSelectedItem());
        TextView endDateView = (TextView) detailsView.findViewById(R.id.offerItemDetailOfferEnds);
        endDateView.setText(mItem.getEndDateAsString());
        TextView descriptionView = (TextView) detailsView.findViewById(R.id.offerItemDetailDescription);
        descriptionView.setText(mItem.getDescription());
        TextView phoneView = (TextView) detailsView.findViewById(R.id.offerItemDetailPhone);
        phoneView.setText(mItem.getPhone());
        TextView emailView = (TextView) detailsView.findViewById(R.id.offerItemDetailEmail);
        emailView.setText(mItem.getEmail());
        TextView webSiteView = (TextView) detailsView.findViewById(R.id.offerItemDetailWebsite);
        webSiteView.setText(mItem.getWebsite());
    }

}
