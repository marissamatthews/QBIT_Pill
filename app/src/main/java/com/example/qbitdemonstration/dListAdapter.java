package com.example.qbitdemonstration;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class dListAdapter extends BaseAdapter {

    LayoutInflater mInflater ;
    String[] dListNames ;

    public dListAdapter(Context c, String[] dListNames) {
        this.dListNames = dListNames ;

        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;
    }

    @Override
    public int getCount() {
        return dListNames.length;
    }

    @Override
    public Object getItem(int position) {
        return dListNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflater.inflate(R.layout.activity_d_list_adapter, null);
        TextView itemName = (TextView) v.findViewById(R.id.dListItem) ;
        ImageView image = (ImageView) v.findViewById(R.id.dListImage) ;

        itemName.setText(dListNames[position]);

      //  String name = items[position] ;
       // String description = descriptions[position] ;
       // String price = prices[position] ;

       // nameTextView.setText(name) ;
      //  priceTextView.setText(price) ;
       // descriptionTextView.setText(description) ;

        if (position == 0) {
           // checkOrX.setImageResource(R.drawable.redx) ;
            image.setImageResource(R.drawable.ic_perm_contact_calendar_black_24dp);
        } else if (position == 1) {
            image.setImageResource(R.drawable.ic_local_hospital_black_24dp);
        } else if (position == 2){
            image.setImageResource(R.drawable.ic_schedule_black_24dp);
        } else if (position == 3) {
            image.setImageResource(R.drawable.ic_sort_black_24dp);
        } else if (position == 4) {
            image.setImageResource(R.drawable.ic_edit_black_24dp);
        }

        return v ;
    }
}