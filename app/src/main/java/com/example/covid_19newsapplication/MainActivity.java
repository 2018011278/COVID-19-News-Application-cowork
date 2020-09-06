package com.example.covid_19newsapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.covid_19newsapplication.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private FrameLayout frameLayout;
    private Context mContext;
    private ArrayList<Data> dataArrayList = null;
    private FragmentManager fragmentManager = null;
    private long exitTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);*/
        mContext = MainActivity.this;
        fragmentManager = getFragmentManager();
        bindViews();

        dataArrayList = new ArrayList<Data>();
        for (int i = 1; i <= 20; i++) {
            Data data = new Data("新闻标题" + i, i + "~新闻内容~~~~~~~~");
            dataArrayList.add(data);
        }
        NewsListFragment newsListFragment = new NewsListFragment(fragmentManager, dataArrayList);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_content, newsListFragment);
        fragmentTransaction.commit();


        //Tabs part
        /*TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);*/
        //Floating action button part
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void bindViews(){
        textView = (TextView) findViewById(R.id.item_title_text);
        frameLayout = (FrameLayout) findViewById(R.id.fragment_content);
    }
}