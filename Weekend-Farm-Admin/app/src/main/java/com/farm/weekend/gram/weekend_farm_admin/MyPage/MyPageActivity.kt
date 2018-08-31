package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import com.farm.weekend.gram.weekend_farm_admin.R

class MyPageActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        viewPager = findViewById(R.id.viewpager_my_page)

        pagerAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
        viewPager.setCurrentItem(0)

    }

    class PagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int {
            return 2
        }

        override fun getItem(position: Int): Fragment? {
            when(position) {
                0 -> return MyPageFarmInformFragment()
                1 -> return MyPageStoreInformFragment()
                else -> return null
            }
        }

    }
}
