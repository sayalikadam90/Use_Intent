package com.example.useintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtname,edtemail,edtmobile,edtaddress;

    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname=findViewById(R.id.name);
        edtemail=findViewById(R.id.email);
        edtaddress=findViewById(R.id.address);
        edtmobile=findViewById(R.id.mobile);

        btnnext=findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,MainActivity1.class);
                intent.putExtra("name",edtname.getText().toString().trim());
                intent.putExtra("email",edtemail.getText().toString().trim());
                intent.putExtra("address",edtaddress.getText().toString().trim());
                intent.putExtra("mobile",edtmobile.getText().toString().trim());
                startActivity(intent);
            }
        });



    }
}