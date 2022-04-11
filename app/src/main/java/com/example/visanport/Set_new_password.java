package com.example.visanport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.visanport.databinding.SetNewPasswordBinding;

public class Set_new_password extends AppCompatActivity {

    SetNewPasswordBinding snp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        snp = SetNewPasswordBinding.inflate(getLayoutInflater());
        View view = snp.getRoot();
        setContentView(view);

        snp.backSnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Set_new_password.this,Login.class);
                startActivity(intent);
            }
        });


        EmptyField_checker();
    }

    private void EmptyField_checker() {
        String new_pass = snp.passwordEtSnp.getText().toString().trim();
        String c_new_pass = snp.rePassEtSnp.getText().toString().trim();

        if ((new_pass.isEmpty()) && (c_new_pass.isEmpty())){
            Toast.makeText(Set_new_password.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
        }else if (!new_pass.equals(c_new_pass)){
            Toast.makeText(Set_new_password.this, "Password does't match", Toast.LENGTH_SHORT).show();
        }else {
            snp.snpBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Set_new_password.this,Login.class);
                    startActivity(intent);
                }
            });
        }
    }
}