package com.exception.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.exception.instagramclone.Adapters.HighlightAdapter;
import com.exception.instagramclone.Adapters.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpHighlights();
        setUpTabs();
    }

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private void setUpTabs() {
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_photo_size_select_actual_24));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_video_library_24));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setUpHighlights() {
        RecyclerView highligtRV = findViewById(R.id.highLightRV);
        highligtRV.setAdapter(new HighlightAdapter(this, 10));
        highligtRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
    }
}