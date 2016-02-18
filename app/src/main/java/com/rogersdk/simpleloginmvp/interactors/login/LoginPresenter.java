package com.rogersdk.simpleloginmvp.interactors.login;

/**
 * Created by rogerio on 18/02/16.
 */
public interface LoginPresenter {
    void validateCredentials(String login, String password);
    void onDestroy();
}
