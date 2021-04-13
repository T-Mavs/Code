package com.example.tristan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp2 extends AppCompatActivity {

    EditText mUser, mPassword, mConfirm, mEmail, mFirst, mLast, mAddress, mPhone;
    Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        mFirst = findViewById(R.id.firstName);
        mLast = findViewById(R.id.lastName);
        mAddress = findViewById(R.id.address);
        mUser = findViewById(R.id.username);
        mPassword = findViewById(R.id.password);
        mConfirm = findViewById(R.id.confirmpw);
        mPhone = findViewById(R.id.phone);
        signupBtn = findViewById(R.id.signup);

        signupBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String firstnameValue = mFirst.getText().toString().trim();
                String lastnameValue = mLast.getText().toString().trim();
                String addressValue = mAddress.getText().toString().trim();
                String userValue = mUser.getText().toString().trim();
                String passwordValue = mPassword.getText().toString().trim();
                String confirmValue = mConfirm.getText().toString().trim();
                String phoneValue = mPhone.getText().toString().trim();

                if(TextUtils.isEmpty(firstnameValue)) //check for first name
                {
                    mFirst.setError("First name is required");
                    return;
                }

                if(TextUtils.isEmpty(lastnameValue)) //check for last name
                {
                    mLast.setError("Last name is required");
                    return;
                }

                if(TextUtils.isEmpty(userValue)) //check for username
                {
                    mUser.setError("User name is required");
                    return;
                }

                if(TextUtils.isEmpty(addressValue)) //check for address
                {
                    mAddress.setError("Address is required");
                    return;
                }

                if(TextUtils.isEmpty(passwordValue)) //check for password
                {
                    mPassword.setError("Password is required");
                    return;
                }

                if(passwordValue.length()<6) //check for password length
                {
                    mPassword.setError("Password must be more than 6 characters");
                    return;
                }

                if(!passwordValue.equals(confirmValue)) //check for matching password
                {
                    mConfirm.setError("Password does not match");
                    return;
                }

                if(TextUtils.isEmpty(phoneValue)) //check for phone number
                {
                    mPhone.setError("Phone number is required");
                    return;
                }





                startActivity(new Intent(getApplicationContext(), SignUp3.class)); //how to go to new page


            }
        });
    }
}