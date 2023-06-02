package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        boolean go_on = validateEmail(email_value);
        if(go_on){
            startActivity(intento1);
        }
    }

    public boolean validateEmail(String email){
        String email_trim = email.trim();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (email_trim.matches(emailPattern))
        {
            return true;
            //Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}