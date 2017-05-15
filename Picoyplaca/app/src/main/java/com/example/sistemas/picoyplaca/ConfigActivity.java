package com.example.sistemas.picoyplaca;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by sistemas on 12/05/17.
 */

public class ConfigActivity extends AppCompatActivity {

    Spinner lista;
    String[] datos = {"0 - 1","2 - 3","4 - 5", "6 - 7","8 - 9"};  //contenedora de datos, los datos que les  corresponde pico y placa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        lista = (Spinner) findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i)
                {
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 3:
                        Toast te = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        te.show();
                        break;

                    case 4:
                        Toast ti = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        ti.show();
                        break;

                    case 5:
                        Toast tu = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        tu.show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }




    public void salir(View v)
    {
        SharedPreferences preferences=getSharedPreferences("dato", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();
        int selectedPosition = lista.getSelectedItemPosition();
        editor.putString("spinnerSelection", String.valueOf(selectedPosition));
        String text = String.valueOf(lista.getSelectedItem());
        Intent intent =new Intent(ConfigActivity.this, MainActivity.class);
        intent.putExtra("text", text);
        editor.commit();
        startActivity(intent);

    }
    }
