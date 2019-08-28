package com.dell.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton =(Button) findViewById(R.id.loginButtonId);
        textView =(TextView) findViewById(R.id.textViewId);
        logoutButton =(Button) findViewById(R.id.logoutButtonId);

        Handler handler=new Handler();
        loginButton.setOnClickListener(handler);
        logoutButton.setOnClickListener(handler);

    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.loginButtonId)
                textView.setText("Login Button");
            if(v.getId()==R.id.logoutButtonId)
                textView.setText("Logout Button");
        }
    }



}
