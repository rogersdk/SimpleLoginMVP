/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp.ui.user.presenter;

import com.rogersdk.simpleloginmvp.domain.interactor.UserInteractorImpl;
import com.rogersdk.simpleloginmvp.ui.user.view.UserView;

/**
 * Created by rogerio on 18/02/16.
 */
public class UserPresenterImpl implements UserPresenter {

    private UserView userView;
    private UserInteractorImpl userInteractor;

    public UserPresenterImpl(UserView userView) {
        this.userView = userView;
        this.userInteractor = new UserInteractorImpl();
    }


    @Override
    public void addUser(int id, String name) {

    }

    @Override
    public void onDestroy() {
        this.userView = null;
    }
}
