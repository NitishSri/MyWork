package com.example.nitish.webcheckinapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    EditText fullName, email, password, phoneNo;
    TextView errorMsg;
    RadioButton user, merchant;
    Button login;
    public final static String USER="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupVariables();



        /*login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlgAlert = new AlertDialog.Builder(context);
                if((null==fullName && null==email && null==password && null==phoneNo)){
                    dlgAlert.setMessage("Please fill all field");
                    dlgAlert.setTitle("Error Message...");
                }else{
                    dlgAlert.setMessage("Please fill all field");
                    dlgAlert.setTitle("Error Message...");
                    System.err.print("else block");
                }
            }
        });*/





    }

    public void login(View view){


        if(!user.isChecked() && !merchant.isChecked()){
            errorMsg.setText("Please select type User or Merchant");
           return;
        }

        if (email.getText().toString().equals("a") &&
                password.getText().toString().equals("a")) {
            Toast.makeText(getApplicationContext(), "Login Successful",
                    Toast.LENGTH_SHORT).show();
            final Context context = this;
            login = (Button) findViewById(R.id.loginActn);
            Intent intent = new Intent(this, WelcomePage.class);
            String message = fullName.getText().toString();
            System.err.print("message : "+message);
            intent.putExtra(USER, message);
            startActivity(intent);

                }
        else {
            Toast.makeText(getApplicationContext(), "Seems like something wrong with credentials!",
                    Toast.LENGTH_SHORT).show();
        }
    }






    private void setupVariables() {
        fullName = (EditText)findViewById(R.id.fullName);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        phoneNo = (EditText)findViewById(R.id.phone);
        user = (RadioButton)findViewById(R.id.user);
        merchant = (RadioButton)findViewById(R.id.merchant);
        login = (Button)findViewById(R.id.loginActn);
        errorMsg=(TextView)findViewById(R.id.errorMsg);
    }



}
