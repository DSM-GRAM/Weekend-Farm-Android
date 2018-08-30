package com.farm.weekend.gram.weekend_farm_user.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.PagerAdapter;
import com.farm.weekend.gram.weekend_farm_user.view.DonNotSwipeViewPager;


public class MainActivity extends AppCompatActivity{

    TextView titleText;
    DonNotSwipeViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.title_text);
        viewPager = findViewById(R.id.main_view_pager);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_item_farm:
                        viewPager.setCurrentItem(0);
                        return true;

                    case R.id.menu_item_shop:
                        viewPager.setCurrentItem(1);
                        return true;

                    case R.id.menu_item_search:
                        viewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });
//        Connector.api.getUserRepositories()
    }
}
