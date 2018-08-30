package com.farm.weekend.gram.weekend_farm_user.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.farm.weekend.gram.weekend_farm_user.R;

public class MyFarmFragment extends Fragment {

    public static Fragment create() {
        MyFarmFragment fragment = new MyFarmFragment();
/*        Bundle args = new Bundle();
        args.putInt("page", pageNumber);
        fragment.setArguments(args);*/
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
        return rootView;
    }
}
