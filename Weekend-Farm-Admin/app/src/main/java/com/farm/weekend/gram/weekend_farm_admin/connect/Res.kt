package com.farm.weekend.gram.weekend_farm_admin.connect

import android.content.Context
import com.farm.weekend.gram.weekend_farm_admin.util.UtilClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class Res<T>(val context: Context): Callback<T> {

    abstract fun callBack(code: Int, body: T?)

    override fun onFailure(call: Call<T>?, t: Throwable?) {
        UtilClass.showToast(context, "네트워크 오류")
    }

    override fun onResponse(call: Call<T>?, response: Response<T>) {
        val code = response.code()
        val body = response.body()

        if (code == 401){
            UtilClass.showToast(context, "다시 로그인 하세요")
            UtilClass.removeToken(context)
        }

        when(code){
            500 -> UtilClass.showToast(context, "서버 오류")
            422 -> { UtilClass.showToast(context, "로그인이 필요합니다")
                UtilClass.removeToken(context) }
            403 -> UtilClass.showToast(context, "권한이 없습니다")
            else -> callBack(code, body)
        }

    }

}