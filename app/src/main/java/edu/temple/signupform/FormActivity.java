package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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


        signUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                checkDataEntered();

            }
        });
    }

    boolean isEmpty(EditText text)
    {
        CharSequence checkText = text.getText().toString();
        return TextUtils.isEmpty(checkText);
    }

    boolean isEmail(EditText text)
    {
        CharSequence checkEmail = text.getText().toString();
        return (!TextUtils.isEmpty(checkEmail) && Patterns.EMAIL_ADDRESS.matcher(checkEmail).matches());
    }

    boolean isPassword(EditText pass1, EditText pass2)
    {
        CharSequence checkPass1 = pass1.getText().toString();
        CharSequence checkPass2 = pass2.getText().toString();
        return checkPass1.equals(checkPass2);
    }

    void checkDataEntered()
    {
        if(isEmpty(name) || isEmpty(email) || isEmpty(password) || isEmpty(rePassword))
        {
            Toast.makeText(this, "You got to input name", Toast.LENGTH_SHORT).show();
        }

        if (!isEmail(email))
        {
            email.setError("Invalid email");
        }

        if (!isPassword(password,rePassword))
        {
            rePassword.setError("Passwords don't match");
        }



    }


}
