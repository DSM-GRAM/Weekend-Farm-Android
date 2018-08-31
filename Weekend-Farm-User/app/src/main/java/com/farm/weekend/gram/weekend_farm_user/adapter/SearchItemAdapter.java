package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.model.SearchItemModel;
import com.farm.weekend.gram.weekend_farm_user.model.ShopItemModel;

import java.util.List;

public class SearchItemAdapter extends RecyclerView.Adapter<SearchItemAdapter.ViewHolder>{

    private final List<SearchItemModel> items;

    public SearchItemAdapter(List<SearchItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.search_item, parent ,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchItemModel item = items.get(position);
        holder.item_text.setText(item.farmName);
        holder.item_money.setText(item.farmMoney);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_text;
        TextView item_money;
                ViewHolder(View viewItems) {
                    super(viewItems);

            item_money = (TextView) viewItems.findViewById(R.id.search_price);
            item_text = (TextView) viewItems.findViewById(R.id.search_price);

        }
    }
}