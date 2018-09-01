package com.farm.weekend.gram.weekend_farm_admin.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import com.farm.weekend.gram.weekend_farm_admin.AppliedRoomInform.AppliedRoomInformActivity
import com.farm.weekend.gram.weekend_farm_admin.MyPage.MyPageActivity
import com.farm.weekend.gram.weekend_farm_admin.MyRoomInform.MyRoomInformActivity
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

        var check: Boolean = intent.getBooleanExtra("check", false)

        if (check) {
            text_main_applicant_number.text = "신청(2)"
            myRooms.add(MyRoomsItem("2번 양식장", "돌쇠"))

            applicantRooms.add(MyRoomsItem("1번 양식장", "홍길동"))
            applicantRooms.add(MyRoomsItem("3번 양식장", "김미정"))
        } else {
            applicantRooms.add(MyRoomsItem("1번 양식장", "홍길동"))
            applicantRooms.add(MyRoomsItem("2번 양식장", "돌쇠"))
            applicantRooms.add(MyRoomsItem("3번 양식장", "김미정"))
        }

        recycler_main_my_rooms.setHasFixedSize(true)
        recycler_main_my_rooms.layoutManager = lm

        val mAdapter = MainUserAdapter(applicationContext, myRooms)
        recycler_main_my_rooms.adapter = mAdapter

        recycler_main_applicant.setHasFixedSize(true)
        recycler_main_applicant.layoutManager = lm2

        val adapter = MainUserAdapter(applicationContext, applicantRooms)
        recycler_main_applicant.adapter = adapter

        recycler_main_applicant.addOnItemTouchListener(object : ItemClickListener(applicationContext, recycler_main_applicant, object : ItemClickListener.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                intent = Intent(applicationContext, AppliedRoomInformActivity::class.java)
                startActivity(intent)
            }

            override fun onLongItemClick(view: View, position: Int) {

            }
        }) {

        })
        recycler_main_my_rooms.addOnItemTouchListener(object : ItemClickListener(applicationContext, recycler_main_my_rooms, object : ItemClickListener.OnItemClickListener {
            override fun onItemClick(view: View, position: Int) {
                intent = Intent(applicationContext, MyRoomInformActivity::class.java)
                startActivity(intent)
            }

            override fun onLongItemClick(view: View, position: Int) {

            }
        }) {

        })

        btn_main_my_page.setOnClickListener {
            intent = Intent(this, MyPageActivity::class.java)
            startActivity(intent)
        }

    }
}
