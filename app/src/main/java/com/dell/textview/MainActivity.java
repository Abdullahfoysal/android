package com.dell.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int count=0;
    private Button loginButton,logoutButton;
    private TextView textView;
    private EditText editText1,editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton =(Button) findViewById(R.id.loginButtonId);
        logoutButton =(Button) findViewById(R.id.logoutButtonId);
        textView =(TextView) findViewById(R.id.textViewId);

        editText1= (EditText)findViewById(R.id.editText1Id);
        editText2= (EditText)findViewById(R.id.editText2Id);

        loginButton.setOnClickListener(this);
        logoutButton.setOnClickListener(this);




    }

        public void showMessage(View v) {
            if(v.getId()==R.id.loginButtonId)
                Log.d("tag","Login button is clicked");
            if(v.getId()==R.id.logoutButtonId) {
                Log.d("tag","Logout button is clicked");
            }
        }


    @Override
    public void onClick(View v) {
        try{
            String number1=editText1.getText().toString();
            String number2=editText2.getText().toString();

            //convert to double
            double num1,num2;

            num1 = Double.parseDouble(number1);
            num2 = Double.parseDouble(number2);



            if(v.getId()==R.id.loginButtonId)
            {
                double sum=num1+num2;
                textView.setText("Result ="+sum);
            }
            if(v.getId()==R.id.logoutButtonId)
            {
                double sub=num1-num2;
                textView.setText("Result ="+sub);
            }
        }
        catch(Exception e){
           // Toast.makeText(MainActivity.this,"Please Enter number",Toast.LENGTH_SHORT).show();
            LayoutInflater inflater =getLayoutInflater();
            View customToastView=inflater.inflate(R.layout.customtoast_layer, (ViewGroup) findViewById(R.id.customtoastId));
            Toast toast=new Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.setView(customToastView);
            toast.show();


        }


    }
}
