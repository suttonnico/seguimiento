package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nico on 04/11/17.
 */

public class presentes extends AppCompatActivity {
    ListView simpleList2;
    String countryList2[] = {"  04/11/2017 -- PRESENTE", "  03/11/2017 -- PRESENTE", "  02/11/2017 -- TARDE", "  01/11/2017 -- PRESENTE", "  31/10/2017 -- PRESENTE", "  30/10/2017 -- AUSENTE","  29/10/2017 -- PRESENTE","  28/10/2017 -- TARDE","  27/10/2017 -- TARDE","  26/10/2017 -- PRESENTE","  25/10/2017 -- PRESENTE","  24/10/2017 -- PRESENTE","  23/10/2017 -- PRESENTE","  22/10/2017 -- PRESENTE","  21/10/2017 -- PRESENTE"};
    int flags2[] = {R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.real_crossi, R.drawable.checki, R.drawable.crossi, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentes);
        simpleList2 = (ListView) findViewById(R.id.listView2);
        CustomAdapter customAdapter2 = new CustomAdapter(getApplicationContext(), countryList2, flags2);
        simpleList2.setAdapter(customAdapter2);
    }
}
