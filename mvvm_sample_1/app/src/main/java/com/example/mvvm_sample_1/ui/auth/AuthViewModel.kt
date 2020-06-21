package com.example.mvvm_sample_1.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    var email:String?=null
    var password:String?=null

    fun onLoginButtonClick(view: View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){

            return
        }


    }
}