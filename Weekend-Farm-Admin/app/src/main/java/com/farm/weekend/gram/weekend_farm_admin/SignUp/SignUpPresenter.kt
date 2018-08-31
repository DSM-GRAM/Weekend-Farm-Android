package com.farm.weekend.gram.weekend_farm_admin.SignUp

import com.farm.weekend.gram.weekend_farm_admin.connect.Connector
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpPresenter : SignUpContract.Presenter{

    lateinit var signUpView: SignUpContract.View
    var signUpModel: SignUpModel = SignUpModel()

    override fun setView(view: SignUpContract.View) {
        signUpView = view
    }
    override fun doSignUp(id: String, pw: String, name: String, phoneNumber: String) {
        signUpModel.id = id
        signUpModel.pw = pw
        signUpModel.name = name
        signUpModel.phoneNumber = phoneNumber

        Connector.api.doSignUp(signUpModel).enqueue(object: Callback<Void> {
            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                if(response.code() == 201) signUpView.startAddMyInformActivity()
                else if(response.code() == 409) signUpView.showErrorMessage("아이디 중복")
                else signUpView.showErrorMessage("오류")
            }

            override fun onFailure(call: Call<Void>, t: Throwable) {

            }

        })
    }
}