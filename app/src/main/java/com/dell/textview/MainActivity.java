package com.dell.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
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

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("Login button is clicked"+ ++count + "Times");
                textView.setTextColor(Color.RED);
            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Logout button clicked ");
            }
        });
    }
}
