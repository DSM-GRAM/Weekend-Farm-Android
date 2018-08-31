package com.farm.weekend.gram.weekend_farm_admin.Main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.farm.weekend.gram.weekend_farm_admin.R

class MainUserAdapter(val context: Context, val rooms: ArrayList<MyRoomsItem>) : RecyclerView.Adapter<MainUserViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainUserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_main_user, parent,false)
        return MainUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainUserViewHolder, position: Int) {
        holder.roomNameText.text = rooms.get(position).roomName
        holder.roomUserNameText.text = rooms.get(position).roomUserName
    }
    override fun getItemCount(): Int = this.rooms.size
}

class MainUserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var roomNameText: TextView = itemView.findViewById(R.id.text_main_room_name)
    var roomUserNameText: TextView = itemView.findViewById(R.id.text_main_room_user_name)

}