package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nico on 04/11/17.
 */

public class notas extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {" Vie 03/11 -- Matematica: 7", " Jue 02/11 -- Fisica: 8", " Lun 30/10 -- Quimica: 5", "Vie  27/10 -- Historia: 10", "Vie  20/10 -- Informatica: 10", "Mar  17/10 -- Geografia: 3","Lun  16/10 -- Musica: 9","Jue  12/10 -- Etica: 9","Mie  04/10 -- Biologia: 9","Vie  29/09 -- Matematica: 9","Jue  28/09 -- Fisica: 9","Lun  25/09 -- Literatura: 6","Jue  21/09 -- Formacion Civica: 1"," Vie 15/09 -- Gimnasia: 10","Jue  14/09 -- Artes Plasticas: 10"};
    int flags[] = {R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki};



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notas);
        simpleList = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
