/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp.ui.user.view;

import android.app.Activity;
import android.os.Bundle;

import com.rogersdk.simpleloginmvp.R;
import com.rogersdk.simpleloginmvp.domain.entity.User;

/**
 * Created by rogerio on 18/02/16.
 */
public class UserActivity extends Activity implements UserView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

    }

    @Override
    public void updateRecentlyUser(User user) {

    }

    @Override
    public void cleanFormFields() {

    }
}
