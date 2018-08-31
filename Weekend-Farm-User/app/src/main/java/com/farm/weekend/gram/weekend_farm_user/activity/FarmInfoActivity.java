package com.farm.weekend.gram.weekend_farm_user.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.adapter.ApplyAdapter;
import com.farm.weekend.gram.weekend_farm_user.adapter.FarmInfoAdapter;
import com.farm.weekend.gram.weekend_farm_user.model.ApplyModel;
import com.farm.weekend.gram.weekend_farm_user.model.FarmInfoModel;

import java.util.ArrayList;

public class FarmInfoActivity extends AppCompatActivity {

    FarmInfoAdapter infoAdapter;
    RecyclerView inforecyclerView;
    LinearLayoutManager infolinearLayoutManager;

    ArrayList<FarmInfoModel> infoModels;

    Button GotoApply;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_info);

        GotoApply = findViewById(R.id.gotoApply);

        infoModels = new ArrayList<>();
        infoModels.add(new FarmInfoModel("윤재 바보", 434, "남탓 윤재", 34));
        infoAdapter = new FarmInfoAdapter(infoModels);
        infolinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        inforecyclerView = findViewById(R.id.use_recycler);
        inforecyclerView.setHasFixedSize(true);
        inforecyclerView.setAdapter(infoAdapter);
        inforecyclerView.setLayoutManager(infolinearLayoutManager);
        inforecyclerView.setItemAnimator(new DefaultItemAnimator());

        GotoApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ApplyActivity.class);
                startActivity(intent);
            }
        });
    }
}
