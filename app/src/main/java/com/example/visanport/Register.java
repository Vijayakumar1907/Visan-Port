package com.example.visanport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.visanport.databinding.RegisterBinding;

public class Register extends AppCompatActivity {

    // Declare register binding
    RegisterBinding registerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initiate register binding
        registerBinding = RegisterBinding.inflate(getLayoutInflater());
        View view = registerBinding.getRoot();
        setContentView(view);


        // register button
        registerBinding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Onboarding.class);
                startActivity(intent);
            }
        });

        // sign in link
        registerBinding.signInReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });

        String phone_number = registerBinding.phoneNoEt.getText().toString().trim();


    }
}