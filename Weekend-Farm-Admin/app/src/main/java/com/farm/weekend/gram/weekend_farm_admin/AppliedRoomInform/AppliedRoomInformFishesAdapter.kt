package com.farm.weekend.gram.weekend_farm_admin.AppliedRoomInform

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.RoomsItem
import com.farm.weekend.gram.weekend_farm_admin.R

class AppliedRoomInformFishesAdapter(val context: Context, val fishes: ArrayList<AppliedFishesItem>) : RecyclerView.Adapter<AppliedRoomInformFishesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppliedRoomInformFishesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_applied_room_inform_fish, parent,false)
        return AppliedRoomInformFishesViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppliedRoomInformFishesViewHolder, position: Int) {
        holder.fishNameText.text = fishes.get(position).fishName
        holder.fishNumberText.text = fishes.get(position).fishNumber
    }
    override fun getItemCount(): Int = this.fishes.size
}

class AppliedRoomInformFishesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var fishNameText: TextView = itemView.findViewById(R.id.text_applied_room_inform_fish_name)
    var fishNumberText: TextView = itemView.findViewById(R.id.text_applied_room_inform_fish_number)

}