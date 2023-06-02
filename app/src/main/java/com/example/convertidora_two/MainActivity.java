package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, last_name, email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.name);
        last_name= findViewById(R.id.last_name);
        email= findViewById(R.id.email);
        password= findViewById(R.id.password);
    }

    public void set_info(View v){
        Intent intento1 = new Intent(this, Activity2.class);
        String name_value = name.getText().toString();
        String last_n_value = last_name.getText().toString();
        String email_value = email.getText().toString();
        String password_value = password.getText().toString();
        intento1.putExtra( "name", name_value);
        intento1.putExtra( "last_name", last_n_value);
        intento1.putExtra("email", email_value);
        intento1.putExtra("password", password_value);
        startActivity(intento1);
    }
}