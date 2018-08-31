package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farm.weekend.gram.weekend_farm_admin.R

class MyPageFarmInformFragment : Fragment {
    constructor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var layout = inflater.inflate(R.layout.fragment_my_page_farm,container,false)
        return layout

    }
}