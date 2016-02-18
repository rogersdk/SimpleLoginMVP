package com.rogersdk.simpleloginmvp.ui.login.presenter;

/**
 * Created by rogerio on 18/02/16.
 */
public interface LoginPresenter {
    void validateCredentials(String login, String password);
    void onDestroy();
}
