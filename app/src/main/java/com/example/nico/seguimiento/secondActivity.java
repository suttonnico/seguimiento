package com.example.nico.seguimiento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nico on 03/11/17.
 */

public class secondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
    }

    public void go2hijo2(View view) {

        startActivity(new Intent(secondActivity.this, hijo2.class));

    }

}
