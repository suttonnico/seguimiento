package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nico on 04/11/17.
 */

public class calendar extends AppCompatActivity {
    int year_x,month_x,day_x;
    static final int DILOG_ID = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
    }
}
