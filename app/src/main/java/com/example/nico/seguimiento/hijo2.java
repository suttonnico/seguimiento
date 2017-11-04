package com.example.nico.seguimiento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nico on 03/11/17.
 */

public class hijo2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hijo2);
    }
    public void go2presentes(View view) {

        startActivity(new Intent(hijo2.this, presentes.class));

    }
    public void go2notas(View view) {

        startActivity(new Intent(hijo2.this, notas.class));

    }
    public void go2calendar(View view) {

        startActivity(new Intent(hijo2.this, calendar.class));

    }
}
