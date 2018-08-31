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
import android.widget.NumberPicker;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.SearchItemAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.SearchItemModel;

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
        searchItemModels.add(new SearchItemModel("진우네 양식장", 30000000));
        searchItemAdapter = new SearchItemAdapter(searchItemModels, getContext());
        searchlayoutManager = new LinearLayoutManager(getContext());
        searchRecyclerView = rootView.findViewById(R.id.recyclerView);
        searchRecyclerView.setHasFixedSize(true);
        searchRecyclerView.setAdapter(searchItemAdapter);
        searchRecyclerView.setLayoutManager(searchlayoutManager);
        searchRecyclerView.setItemAnimator(new DefaultItemAnimator());

        Searching = rootView.findViewById(R.id.searching);
        numberPicker = rootView.findViewById(R.id.do_picker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(16);
        numberPicker.setDisplayedValues(doData);


        resultView();

        return rootView;
    }

    public void resultView() {
        Searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
