package com.example.erajd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginButton(View view) {
        Intent intent = new Intent(this, LoggedActivity.class);
        startActivity(intent);

    }

    public void registerButton(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void logoButton(View view) {
        Intent intent = new Intent(this, LoggedActivity.class);
        startActivity(intent);
    }



}