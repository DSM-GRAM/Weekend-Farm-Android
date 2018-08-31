package com.farm.weekend.gram.weekend_farm_user.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.MyFarmFishAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmFishModel;

import java.util.ArrayList;
import java.util.List;

public class MyFarmFragment extends Fragment {

    MyFarmFishAdapter mAdapter;
    RecyclerView mRecyclerView;
    LinearLayoutManager linearLayoutManager;

    List<MyFarmFishModel> FishModel;


    public static Fragment create() {
        MyFarmFragment fragment = new MyFarmFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.my_farm_fragment, container, false);
        FishModel = new ArrayList<>();
        FishModel.add(new MyFarmFishModel("김윤재", 1000));
        mAdapter = new MyFarmFishAdapter(FishModel);
        mRecyclerView = rootView.findViewById(R.id.fish_recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    public void addData(){

    }
}
