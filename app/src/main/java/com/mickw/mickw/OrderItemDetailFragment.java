package com.mickw.mickw;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mickw.mickw.R;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;

import com.mickw.mickw.datadomain.OfferItem;
import com.mickw.mickw.dummy.DummyContent;

/**
 * A fragment representing a single OrderItem detail screen.
 * This fragment is either contained in a {@link OrderItemListActivity}
 * in two-pane mode (on tablets) or a {@link OrderItemDetailActivity}
 * on handsets.
 */
public class OrderItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private OfferItem mItem;

    private FragmentTabHost mTabHost;
    private LayoutInflater layoutInflater;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public OrderItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutInflater = getLayoutInflater(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            String uuid = getArguments().getString(ARG_ITEM_ID);
            mItem = DummyContent.ITEM_MAP.get(uuid);
            DummyContent.setCurrentSelectedItem(uuid);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView =  layoutInflater.inflate(R.layout.fragment_orderitem_detail, container, false);

        mTabHost = (FragmentTabHost)rootView;
        // Show the dummy content as text in a TextView.
        if (mItem != null) {

            //mTabHost = new FragmentTabHost(getActivity());

            mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.offer_item_detail);
            mTabHost.addTab(mTabHost.newTabSpec("details").setIndicator("Details"),
                    OfferItemDetailDisplayDetails.class, null);

            mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.offer_item_detail_content);
            mTabHost.addTab(mTabHost.newTabSpec("smallPrint").setIndicator("Small Print"),
                    OfferItemDetailsDisplaySmallPrint.class, null);
        }

        return rootView;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTabHost = null;
    }
}
