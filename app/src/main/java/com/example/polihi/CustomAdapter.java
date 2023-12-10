package com.example.polihi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ListItem> {
    public CustomAdapter(Context context, ArrayList<ListItem> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItem item = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.video_item, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView descriptionTextView = convertView.findViewById(R.id.descriptionTextView);
        TextView moneyTextView = convertView.findViewById(R.id.moneyTextView);

        imageView.setImageResource(item.getImageResourceId());
        titleTextView.setText(item.getTitle());
        descriptionTextView.setText(item.getDescription());
        moneyTextView.setText(item.getMoney());

        return convertView;
    }
}