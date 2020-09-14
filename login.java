package com.bellurbis.kitabe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText Edusertname;
    EditText Edpassword;
    Button submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Findviewbyid();

    }
    public void Findviewbyid() {
        Edusertname = (EditText) findViewById(R.id.rdname);
        Edpassword = (EditText) findViewById(R.id.rdpass);
        submitbtn = (Button) findViewById(R.id.button);
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, home_page.class);
                startActivity(intent);


            }
        });
    }}
