package com.example.nico.seguimiento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    // aca tenes un cambio hdp
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_intento_login(View view) {

        startActivity(new Intent(MainActivity.this, secondActivity.class));

    }
}
