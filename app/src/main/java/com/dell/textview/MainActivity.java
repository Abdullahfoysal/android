package com.dell.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView =(TextView) findViewById(R.id.nameTextViewId);
         // nameTextView.setText("Foysal");
        nameTextView.setTextSize(30);
    }
}
