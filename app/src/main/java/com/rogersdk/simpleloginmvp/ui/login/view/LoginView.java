package com.rogersdk.simpleloginmvp.ui.login.view;

/**
 * Created by rogerio on 17/02/16.
 */
public interface LoginView {
    void showProgressBar();
    void hideProgressBar();
    void setLoginError();
    void setPasswordError();
    void navigateToHome();
}
