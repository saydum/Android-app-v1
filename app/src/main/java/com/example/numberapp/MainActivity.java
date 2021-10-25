package com.example.numberapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);
    }


    public void onClickStart(View view) {
        Intent intent = new Intent(getApplicationContext(), ContenActivity.class);
        startActivity(intent);
    }

    public void onClickLeft(View view) {
        Intent intent = new Intent(this, One.class);
        startActivity(intent);
    }

    public void onClickNext(View view) {
        Intent intent = new Intent(this, Then.class);
        startActivity(intent);
    }

    public  void onClickBack(View view) {
       Intent intent = new Intent(this, MainActivity.class);
       startActivity(intent);
    }
}