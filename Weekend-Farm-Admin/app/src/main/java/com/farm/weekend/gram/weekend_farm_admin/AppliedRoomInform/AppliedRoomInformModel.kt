package com.farm.weekend.gram.weekend_farm_admin.AppliedRoomInform

import com.google.gson.annotations.SerializedName

class AppliedRoomInformModel {
    @SerializedName("farm_name")
    lateinit var farmName: String

    @SerializedName("user_phone_number")
    lateinit var userPhoneNumber: String

    @SerializedName("applyDate")
    lateinit var applyDate: String

    @SerializedName("message")
    lateinit var message: String

    @SerializedName("roominfo")
    lateinit var roomInfos: List<roomInfo>

    class roomInfo {
        @SerializedName("itemNum")
        var itemNum: Int = 0
        @SerializedName("itemName")
        lateinit var itemName: String
        @SerializedName("money")
        var money: Int = 0


    }
}