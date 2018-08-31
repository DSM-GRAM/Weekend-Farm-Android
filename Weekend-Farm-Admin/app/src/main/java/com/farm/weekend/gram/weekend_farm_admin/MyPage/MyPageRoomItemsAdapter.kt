package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.R

class MyPageRoomItemsAdapter(val roomItems: ArrayList<MyPageRoomsItem>) : RecyclerView.Adapter<MyPageRoomItemsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPageRoomItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_my_page_farm, parent,false)
        return MyPageRoomItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyPageRoomItemsViewHolder, position: Int) {
        holder.roomNameEdit.text = Editable.Factory.getInstance().newEditable(roomItems[position].roomName)
        holder.roomCostEdit.text = Editable.Factory.getInstance().newEditable(roomItems[position].roomCost)
        holder.roomFishNumberEdit.text = Editable.Factory.getInstance().newEditable(roomItems[position].roomFishNumber)
        holder.roomWaterTemperatureEdit.text = Editable.Factory.getInstance().newEditable(roomItems[position].roomWaterTemperature)
    }
    override fun getItemCount(): Int = this.roomItems.size
}

class MyPageRoomItemsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var roomNameEdit: EditText = itemView.findViewById(R.id.edit_add_my_page_name)
    var roomCostEdit: EditText = itemView.findViewById(R.id.edit_add_my_page_cost)
    var roomFishNumberEdit: EditText = itemView.findViewById(R.id.edit_add_my_page_fish_number)
    var roomWaterTemperatureEdit: EditText = itemView.findViewById(R.id.edit_add_my_page_water_temparature)

}