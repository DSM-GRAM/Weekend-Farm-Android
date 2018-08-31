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
import com.farm.weekend.gram.weekend_farm_user.adapter.MyFarmItemAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmFishModel;
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmItemModel;

import java.util.ArrayList;
import java.util.List;

public class MyFarmFragment extends Fragment {

    MyFarmFishAdapter fishAdapter;
    MyFarmItemAdapter ItemAdapter;

    RecyclerView fishRecyclerView;
    RecyclerView ItemRecyclerView;
    LinearLayoutManager linearLayoutManager;

    ArrayList<MyFarmItemModel> ItemModel;
    ArrayList<MyFarmFishModel> FishModel;


    public static Fragment create() {
        MyFarmFragment fragment = new MyFarmFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.my_farm_fragment, container, false);
        FishModel = new ArrayList<>();
        FishModel.add(new MyFarmFishModel("김윤재", 1000));
        fishAdapter = new MyFarmFishAdapter(FishModel);
        fishRecyclerView = rootView.findViewById(R.id.fish_recycler);
        fishRecyclerView.setHasFixedSize(true);
        fishRecyclerView.setAdapter(fishAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        fishRecyclerView.setLayoutManager(linearLayoutManager);
        fishRecyclerView.setItemAnimator(new DefaultItemAnimator());

        ItemModel = new ArrayList<>();
        ItemModel.add(new MyFarmItemModel("김윤재", 4234324));
        ItemAdapter = new MyFarmItemAdapter(ItemModel);
        ItemRecyclerView = rootView.findViewById(R.id.item_recycler);
        ItemRecyclerView.setHasFixedSize(true);
        ItemRecyclerView.setAdapter(ItemAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        ItemRecyclerView.setLayoutManager(linearLayoutManager);
        ItemRecyclerView.setItemAnimator(new DefaultItemAnimator());



        return rootView;
    }
}
