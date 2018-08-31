package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.model.FarmInfoModel;

import android.widget.ImageView;

import java.util.List;
import java.util.zip.Inflater;

public class FarmInfoAdapter extends RecyclerView.Adapter<FarmInfoAdapter.ViewHolder>{

    private final List<FarmInfoModel> farmInfoModelList;

    public FarmInfoAdapter(List<FarmInfoModel> farmInfoModelList) {
        this.farmInfoModelList = farmInfoModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.farm_info_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FarmInfoModel item = farmInfoModelList.get(position);
        holder.RoomText.setText(item.getRoomText() + "번 양식장");
        holder.MoneyText.setText(item.getMoneyText() + " 원/월");
        holder.FishText.setText(item.getFishText() + "마리 수용가능");
        holder.TemperatureText.setText(("평균 온도" + item.getTemperatureText() + "℃"));
    }

    @Override
    public int getItemCount() {
        return farmInfoModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView RoomImage;
        ImageView MoneyImage;
        ImageView FishImage;
        ImageView TemperatureImage;

        TextView RoomText;
        TextView MoneyText;
        TextView FishText;
        TextView TemperatureText;

        public ViewHolder(View itemView) {
            super(itemView);
            RoomImage = (ImageView) itemView.findViewById(R.id.room_image);
            MoneyImage = (ImageView) itemView.findViewById(R.id.money_image);
            FishImage = (ImageView) itemView.findViewById(R.id.fish_image);
            TemperatureImage = (ImageView) itemView.findViewById(R.id.temperature_image);

            RoomText = (TextView) itemView.findViewById(R.id.room_text);
            MoneyText = (TextView) itemView.findViewById(R.id.money_text);
            FishText = (TextView) itemView.findViewById(R.id.fish_text);
            TemperatureText = (TextView) itemView.findViewById(R.id.temperature_text);
        }
    }
}
