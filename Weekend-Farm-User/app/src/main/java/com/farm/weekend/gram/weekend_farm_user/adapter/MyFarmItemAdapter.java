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
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmItemModel;

import java.util.List;

public class MyFarmItemAdapter extends RecyclerView.Adapter<MyFarmItemAdapter.ViewHolder>{

    private final List<MyFarmItemModel> items;

    public MyFarmItemAdapter(List<MyFarmItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.my_farm_item_item, parent ,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyFarmItemModel item = items.get(position);
        holder.item_text.setText(item.cItemName + " " + item.cItemNum + "개");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_text;

                ViewHolder(View viewItems) {
            super(viewItems);
            item_text = (TextView) viewItems.findViewById(R.id.item_text);
        }
    }
}
