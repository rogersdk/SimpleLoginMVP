package com.rogersdk.simpleloginmvp.ui.login.presenter;

import android.util.Log;

import com.rogersdk.simpleloginmvp.domain.interactor.LoginInteractor;
import com.rogersdk.simpleloginmvp.domain.interactor.LoginInteractorImpl;
import com.rogersdk.simpleloginmvp.ui.login.listener.OnLoginAttemptListener;
import com.rogersdk.simpleloginmvp.ui.login.view.LoginActivity;
import com.rogersdk.simpleloginmvp.ui.login.view.LoginView;

/**
 * Created by rogerio on 18/02/16.
 */
public class LoginPresenterImpl implements LoginPresenter, OnLoginAttemptListener {


    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }


    @Override
    public void validateCredentials(String login, String password) {
        loginView.showProgressBar();
        loginInteractor.login(login, password, this);
    }

    @Override
    public void onDestroy() {
        this.loginView = null;
        Log.d(LoginActivity.TAG, "Release memory.");
    }

    @Override
    public void onLoginError() {
        loginView.hideProgressBar();
        loginView.setLoginError();
    }

    @Override
    public void onPasswordError() {
        loginView.hideProgressBar();
        loginView.setPasswordError();
    }

    @Override
    public void onSuccess() {
        loginView.hideProgressBar();
        loginView.navigateToHome();
    }
}
