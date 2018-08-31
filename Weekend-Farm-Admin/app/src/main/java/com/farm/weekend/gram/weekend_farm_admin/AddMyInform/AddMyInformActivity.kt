package com.farm.weekend.gram.weekend_farm_admin.AddMyInform

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.farm.weekend.gram.weekend_farm_admin.R
import kotlinx.android.synthetic.main.activity_add_my_inform.*

class AddMyInformActivity : AppCompatActivity() {
    var rooms: ArrayList<RoomsItem> = ArrayList()
    val lm = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_my_inform)

        recycler_add_my_inform_rooms.setHasFixedSize(true)
        recycler_add_my_inform_rooms.layoutManager = lm
        val mAdapter = AddMyInformRoomsAdapter(applicationContext, rooms)
        recycler_add_my_inform_rooms.adapter = mAdapter

        btn_add_my_inform_add_room.setOnClickListener{
            rooms.add(RoomsItem(edit_add_my_inform_room_name.text.toString(),edit_add_my_inform_room_cost.text.toString(),edit_add_my_inform_room_fish_number.text.toString(), edit_add_my_inform_room_water_temparature.text.toString()))
            mAdapter.notifyDataSetChanged();
        }
    }
}
