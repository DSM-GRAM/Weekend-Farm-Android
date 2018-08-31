package com.farm.weekend.gram.weekend_farm_user.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.ShopItemAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.ShopItemModel;

import java.util.ArrayList;

public class ShopFragment extends Fragment {

    ArrayList<ShopItemModel> shopItemModels = new ArrayList<>();
    ShopItemAdapter shopItemAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    public static Fragment create() {
        ShopFragment fragment = new ShopFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.shop_fragment, container, false);
        recyclerView = rootView.findViewById(R.id.shop_recycler);

        shopItemModels.add(new ShopItemModel("김윤재", 100, 100000));
        shopItemAdapter = new ShopItemAdapter(shopItemModels, getContext());
        linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setAdapter(shopItemAdapter);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }
}
