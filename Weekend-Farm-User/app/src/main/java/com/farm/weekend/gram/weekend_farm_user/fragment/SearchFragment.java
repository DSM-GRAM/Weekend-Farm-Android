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
import android.widget.Button;
import android.widget.NumberPicker;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.SearchItemAdapter;
import com.farm.weekend.gram.weekend_farm_user.connect.Connector;
import com.farm.weekend.gram.weekend_farm_user.connect.Res;
import com.farm.weekend.gram.weekend_farm_user.model.SearchItemModel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    String[] doData = new String[]{
            "서울특별시",
            "부산광역시",
            "대구광역시",
            "인천광역시",
            "광주광역시",
            "대전광역시",
            "울산광역시",
            "세종특별자치시",
            "경기도",
            "강원도",
            "충청북도",
            "충청남도",
            "전라북도",
            "전라남도",
            "경상북도",
            "경상남도",
            "제주도"
    };
    NumberPicker numberPicker;

    Button Searching;

    SearchItemAdapter searchItemAdapter;
    RecyclerView searchRecyclerView;
    LinearLayoutManager searchlayoutManager;

    ArrayList<SearchItemModel> searchItemModels;

    String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiI1MWI3NTQ4OC1jZTg0LTRiNzEtYjgzYi0zNzgwMDVkODg0NDQiLCJmcmVzaCI6ZmFsc2UsInR5cGUiOiJhY2Nlc3MiLCJpZGVudGl0eSI6ImFiYyIsImlhdCI6MTUzNTczNzI5MiwibmJmIjoxNTM1NzM3MjkyLCJleHAiOjE1MzgzMjkyOTJ9.7bG0O8YLxYTMdt8WyTR76LV_4d7wB8kFvt4hHpBKrFc";
    public static SearchFragment create() {
        SearchFragment fragment = new SearchFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.search_fragment, container, false);

        searchItemModels = new ArrayList<>();
        //searchItemModels.add(new SearchItemModel("진우네 양식장", 30000000));
        Searching = rootView.findViewById(R.id.searching);
        numberPicker = rootView.findViewById(R.id.do_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setDisplayedValues(doData);

        searchRecyclerView = rootView.findViewById(R.id.recyclerView);

        resultView();

        return rootView;
    }

    public void resultView() {
        Searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connector.api.getSearchResult(token, numberPicker.getValue()).enqueue(new Res<JsonArray>(getActivity().getApplicationContext()) {
                    @Override
                    public void callback(int code, JsonArray body) {
                        Log.e("TEST", String.valueOf(code));
                        if(code == 200){
                            searchItemModels = new Gson().fromJson(body.toString(), new TypeToken<ArrayList<SearchItemModel>>(){}.getType());
                            searchItemAdapter = new SearchItemAdapter(searchItemModels, getContext());
                            searchlayoutManager = new LinearLayoutManager(getContext());
                            searchRecyclerView.setHasFixedSize(true);
                            searchRecyclerView.setAdapter(searchItemAdapter);
                            searchRecyclerView.setLayoutManager(searchlayoutManager);
                            searchRecyclerView.setItemAnimator(new DefaultItemAnimator());
                            Log.e("TEST", body.toString());
                        }
                    }
                });
            }
        });
    }
}
