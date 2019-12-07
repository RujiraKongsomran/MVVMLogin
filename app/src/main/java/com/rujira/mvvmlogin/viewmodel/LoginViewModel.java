package com.rujira.mvvmlogin.viewmodel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.rujira.mvvmlogin.Interface.LoginResultCallBacks;
import com.rujira.mvvmlogin.model.User;

public class LoginViewModel extends ViewModel {
    private User user;
    private LoginResultCallBacks loginResultCallBacks;

    public LoginViewModel(LoginResultCallBacks loginResultCallBacks) {
        this.loginResultCallBacks = loginResultCallBacks;
        this.user = new User();
    }

    // Write method to get Email from EditText and set to user
    public TextWatcher getEmailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }

    // Write method to get Password from EditText and set to user
    public TextWatcher getPasswordTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }

    // Write method to process Login
    public void onLoginClicked(View view) {
        if (user.isValidData()) {
            loginResultCallBacks.onSuccess("Login Success!");
        } else {
            loginResultCallBacks.onError("Login Error!");
        }
    }
}
