package com.example.mvvm_sample_1.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {
    var email:String?=null
    var password:String?=null

    var authListener:AuthListener?=null

    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid Email or password")
            return
        }

        authListener?.onSuccess()
    }
}