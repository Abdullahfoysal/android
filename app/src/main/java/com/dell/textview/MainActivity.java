package com.dell.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton =(Button) findViewById(R.id.loginButtonId);
        logoutButton =(Button) findViewById(R.id.logoutButtonId);
        textView =(TextView) findViewById(R.id.textViewId);



    }

        public void showMessage(View v) {
            if(v.getId()==R.id.loginButtonId)
                Log.d("tag","Login button is clicked");
            if(v.getId()==R.id.logoutButtonId) {
                Log.d("tag","Logout button is clicked");
            }
        }




}
