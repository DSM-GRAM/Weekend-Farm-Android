package com.farm.weekend.gram.weekend_farm_admin.SignUp

interface SignUpContract {
    interface View {
        fun pwCheck(): Boolean
        fun startAddMyInformActivity(): Unit
        fun showErrorMessage(message: String): Unit


    }
    interface Presenter {
        fun setView(view: View): Unit
        fun doSignUp(id: String, pw: String, name: String, phoneNumber: String): Unit
    }
}