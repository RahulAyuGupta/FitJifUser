package com.fitjifuser.ui.MyWorkout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fitjifuser.R;
import com.fitjifuser.ui.MyWorkout.adapter.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MyWorkoutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_workout);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupActionBar();
        setUpUi();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
    private void setUpUi(){
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager =(ViewPager)findViewById(R.id.viewpager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTabLayout =(TabLayout)findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }


    private void setupActionBar() {
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        //actionBar.setHomeAsUpIndicator(R.drawable.abc_ic_ab_back_material);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_keyboard_arrow_left_24);
        actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
        actionBar.setDisplayShowCustomEnabled(true);
        ActionBar.LayoutParams param = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.title_bar_view, null);
        TextView header = (TextView) v.findViewById(R.id.title_txt);
        header.setText("My Workout");
        actionBar.setCustomView(v,param);
    }
}