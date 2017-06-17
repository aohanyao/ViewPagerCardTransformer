package com.aohanyao.transformer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void horizontal(View view) {
        startActivity(new Intent(mActivity, HorizontalActivity.class));
    }

    public void vertical(View view) {
        //startActivity(new Intent(mActivity, VerticalActivity.class));
        Toast.makeText(mActivity, "还在构思中", Toast.LENGTH_SHORT).show();
    }

}
