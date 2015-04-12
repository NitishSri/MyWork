package com.example.nitish.webcheckinapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class WelcomePage extends ActionBarActivity {


    TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.USER);
        System.err.print("message welcome : "+message);
        test = (TextView)findViewById(R.id.text1);
        test.setText(message);


    }

}
