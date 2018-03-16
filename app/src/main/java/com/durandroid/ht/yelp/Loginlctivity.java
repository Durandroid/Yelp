package com.durandroid.ht.yelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Loginlctivity extends AppCompatActivity {
    EditText edt_email;
    EditText edt_password;
    EditText btbn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_Password);
        btbn_login= findViewById(R.id.btn_login);

        Login.setOnclickListener(new View.OnClickListener)
    }
}
