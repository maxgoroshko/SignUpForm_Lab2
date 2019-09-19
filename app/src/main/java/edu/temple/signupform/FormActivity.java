package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    EditText rePassword;
    EditText email;
    Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameText);
        password = findViewById(R.id.passwordText);
        rePassword = findViewById(R.id.rePasswordText);
        email = findViewById(R.id.emailText);
        signUp = findViewById(R.id.signUp);

    }




}
