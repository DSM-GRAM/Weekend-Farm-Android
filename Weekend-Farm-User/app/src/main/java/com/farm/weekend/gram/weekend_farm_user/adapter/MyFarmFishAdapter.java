package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmFishModel;

import java.util.List;

public class MyFarmFishAdapter extends RecyclerView.Adapter<MyFarmFishAdapter.ViewHolder>{

    private final List<MyFarmFishModel> items;

    public MyFarmFishAdapter(List<MyFarmFishModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.my_farm_fish_item, parent ,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyFarmFishModel item = items.get(position);
        holder.fish_data.setText(item.fishName + " " + item.fishNum + "마리");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView fish_data;

                ViewHolder(View viewItems) {
            super(viewItems);
            fish_data = (TextView) viewItems.findViewById(R.id.fish_data_text);
        }
    }
}
