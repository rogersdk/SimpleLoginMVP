/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp.domain.interactor;

import com.rogersdk.simpleloginmvp.domain.entity.User;

import java.util.List;

/**
 * Created by rogerio on 18/02/16.
 */
public interface UserInteractor {
    User getUserByName(String name);
    void addUser(User user);
    void updateUserName(String name, int userId);
    List<User> getAllUsers();
}
