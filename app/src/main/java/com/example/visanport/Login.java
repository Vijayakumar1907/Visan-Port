package com.example.visanport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.visanport.databinding.LoginBinding;

import java.util.Objects;

public class Login extends AppCompatActivity {

    // declaring login binding class
    LoginBinding l_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing login binding class
        l_binding = LoginBinding.inflate(getLayoutInflater());
        View view = l_binding.getRoot();
        setContentView(view);

        // hide action bar

        //Objects.requireNonNull(getSupportActionBar()).hide();


        // set onclick listeners
        l_binding.loginBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Onboarding.class);
                startActivity(intent);
            }
        });
        l_binding.forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        l_binding.signUpLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

        // Empty edittext logic
        l_binding.emailEt.getText().toString().trim();
    }
}