package com.farm.weekend.gram.weekend_farm_admin.connect

import com.farm.weekend.gram.weekend_farm_admin.AppliedRoomInform.AppliedRoomInformModel
import com.farm.weekend.gram.weekend_farm_admin.Main.MainModel
import com.farm.weekend.gram.weekend_farm_admin.SignIn.SignInModel
import com.farm.weekend.gram.weekend_farm_admin.SignUp.SignUpModel
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @POST("login")
    @Headers("Content-Type: application/json")
    fun doSignIn(@Body signInModel: SignInModel): Call<JsonObject>

    @POST("signup")
    @Headers("Content-Type: application/json")
    fun doSignUp(@Body signUpModel: SignUpModel): Call<Void>

    @GET("apply")
    @Headers("Content-Type: application/json")
    fun doApply(@Header("Authorization") Authorization: String): Call<AppliedRoomInformModel>

    @GET("farm/list")
    @Headers("Content-Type: application/json")
fun getFarmList(@Header("Authorization")Authorization: String):Call<MainModel>
}