package com.farm.weekend.gram.weekend_farm_admin.SignUp

import com.google.gson.annotations.SerializedName

class SignUpModel {
    @SerializedName("id")
    lateinit var id: String

    @SerializedName("pw")
    lateinit var pw: String

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("phone_number")
    lateinit var phoneNumber: String


}