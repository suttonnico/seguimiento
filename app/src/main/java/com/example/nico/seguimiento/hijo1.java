package com.example.nico.seguimiento;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nico.seguimiento.R;
import com.example.nico.seguimiento.calendar;
import com.example.nico.seguimiento.notas;
import com.example.nico.seguimiento.notificaciones;
import com.example.nico.seguimiento.presentes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nico on 03/11/17.
 */

public class hijo1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hija1);
    }
    public void go2presentes(View view) {

        startActivity(new Intent(com.example.nico.seguimiento.hijo1.this, presentes.class));

    }
    public void go2notas(View view) {

        startActivity(new Intent(com.example.nico.seguimiento.hijo1.this, notas.class));

    }
    public void go2calendar(View view) {

        startActivity(new Intent(com.example.nico.seguimiento.hijo1.this, calendar.class));

    }
    public void go2notificaciones(View view) {


    }

}
