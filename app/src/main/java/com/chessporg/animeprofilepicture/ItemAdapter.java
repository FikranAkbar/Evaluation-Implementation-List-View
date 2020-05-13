package com.chessporg.animeprofilepicture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProvider;

import java.util.zip.Inflater;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] names;
    String[] animes;

    public ItemAdapter(Context c, String[] n, String[] a) {
        names = n;
        animes = a;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_list_detail, null);
        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView descTextView = v.findViewById(R.id.descTextView);

        nameTextView.setText(names[position]);
        descTextView.setText(animes[position]);

        return v;
    }
}
