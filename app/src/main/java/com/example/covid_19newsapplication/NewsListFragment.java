package com.example.covid_19newsapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class NewsListFragment extends Fragment implements AdapterView.OnItemClickListener {
    private FragmentManager fragmentManager;
    private ArrayList<Data> dataArrayList;
    private ListView newsListView;

   // public NewsListFragment(android.app.FragmentManager fragmentManager, ArrayList<Data> dataArrayList){}
    public NewsListFragment(FragmentManager fragmentManager, ArrayList<Data> dataArrayList){
        this.fragmentManager = fragmentManager;
        this.dataArrayList = dataArrayList;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_newslist, container, false);
        newsListView = (ListView) view.findViewById(R.id.news_list);
        MyAdapter myAdapter = new MyAdapter(dataArrayList, getActivity());
        newsListView.setAdapter(myAdapter);
        newsListView.setOnItemClickListener(this);
        return view;
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //TODO SHOW CONTENTS
        TextView titleText = (TextView) getActivity().findViewById(R.id.title);

    }
}
