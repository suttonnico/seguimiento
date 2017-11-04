package com.example.nico.seguimiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nico on 04/11/17.
 */

public class notas extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"  04/11/2017 -- Matematica: 7", "  02/11/2017 -- Fisica: 8", "  30/10/2017 -- Quimica: 5", "  28/10/2017 -- Historia: 10", "  20/10/2017 -- Informatica: 10", "  17/10/2017 -- Geografia: 3","  15/10/2017 -- Musica: 9","  12/10/2017 -- Etica: 9","  04/10/2017 -- Biologia: 9","  29/09/2017 -- Matematica: 9","  28/09/2017 -- Fisica: 9","  24/09/2017 -- Literatura: 6","  21/09/2017 -- Formacion Civica: 1","  16/09/2017 -- Gimnasia: 10","  25/09/2017 -- Artes Plasticas: 10"};
    int flags[] = {R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.checki, R.drawable.crossi, R.drawable.checki, R.drawable.checki};



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notas);
        simpleList = (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
