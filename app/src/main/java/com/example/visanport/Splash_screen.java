package com.example.visanport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.visanport.databinding.SplashScreenBinding;

public class Splash_screen extends AppCompatActivity {

    // Declaring the binding class
    SplashScreenBinding sp_binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing the splash screen binding
        sp_binding = SplashScreenBinding.inflate(getLayoutInflater());
        View view = sp_binding.getRoot();
        setContentView(view);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Setting up click listeners to the buttons

        sp_binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Redirect to the Login screen
                Intent intent = new Intent(Splash_screen.this,Login.class);
                startActivity(intent);
            }
        });

        sp_binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Redirect to the Sign up screen
                Intent intent = new Intent(Splash_screen.this,Register.class);
                startActivity(intent);
            }
        });

        sp_binding.googleSigninBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Redirect to the On boarding screen
                Intent intent = new Intent(Splash_screen.this,Onboarding.class);
                startActivity(intent);

            }
        });
    }
}