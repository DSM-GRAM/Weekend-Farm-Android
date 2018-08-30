package com.farm.weekend.gram.weekend_farm_admin.connect

import com.farm.weekend.gram.weekend_farm_admin.SignIn.SignInModel
import com.farm.weekend.gram.weekend_farm_admin.SignUp.SignUpModel
import com.google.gson.JsonArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @POST("login")
    @Headers("Content-Type: application/json")
    fun doSignIn(@Body signInModel: SignInModel): Call<JSONObject>

    @POST("signup")
    @Headers("Content-Type: application/json")
    fun doSignUp(@Body signUpModel: SignUpModel): Call<Void>
}