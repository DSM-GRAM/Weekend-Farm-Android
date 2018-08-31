package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.R

class MyPageStoreItemsAdapter(val storeItems: ArrayList<StoreItem>) : RecyclerView.Adapter<MyPageStoreItemsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPageStoreItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_my_page_store, parent,false)
        return MyPageStoreItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyPageStoreItemsViewHolder, position: Int) {
        holder.itemNameText.text = storeItems[position].itemName
        holder.itemCostText.text = storeItems[position].itemCost
    }
    override fun getItemCount(): Int = this.storeItems.size
}

class MyPageStoreItemsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var itemNameText: TextView = itemView.findViewById(R.id.text_my_page_store_item_name)
    var itemCostText: TextView = itemView.findViewById(R.id.text_my_page_store_item_cost)

}