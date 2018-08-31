package com.farm.weekend.gram.weekend_farm_admin.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.farm.weekend.gram.weekend_farm_admin.MyPageActivity
import com.farm.weekend.gram.weekend_farm_admin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myRooms: ArrayList<MyRoomsItem> = ArrayList()
    var applicantRooms: ArrayList<MyRoomsItem> = ArrayList()
    val lm = LinearLayoutManager(this)
    val lm2 = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_main_my_rooms.setHasFixedSize(true)
        recycler_main_my_rooms.layoutManager = lm
        myRooms.add(MyRoomsItem("1","roomsUserName"))
        val mAdapter = MainUserAdapter(applicationContext, myRooms)
        recycler_main_my_rooms.adapter = mAdapter

        recycler_main_applicant.setHasFixedSize(true)
        recycler_main_applicant.layoutManager = lm2
        applicantRooms.add(MyRoomsItem("2","roomUserName"))
        val adapter = MainUserAdapter(applicationContext,applicantRooms)
        recycler_main_applicant.adapter = adapter


        btn_main_my_page.setOnClickListener{
            intent = Intent(this,MyPageActivity::class.java)
            startActivity(intent)
        }

    }
}
