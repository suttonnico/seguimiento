package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nico on 04/11/17.
 */

public class presentes extends AppCompatActivity {
    ListView simpleList2;
    String countryList2[] = {"Sab  04/11 -- PRESENTE", "Vie  03/11 -- PRESENTE", "Jue  02/11 -- TARDE", "Mie  01/11 -- PRESENTE", "Mar  31/10 -- PRESENTE", "Lun  30/10 -- AUSENTE","Dom  29/10 -- PRESENTE","Sab  28/10 -- TARDE","Vie  27/10 -- TARDE","Jue  26/10 -- PRESENTE","Mie  25/10 -- PRESENTE","Mar  24/10 -- PRESENTE","Lun  23/10 -- PRESENTE","Dom  22/10 -- PRESENTE","Sab  21/10 -- PRESENTE"};
    int flags2[] = {R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.real_crossi, R.drawable.checki, R.drawable.crossi, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentes);
        simpleList2 = (ListView) findViewById(R.id.listView2);
        CustomAdapter customAdapter2 = new CustomAdapter(getApplicationContext(), countryList2, flags2);
        simpleList2.setAdapter(customAdapter2);
    }
}
