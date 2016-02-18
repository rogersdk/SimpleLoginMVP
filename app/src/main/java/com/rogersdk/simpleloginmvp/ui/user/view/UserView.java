/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp.ui.user.view;

import com.rogersdk.simpleloginmvp.domain.entity.User;

/**
 * Created by rogerio on 18/02/16.
 */
public interface UserView {
    void updateRecentlyUser(User user);
    void cleanFormFields();
}
