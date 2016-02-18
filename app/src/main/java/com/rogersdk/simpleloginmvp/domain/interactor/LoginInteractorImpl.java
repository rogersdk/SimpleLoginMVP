package com.rogersdk.simpleloginmvp.domain.interactor;

import android.os.Handler;

import com.rogersdk.simpleloginmvp.ui.login.listener.OnLoginAttemptListener;

/**
 * Created by rogerio on 17/02/16.
 *
 * All the business logic to a single Use Case goes here
 *
 */
public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String login, final String password, final OnLoginAttemptListener listener) {
        new Handler().postDelayed( new Runnable() {
            //TODO try to login in a service
            boolean hasError = false;

            @Override
            public void run() {
                if(login == null || login.isEmpty()) {
                    listener.onLoginError();
                    hasError = true;
                }
                if(password == null || password.isEmpty()) {
                    listener.onPasswordError();
                    hasError = true;
                }

                if(!hasError) {
                    listener.onSuccess();
                }
            }


        }, 1000);
    }
}
