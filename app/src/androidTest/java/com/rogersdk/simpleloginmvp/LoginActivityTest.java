/*******************************************************************
 * Copyright (C) 2014 DL.                                           *
 * All rights, including trade secret rights, reserved.             *
 *******************************************************************/

package com.rogersdk.simpleloginmvp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.rogersdk.simpleloginmvp.ui.login.view.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by rogerio on 18/02/16.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule =
            new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void loginFieldsAreDisplayed() {
        onView(withId(R.id.login)).check(matches(isDisplayed()));
    }

    @Test
    public void attemptToLoginWithEmptyLogin() throws InterruptedException {
        onView(withId(R.id.submit)).perform(click());
        Thread.sleep(2000);
        onView(withId(R.id.error)).check(matches(isDisplayed()));
        onView(withId(R.id.progressBar)).check(matches(not(isDisplayed())));
    }

    @Test
    public void attemptToLoginWithEmptyPassword() throws InterruptedException {
        onView(withId(R.id.login)).perform(typeText("rogerio"), closeSoftKeyboard());
        onView(withId(R.id.submit)).perform(click());
        Thread.sleep(2000);
        onView(withId(R.id.error)).check(matches(isDisplayed()));
        onView(withId(R.id.progressBar)).check(matches(not(isDisplayed())));
        onView(withId(R.id.login)).perform(clearText());
    }

}
