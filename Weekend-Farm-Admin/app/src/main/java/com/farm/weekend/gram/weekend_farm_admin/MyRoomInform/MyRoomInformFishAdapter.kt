package com.farm.weekend.gram.weekend_farm_admin.MyRoomInform

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.RoomsItem
import com.farm.weekend.gram.weekend_farm_admin.R

class MyRoomInformFishAdapter(val context: Context, val fishes: ArrayList<FishItem>) : RecyclerView.Adapter<MyRoomInformFishViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRoomInformFishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_my_room_inform_fish, parent,false)
        return MyRoomInformFishViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRoomInformFishViewHolder, position: Int) {

        holder.fishNameEdit.text = Editable.Factory.getInstance().newEditable(fishes.get(position).fishName)
        holder.fishNumberEdit.text = Editable.Factory.getInstance().newEditable(fishes.get(position).fishNumber)
    }
    override fun getItemCount(): Int = this.fishes.size
}

class MyRoomInformFishViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var fishNameEdit: EditText = itemView.findViewById(R.id.edit_my_room_inform_fish_name)
    var fishNumberEdit: EditText = itemView.findViewById(R.id.edit_my_room_inform_fish_number)

}