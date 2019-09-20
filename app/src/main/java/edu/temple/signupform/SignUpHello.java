package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpHello extends FormActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_hello);


        textView = findViewById(R.id.textView);
        textView.setText("Welcome, " + getIntent().getStringExtra("NAME")+ " to the SignUpForm App");

    }
}

