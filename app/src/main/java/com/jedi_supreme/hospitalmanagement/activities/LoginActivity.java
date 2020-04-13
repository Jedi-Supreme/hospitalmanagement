package com.jedi_supreme.hospitalmanagement.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jedi_supreme.hospitalmanagement.R;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText et_login_username, et_login_password;
    TextInputLayout input_login_password;

    Button bt_login_action, bt_login_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_login_password = findViewById(R.id.et_login_password);
        et_login_username = findViewById(R.id.et_login_username);

        input_login_password = findViewById(R.id.input_login_password);

        bt_login_action = findViewById(R.id.bt_login_action);
        bt_login_reset = findViewById(R.id.bt_login_resetpass);

        et_login_password.setOnFocusChangeListener((v, hasFocus) -> {
            input_login_password.setEndIconMode(TextInputLayout.END_ICON_PASSWORD_TOGGLE);
            input_login_password.setEndIconActivated(hasFocus);
        });

    }
}
