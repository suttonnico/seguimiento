package com.example.nico.seguimiento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_intento_login(View view) {
        EditText user = (EditText) findViewById(R.id.editText);
        if(user.getText().toString().equals("juanpablo70"))
            startActivity(new Intent(MainActivity.this, secondActivity.class));
        else
            startActivity(new Intent(MainActivity.this, escuela.class));
    }
}
