package com.example.covid_19newsapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Data> mData;
    private Context mContext;
    public MyAdapter(List<Data> mData, Context mContext){
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount(){
        return mData.size();
    }
    @Override
    public Object getItem(int position){
        return null;
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View converView, ViewGroup parent){
        ViewHolder viewHolder;
        if (converView == null){
            converView = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.itemTitleText = (TextView) converView.findViewById(R.id.item_title_text);
            converView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) converView.getTag();
        }
        viewHolder.itemTitleText.setText(mData.get(position).getNewsTitle());
        return converView;
    }
    private class ViewHolder{
        TextView itemTitleText;
    }
}
