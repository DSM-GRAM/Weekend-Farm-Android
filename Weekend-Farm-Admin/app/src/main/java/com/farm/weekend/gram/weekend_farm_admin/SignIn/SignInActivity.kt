package com.farm.weekend.gram.weekend_farm_admin.SignIn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.farm.weekend.gram.weekend_farm_admin.MainActivity
import com.farm.weekend.gram.weekend_farm_admin.R
import com.farm.weekend.gram.weekend_farm_admin.SignUp.SignUpActivity
import com.farm.weekend.gram.weekend_farm_admin.util.UtilClass.showToast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity(), SignInContract.View {
    lateinit var presenter: SignInPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        presenter = SignInPresenter()
        presenter.setView(this)

        btn_sign_in.setOnClickListener {

            if (edit_sign_in_id.text.isEmpty() || edit_sign_in_pw.text.isEmpty()) {
                showToast(applicationContext, "id, pw 모두 입력해주세요.")
            } else {
                presenter.doSignIn(edit_sign_in_id.text.toString(), edit_sign_in_pw.text.toString())
            }
        }
        text_sign_in_sign_up.setOnClickListener {
            startSignUpAcitivity()
        }
    }


    override fun showErrorMessage(message: String) {
        showToast(applicationContext, message)
    }

    override fun startMainActivity() {
        showToast(applicationContext, "로그인 성공")
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)

        finish()
    }

    override fun startSignUpAcitivity() {
        intent = Intent(applicationContext, SignUpActivity::class.java)
        startActivity(intent)
    }

    override fun getContext() = baseContext
}
