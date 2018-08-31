package com.farm.weekend.gram.weekend_farm_user.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.ShopItemAdapter;
import com.farm.weekend.gram.weekend_farm_user.connect.Connector;
import com.farm.weekend.gram.weekend_farm_user.connect.Res;
import com.farm.weekend.gram.weekend_farm_user.model.SearchItemModel;
import com.farm.weekend.gram.weekend_farm_user.model.ShopItemModel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.util.ArrayList;

import static com.farm.weekend.gram.weekend_farm_user.util.UtilClass.TOKEN;

public class ShopFragment extends Fragment {

    ArrayList<ShopItemModel> shopItemModels;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.shop_fragment, container, false);
        recyclerView = rootView.findViewById(R.id.shop_recycler);

        Connector.api.getStoreApply(TOKEN).enqueue(new Res<JsonArray>(getActivity().getApplicationContext()) {
            @Override
            public void callback(int code, JsonArray body) {
                Log.e("TEST", String.valueOf(code));
                if(code == 200){
                    shopItemModels = new Gson().fromJson(body.toString(), new TypeToken<ArrayList<ShopItemModel>>(){}.getType());
                    shopItemAdapter = new ShopItemAdapter(shopItemModels, getContext());
                    linearLayoutManager = new LinearLayoutManager(getContext());
                    recyclerView.setAdapter(shopItemAdapter);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    Log.e("TEST", body.toString());
                }
            }
        });
        return rootView;
    }
}
