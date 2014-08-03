package com.mickw.mickw;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.mickw.mickw.datadomain.OfferItem;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mick on 29/07/2014.
 */
public class OfferItemListAdapter extends ArrayAdapter<OfferItem> {
// is BaseAdapter easier in fact? - having problems with scroll currently

    ImageLoader imageLoader;

    private final Context context;
    private final List<OfferItem> offerItems;
    private DisplayImageOptions displayOptions;

    public OfferItemListAdapter(Context context, int resource, List<OfferItem> offerItems) {
        super(context, resource, offerItems);
        this.context = context;
        this.offerItems = offerItems;
        imageLoader = ImageLoader.getInstance();
        displayOptions = new DisplayImageOptions.Builder().imageScaleType(ImageScaleType.EXACTLY_STRETCHED).build();
    }

    static class OffersListViewHolder {
        TextView title;
        TextView description;
        ImageView image;
        TextView remaining;
        TextView validity;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }


    @Override
    public int getCount() {
        return (offerItems == null) ? 0 : offerItems.size();
    }



    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        OffersListViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.offers_list, parent, false); // attach later
            viewHolder = new OffersListViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.title);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.remaining = (TextView) convertView.findViewById(R.id.remaining);
            viewHolder.validity = (TextView) convertView.findViewById(R.id.validity);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (OffersListViewHolder) convertView.getTag();
        }
        OfferItem offerItem = offerItems.get(position);
        viewHolder.description.setText(offerItem.getDescription());
        viewHolder.title.setText(offerItem.getTitle());
        if (offerItem.getAvailableCount() > 0 && offerItem.getAvailableCount() < 300) {
            viewHolder.remaining.setText("Only " + offerItem.getAvailableCount() + " left");
        }
        else {
            viewHolder.remaining.setText(""); // todo hide?
        }
        if (offerItem.getEndDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyy");
            viewHolder.validity.setText("Offer ends " + sdf.format(offerItem.getEndDate()));
        }
        else {
            viewHolder.validity.setText("");
        }
        // probably lots of options for image loading, this is just one I found on web
        imageLoader.displayImage(offerItem.getImage(), viewHolder.image);



        //viewHolder.description.setTag(offerItem.id);?

        return convertView;
    }



    @Override
    public boolean isEmpty() {
        return getCount() > 0;
    }
}
