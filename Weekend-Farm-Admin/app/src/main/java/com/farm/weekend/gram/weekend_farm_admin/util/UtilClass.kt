package com.farm.weekend.gram.weekend_farm_admin.util

import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

object UtilClass {
    fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    private fun getPref(context: Context): SharedPreferences {
        val preference = context.getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE)
        return preference
    }

    fun saveToken(context: Context, token: String){
        val editor = getPref(context).edit()
        editor.putString("Authorization", token)
        editor.apply()
    }

    fun removeToken(context: Context){
        val editor = getPref(context).edit()
        editor.remove("Authorization")
        editor.apply()
    }

    fun getToken(context: Context): String{
        return "JWT " + getPref(context).getString("Authorization", "")
    }

    fun delayHandler(runnable: Runnable, delayTime: Long) {
        var handler = android.os.Handler()
        handler.postDelayed(runnable, delayTime)
    }
}