package com.farm.weekend.gram.weekend_farm_admin.SignIn

import android.content.Context

interface SignInContract {
    interface View {
        fun startSignUpAcitivity(): Unit
        fun startMainActivity(): Unit
        fun showErrorMessage(message: String): Unit
        fun getContext() : Context

    }

    interface Presenter {
        fun setView(view: View): Unit
        fun doSignIn(id: String, pw: String): Unit
    }
}