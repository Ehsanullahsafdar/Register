package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class LoginActivity extends AppCompatActivity {

    public EditText email,password;
    private Button btn_login;
    private TextView link_regist;
    private static String URL_LOGIN = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email= findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_login=findViewById(R.id.btnregister);
        link_regist = findViewById(R.id.link_regist);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String mPass = password.getText().toString().trim();

                if (!mEmail.isEmpty() || !mPass.isEmpty() ){
                    Login(mEmail,mPass);
                }else{
                    email.setError("Please Insert Email");
                    password.setError("Please Insert Password");
                }
            }
        });

    }

    private void Login(String email, String password) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_LOGIN,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                )
    }
}
