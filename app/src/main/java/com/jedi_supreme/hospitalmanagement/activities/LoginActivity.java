package com.jedi_supreme.hospitalmanagement.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.jedi_supreme.hospitalmanagement.R;

import java.lang.ref.WeakReference;
import java.util.Objects;

import utilities.common;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    WeakReference<LoginActivity> weaklogin;
    TextInputEditText et_login_username, et_login_password;
    TextInputLayout input_login_password;
    ProgressBar probar_login;
    ConstraintLayout const_login;

    Button bt_login_action, bt_login_reset;

    //===================================================ON CREATE===============================================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        weaklogin = new WeakReference<>(this);

        probar_login = findViewById(R.id.probar_login);
        const_login = findViewById(R.id.const_loginActivity);

        et_login_password = findViewById(R.id.et_login_password);
        et_login_username = findViewById(R.id.et_login_username);

        input_login_password = findViewById(R.id.input_login_password);

        bt_login_action = findViewById(R.id.bt_login_action);
        bt_login_reset = findViewById(R.id.bt_login_resetpass);

        et_login_password.setOnFocusChangeListener((v, hasFocus) -> {
            input_login_password.setEndIconMode(TextInputLayout.END_ICON_PASSWORD_TOGGLE);
            input_login_password.setEndIconActivated(hasFocus);
        });

        bt_login_action.setOnClickListener(this);
        bt_login_reset.setOnClickListener(this);

    }
    //===================================================ON CREATE===============================================================================

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-OVERRIDE METHODS=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bt_login_action) {
            //checkLogin_credentials();
            homeScreen_intent();
        }

    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-OVERRIDE METHODS=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    //---------------------------------------------------DEFINED METHODS-------------------------------------------------------------------------
    void checkLogin_credentials(){

        if (Objects.requireNonNull(et_login_username.getText()).toString().equals("")){
            et_login_username.setError("Username is required");
            et_login_username.requestFocus();
        }else if (Objects.requireNonNull(et_login_password.getText()).toString().equals("")){
            et_login_password.setError("Password is required");
            et_login_password.requestFocus();
        }else{
            login_with_credentials(et_login_username.getText().toString(),et_login_password.getText().toString());
        }


    }

    void login_with_credentials(final String email, String password) {

        probar_login.setVisibility(View.VISIBLE);

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(weaklogin.get(), task -> {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information
                        //Before going to dashboard, fetch company data
                        //load_company_Data();
                        homeScreen_intent();

                    } else {

                        // If sign in fails, display a message to the user.
                        if (task.getException() instanceof FirebaseAuthInvalidUserException) {

                            common.Mysnackbar(const_login, "Invalid Email Address",
                                    Snackbar.LENGTH_SHORT).show();

                            probar_login.setVisibility(View.INVISIBLE);
                            probar_login.clearAnimation();

                        } else if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {

                            common.Mysnackbar(const_login, "Wrong Password",
                                    Snackbar.LENGTH_SHORT).show();

                            probar_login.setVisibility(View.GONE);
                            probar_login.clearAnimation();
                        }


                    }

                });

    }
    //---------------------------------------------------DEFINED METHODS-------------------------------------------------------------------------

    //----------------------------------------------INTENTS-----------------------------------------
    void homeScreen_intent(){
        Intent homeScreenIntent = new Intent(getApplicationContext(), Dashboard.class);
        homeScreenIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeScreenIntent);
        super.finish();
    }
    //----------------------------------------------INTENTS-----------------------------------------
}
