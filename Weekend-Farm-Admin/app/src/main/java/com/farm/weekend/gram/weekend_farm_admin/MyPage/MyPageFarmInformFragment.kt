package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.RoomsItem
import com.farm.weekend.gram.weekend_farm_admin.R
import com.farm.weekend.gram.weekend_farm_admin.util.UtilClass.showToast
import kotlinx.android.synthetic.main.fragment_my_page_farm.*
import kotlinx.android.synthetic.main.fragment_my_page_farm.view.*
import kotlinx.android.synthetic.main.fragment_my_page_store.*
import kotlinx.android.synthetic.main.fragment_my_page_store.view.*

class MyPageFarmInformFragment : Fragment {
    constructor()

    var roomItems: ArrayList<MyPageRoomsItem> = ArrayList()
    val lm = LinearLayoutManager(context)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var layout: ConstraintLayout = inflater.inflate(R.layout.fragment_my_page_farm,container,false) as ConstraintLayout
        var recycler: RecyclerView = layout.findViewById(R.id.recycler_my_page_rooms)

        recycler.setHasFixedSize(true)
        recycler.layoutManager = lm
        roomItems.add(MyPageRoomsItem("1번 양식장","160000","35","25"))
        roomItems.add(MyPageRoomsItem("2번 양식장","150000","32","26"))
        roomItems.add(MyPageRoomsItem("3번 양식장","200000","50","27"))
        val mAdapter = MyPageRoomItemsAdapter(roomItems)
        recycler.adapter = mAdapter

        layout.btn_my_page_add_room.setOnClickListener {

            if (!(edit_my_page_room_name.text.isEmpty() || edit_my_page_room_cost.text.isEmpty() || edit_my_page_room_fish_number.text.isEmpty() || edit_my_page_room_water_temparature.text.isEmpty())) {
                roomItems.add(MyPageRoomsItem(edit_my_page_room_name.text.toString(), edit_my_page_room_cost.text.toString(), edit_my_page_room_fish_number.text.toString(), edit_my_page_room_water_temparature.text.toString()))
                Log.d("Debug","roomsItems: "+roomItems[0].roomName)
                mAdapter.notifyDataSetChanged()
                edit_my_page_room_name.text == Editable.Factory.getInstance().newEditable(null)
                edit_my_page_room_cost.text == Editable.Factory.getInstance().newEditable(null)
                edit_my_page_room_fish_number.text == Editable.Factory.getInstance().newEditable(null)
                edit_my_page_room_water_temparature.text == Editable.Factory.getInstance().newEditable(null)
            }
        }
        return layout

    }
}