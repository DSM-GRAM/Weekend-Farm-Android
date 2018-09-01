package com.farm.weekend.gram.weekend_farm_user.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.ApplyAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.ApplyModel;
import com.farm.weekend.gram.weekend_farm_user.util.UtilClass;

import java.util.ArrayList;

import okhttp3.internal.Util;

public class ApplyActivity extends AppCompatActivity {

    ApplyAdapter applyAdapter;
    RecyclerView applyrecyclerView;
    LinearLayoutManager applylinearLayoutManager;

    ArrayList<ApplyModel> applyModels;

    Button apply_btn;

    int i;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        apply_btn = findViewById(R.id.apply_button);

        applyModels = new ArrayList<>();
        applyModels.add(new ApplyModel("윤재 바보", 434, "남탓 윤재"));
        applyAdapter = new ApplyAdapter(applyModels);
        applylinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        applyrecyclerView = findViewById(R.id.add_use_recycler);
        applyrecyclerView.setHasFixedSize(true);
        applyrecyclerView.setAdapter(applyAdapter);
        applyrecyclerView.setLayoutManager(applylinearLayoutManager);
        applyrecyclerView.setItemAnimator(new DefaultItemAnimator());

        apply_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                UtilClass.asdf = 1;
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                UtilClass.Toast(getApplicationContext(), "신청 되었습니다");
            }
        });
    }
}