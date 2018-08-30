package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.farm.weekend.gram.weekend_farm_user.fragment.MyFarmFragment;
import com.farm.weekend.gram.weekend_farm_user.fragment.SearchFragment;
import com.farm.weekend.gram.weekend_farm_user.fragment.ShopFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return MyFarmFragment.create();
            case 1: return ShopFragment.create();
            case 2: return SearchFragment.create();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
