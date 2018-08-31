package com.farm.weekend.gram.weekend_farm_admin.MyPage

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farm.weekend.gram.weekend_farm_admin.R
import kotlinx.android.synthetic.main.fragment_my_page_store.*
import kotlinx.android.synthetic.main.fragment_my_page_store.view.*

class MyPageStoreInformFragment : Fragment {
    constructor()

    var storeItems: ArrayList<StoreItem> = ArrayList()
    val lm = LinearLayoutManager(context)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var layout: ConstraintLayout = inflater.inflate(R.layout.fragment_my_page_store,container,false) as ConstraintLayout
        var recycler: RecyclerView = layout.findViewById(R.id.recycler_my_page_store)

        recycler.setHasFixedSize(true)
        recycler.layoutManager = lm
        val mAdapter = MyPageStoreItemsAdapter(storeItems)
        recycler.adapter = mAdapter

        layout.btn_my_page_add_store_item.setOnClickListener {
            storeItems.add(StoreItem(edit_my_page_store_item_name.text.toString(),edit_my_page_store_item_cost.text.toString()))
            mAdapter.notifyDataSetChanged();
            edit_my_page_store_item_name.text == Editable.Factory.getInstance().newEditable("")
            edit_my_page_store_item_cost.text == Editable.Factory.getInstance().newEditable("")

        }
        return layout
    }
}
