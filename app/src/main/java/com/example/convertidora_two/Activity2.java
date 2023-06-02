package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView name, last_name, email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name = findViewById(R.id.get_name);
        last_name = findViewById(R.id.get_last_name);
        email = findViewById(R.id.get_email);
        password = findViewById(R.id.get_password);
    }

    public void get_info(View v){
        Bundle data = getIntent().getExtras();
        String name_value = data.getString("name");
        String last_name_value = data.getString("last_name");
        String email_value = data.getString("email");
        String password_value = data.getString("password");
        name.setText(name_value);
        last_name.setText(last_name_value);
        email.setText(email_value);
        password.setText(password_value);
    }
}