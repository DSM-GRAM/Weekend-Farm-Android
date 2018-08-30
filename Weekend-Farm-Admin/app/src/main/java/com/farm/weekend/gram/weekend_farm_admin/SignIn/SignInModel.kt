package com.farm.weekend.gram.weekend_farm_admin.SignIn

import com.google.gson.annotations.SerializedName

class SignInModel {
    @SerializedName("id") lateinit var id: String
    @SerializedName("pw") lateinit var pw: String
}