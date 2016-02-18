package com.rogersdk.simpleloginmvp.interactors.login;

/**
 * Created by rogerio on 17/02/16.
 *
 * An interactor handles a Use Case.
 * Used to process a single Business Rule, also its very
 * easy to test.
 *
 */
public interface LoginInteractor {
    void login(String login, String password, OnLoginAttemptListener listener);
}
