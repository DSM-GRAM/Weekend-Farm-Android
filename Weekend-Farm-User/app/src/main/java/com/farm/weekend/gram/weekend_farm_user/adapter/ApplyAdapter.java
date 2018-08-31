package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.model.ApplyModel;
import com.farm.weekend.gram.weekend_farm_user.model.FarmInfoModel;

import java.util.List;

public class ApplyAdapter extends RecyclerView.Adapter<ApplyAdapter.ViewHolder>{

    private final List<ApplyModel> ApplyModelList;

    public ApplyAdapter(List<ApplyModel> ApplyModelList) {
        this.ApplyModelList = ApplyModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.apply_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ApplyModel item = ApplyModelList.get(position);
    }

    @Override
    public int getItemCount() {
        return ApplyModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ApplyRoomImage;
        ImageView FishImage;

        NumberPicker RoomText;
        NumberPicker FishKindText;
        NumberPicker FishNum;

        public ViewHolder(View itemView) {
            super(itemView);
            ApplyRoomImage = (ImageView) itemView.findViewById(R.id.apply_room_image);
            FishImage = (ImageView) itemView.findViewById(R.id.apply_fish_image);

            RoomText = (NumberPicker) itemView.findViewById(R.id.apply_room_Picker);
            FishKindText = (NumberPicker) itemView.findViewById(R.id.fish_Picker);
            FishNum = (NumberPicker) itemView.findViewById(R.id.apply_fish_Picker);
        }
    }
}
