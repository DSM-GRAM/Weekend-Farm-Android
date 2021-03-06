package com.farm.weekend.gram.weekend_farm_admin.AppliedRoomInform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.AddMyInformRoomsAdapter
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.RoomsItem
import com.farm.weekend.gram.weekend_farm_admin.Main.MainActivity
import com.farm.weekend.gram.weekend_farm_admin.R
import kotlinx.android.synthetic.main.activity_add_my_inform.*
import kotlinx.android.synthetic.main.activity_applied_room_inform.*

class AppliedRoomInformActivity : AppCompatActivity() {
    var fishes: ArrayList<AppliedFishesItem> = ArrayList()
    val lm = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applied_room_inform)

        recycler_applied_room_inform_fish.setHasFixedSize(true)
        recycler_applied_room_inform_fish.layoutManager = lm
        fishes.add(AppliedFishesItem("광어","12"))
        fishes.add(AppliedFishesItem("새우","20"))
        val mAdapter = AppliedRoomInformFishesAdapter(applicationContext, fishes)
        recycler_applied_room_inform_fish.adapter = mAdapter

        btn_applied_room_inform_accept.setOnClickListener {
            intent = Intent(applicationContext,MainActivity::class.java)
            intent.putExtra("check",true)
            startActivity(intent)
        }
    }
}
