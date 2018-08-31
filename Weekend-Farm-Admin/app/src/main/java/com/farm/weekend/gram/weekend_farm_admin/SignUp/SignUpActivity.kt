package com.farm.weekend.gram.weekend_farm_admin.SignUp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.farm.weekend.gram.weekend_farm_admin.AddMyInform.AddMyInformActivity
import com.farm.weekend.gram.weekend_farm_admin.R
import com.farm.weekend.gram.weekend_farm_admin.SignIn.SignInActivity
import com.farm.weekend.gram.weekend_farm_admin.util.UtilClass.showToast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(),SignUpContract.View {


    lateinit var presenter:SignUpContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        presenter = SignUpPresenter()
        presenter.setView(this)

        btn_sign_up.setOnClickListener {
            if(edit_sign_up_id.text.isEmpty() || edit_sign_up_pw.text.isEmpty() || edit_sign_up_pw_re.text.isEmpty() || edit_sign_up_name.text.isEmpty() || edit_sign_up_phone_number.text.isEmpty()) {
                showToast(this,"모두 입력하세요")
            } else {
                if(pwCheck()) {
                    presenter.doSignUp(edit_sign_up_id.text.toString(),edit_sign_up_pw.text.toString(),edit_sign_up_name.text.toString(),edit_sign_up_phone_number.text.toString())
                }
            }

        }


    }

    override fun pwCheck(): Boolean {
        if(edit_sign_up_pw.text.toString() == edit_sign_up_pw_re.text.toString()) return true
        else return false
    }

    override fun startAddMyInformActivity() {
        showToast(applicationContext,"회원가입 성공")
        intent = Intent(applicationContext, AddMyInformActivity::class.java)
        startActivity(intent)
    }


    override fun showErrorMessage(message: String) {
        showToast(applicationContext,message)
    }
}
