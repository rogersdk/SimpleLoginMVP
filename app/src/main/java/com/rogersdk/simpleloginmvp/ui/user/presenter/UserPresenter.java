/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp.ui.user.presenter;

/**
 * Created by rogerio on 18/02/16.
 */
public interface UserPresenter {
    void addUser(int id, String name);
    void onDestroy();
}
