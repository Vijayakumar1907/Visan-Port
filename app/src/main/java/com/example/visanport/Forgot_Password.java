package com.example.visanport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.visanport.databinding.ForgotPasswordBinding;

public class Forgot_Password extends AppCompatActivity {

    ForgotPasswordBinding forgotPasswordBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        forgotPasswordBinding = ForgotPasswordBinding.inflate(getLayoutInflater());
        View view = forgotPasswordBinding.getRoot();
        setContentView(view);

        forgotPasswordBinding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgot_Password.this,Login.class);
                startActivity(intent);
            }
        });

        forgotPasswordBinding.changePhNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Forgot_Password.this,Profile.class);
                startActivity(intent);
            }
        });

    }
}