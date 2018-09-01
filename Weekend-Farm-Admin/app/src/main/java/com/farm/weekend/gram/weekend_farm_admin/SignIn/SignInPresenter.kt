package com.farm.weekend.gram.weekend_farm_admin.SignIn

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.farm.weekend.gram.weekend_farm_admin.connect.Connector
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInPresenter : SignInContract.Presenter {
    lateinit var signInView: SignInContract.View
    var signInModel: SignInModel = SignInModel()

    override fun setView(view: SignInContract.View) {
        signInView = view
    }

    override fun doSignIn(id: String, pw: String) {
        signInModel.id = id
        signInModel.pw = pw
        Connector.api.doSignIn(signInModel).enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                Log.d("Debug",response.code().toString())
                if(response.code() == 200) {
                    val preference: SharedPreferences = signInView.getContext().getSharedPreferences("PREFERENCE",Context.MODE_PRIVATE)
                    val editor: SharedPreferences.Editor = preference.edit()
                    editor.putString("Authorization", response.body()!!.get("access_token").toString())
                    editor.apply()
                    signInView.startMainActivity()
                }
                else if(response.code() == 401) signInView.showErrorMessage("id또는pw오류")
                else signInView.showErrorMessage("오류")
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {

            }

        })
    }


}
