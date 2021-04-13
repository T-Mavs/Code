package com.example.tristan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp1 extends AppCompatActivity {

    EditText mEmail;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

        mEmail = findViewById(R.id.email);
        nextBtn = findViewById(R.id.next);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailValue = mEmail.getText().toString().trim();

                if (TextUtils.isEmpty(emailValue)) //check for email
                {
                    mEmail.setError("Email is required");
                    return;
                }

                //save email

                startActivity(new Intent(getApplicationContext(), SignUp2.class));
            }
        });
    }
}