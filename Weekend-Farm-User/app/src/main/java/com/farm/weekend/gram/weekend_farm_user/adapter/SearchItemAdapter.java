package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.activity.FarmInfoActivity;
import com.farm.weekend.gram.weekend_farm_user.activity.MainActivity;
import com.farm.weekend.gram.weekend_farm_user.model.SearchItemModel;
import com.farm.weekend.gram.weekend_farm_user.model.ShopItemModel;

import java.util.List;

public class SearchItemAdapter extends RecyclerView.Adapter<SearchItemAdapter.ViewHolder>{

    private final List<SearchItemModel> items;
    private Context context;

    public SearchItemAdapter(List<SearchItemModel> items, Context context) {
        this.context = context;
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
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        SearchItemModel item = items.get(position);
        holder.item_text.setText(item.farmName);
        holder.item_money.setText("" + item.farmMoney);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FarmInfoActivity.class);
                context.getApplicationContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_text;
        TextView item_money;
        CardView cardView;

        @SuppressLint("CutPasteId")
        ViewHolder(View viewItems) {
            super(viewItems);
            item_money = (TextView) viewItems.findViewById(R.id.search_price);
            item_text = (TextView) viewItems.findViewById(R.id.search_name);
            cardView = viewItems.findViewById(R.id.search_cardview);
        }
    }
}
