package com.example.nico.seguimiento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nico on 04/11/17.
 */

public class escuela extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escuela);
    }
    public void go2tomar_lista(View view) {
        startActivity(new Intent(escuela.this, presentes.class));
    }
}
