package com.rogersdk.simpleloginmvp;

/**
 * Created by rogerio on 18/02/16.
 */
public interface LoginPresenter {
    void validateCredentials(String login, String password);
    void onDestroy();
}
