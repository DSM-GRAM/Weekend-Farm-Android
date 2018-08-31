package com.farm.weekend.gram.weekend_farm_user.adapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.farm.weekend.gram.weekend_farm_user.R;
import com.farm.weekend.gram.weekend_farm_user.fragment.BuyDialogFragment;
import com.farm.weekend.gram.weekend_farm_user.model.MyFarmItemModel;
import com.farm.weekend.gram.weekend_farm_user.model.ShopItemModel;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class ShopItemAdapter extends RecyclerView.Adapter<ShopItemAdapter.ViewHolder>{

    private final List<ShopItemModel> items;

    public ShopItemAdapter(List<ShopItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.shop_item, parent ,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ShopItemModel item = items.get(position);
        holder.item_text.setText(item.buyItemName + " " + item.buyItemNum + "개");
        holder.item_money.setText(item.buyItemMoney + "원");
        holder.CallDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuyDialogFragment dialog = new BuyDialogFragment(this);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        Button CallDialog;
        TextView item_text;
        TextView item_money;
                ViewHolder(View viewItems) {
                    super(viewItems);
            CallDialog = (Button) viewItems.findViewById(R.id.buying_button);
            item_money = (TextView) viewItems.findViewById(R.id.item_price);
            item_text = (TextView) viewItems.findViewById(R.id.item_text);

        }
    }
}
