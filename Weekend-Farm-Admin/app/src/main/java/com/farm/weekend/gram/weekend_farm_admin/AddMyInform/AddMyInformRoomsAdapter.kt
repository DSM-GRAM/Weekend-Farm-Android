package com.farm.weekend.gram.weekend_farm_admin.AddMyInform

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.R

class AddMyInformRoomsAdapter(val context: Context, val rooms: ArrayList<RoomsItem>) : RecyclerView.Adapter<AddMyInformRoomsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddMyInformRoomsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_add_my_inform_rooms, parent,false)
        return AddMyInformRoomsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AddMyInformRoomsViewHolder, position: Int) {
        holder.roomNameText.text = rooms.get(position).roomName
        holder.roomCostText.text = rooms.get(position).roomCost
        holder.roomFishNumberText.text = rooms.get(position).roomFishNumber
        holder.roomWaterTemparatureText.text = rooms.get(position).roomWaterTemperature
    }
    override fun getItemCount(): Int = this.rooms.size
}

class AddMyInformRoomsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var roomNameText: TextView = itemView.findViewById(R.id.text_add_my_inform_room_name)
    var roomCostText: TextView = itemView.findViewById(R.id.text_add_my_inform_room_cost)
    var roomFishNumberText: TextView = itemView.findViewById(R.id.text_add_my_inform_room_fish_number)
    var roomWaterTemparatureText: TextView = itemView.findViewById(R.id.text_add_my_inform_room_water_temparature)

}