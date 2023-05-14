package com.example.employeebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        String email = "admin@fountainit.com.bd";
        String password = "admin1234";
        String wrong_email = "Username or Email Is Wrong";
        String wrong_password = "Password Was Wrong";

        TextView emailText = findViewById(R.id.email);
        TextView passText = findViewById(R.id.password);
        TextView errorText = findViewById(R.id.errorText);

        Button btn = findViewById(R.id.btnLogin);

        Intent intent = new Intent(LoginPage.this, MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailGiven = emailText.getText().toString();
                String passGiven = passText.getText().toString();

                if (emailGiven.equals(email)){
                    if (passGiven.equals(password)){
                        startActivity(intent);
                    }
                    else {
                        errorText.setVisibility(View.VISIBLE);
                        errorText.setText(wrong_password);
                    }
                }
                else {
                    errorText.setVisibility(View.VISIBLE);
                    errorText.setText(wrong_email);
                }

            }
        });

    }
}