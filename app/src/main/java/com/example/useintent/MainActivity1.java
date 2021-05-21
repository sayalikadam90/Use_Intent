package com.example.useintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    TextView txtname,txtemail,txtmobile,txtaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        txtname=findViewById(R.id.txtname);
        txtemail=findViewById(R.id.txtemail);
        txtaddress=findViewById(R.id.txtaddress);
        txtmobile=findViewById(R.id.txtmobile);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String email=intent.getStringExtra("email");
        String address=intent.getStringExtra("address");
        String mobile=intent.getStringExtra("mobile");

        txtname.setText(name);
        txtemail.setText(email);
        txtmobile.setText(mobile);
        txtaddress.setText(address);

    }
}