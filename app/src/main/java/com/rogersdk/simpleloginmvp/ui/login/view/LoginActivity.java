package com.rogersdk.simpleloginmvp.ui.login.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.rogersdk.simpleloginmvp.R;
import com.rogersdk.simpleloginmvp.ui.home.HomeActivity;
import com.rogersdk.simpleloginmvp.ui.login.presenter.LoginPresenterImpl;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by rogerio on 17/02/16.
 */
public class LoginActivity extends Activity implements LoginView, View.OnClickListener{
    public static final String TAG = "login";

    @Bind(R.id.submit) Button submit;
    @Bind(R.id.login) EditText login;
    @Bind(R.id.password) EditText password;
    @Bind(R.id.progressBar) ProgressBar progressBar;
    @Bind(R.id.error) TextView error;

    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        submit.setOnClickListener(this);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenter.onDestroy();
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, String.format("The button has been clicked!\n attempt to login = %s", login.getText().toString()));
        presenter.validateCredentials(login.getText().toString(), password.getText().toString());
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setLoginError() {
        error.setVisibility(View.VISIBLE);
    }

    @Override
    public void setPasswordError() {
        error.setVisibility(View.VISIBLE);
    }

    @Override
    public void navigateToHome() {
        Log.d(TAG, String.format("Login successfull! Let's go to Home!"));
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
