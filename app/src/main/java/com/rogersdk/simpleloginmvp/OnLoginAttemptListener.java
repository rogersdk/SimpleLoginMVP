package com.rogersdk.simpleloginmvp;

/**
 * Created by rogerio on 17/02/16.
 */
public interface OnLoginAttemptListener {
    void onLoginError();
    void onPasswordError();
    void onSuccess();
}
