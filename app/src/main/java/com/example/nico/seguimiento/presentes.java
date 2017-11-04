package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nico on 04/11/17.
 */

public class presentes extends AppCompatActivity {
    ListView simpleList2;
    String countryList2[] = {" Vie 03/11 - Presente", " Jue 02/11 - Tarde", " Mie 01/11 - Presente", " Mar 31/10 - Presente", " Lun 30/10 - Ausente", " Vie 27/10 - Tarde"," Jue 26/10 - Presente"," Mie 25/10 - Presente"," Mar 24/10 - Presente"," Lun 23/10 - Presente"," Vie 20/10 - Presente", " Jue 19/10 - Tarde", " Mie 18/10 - Presente", };
    int flags2[] = {R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.real_crossi, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentes);
        simpleList2 = (ListView) findViewById(R.id.listView2);
        CustomAdapter customAdapter2 = new CustomAdapter(getApplicationContext(), countryList2, flags2);
        simpleList2.setAdapter(customAdapter2);
    }
}
