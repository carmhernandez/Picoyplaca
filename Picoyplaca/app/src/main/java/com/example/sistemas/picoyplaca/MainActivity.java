package com.example.sistemas.picoyplaca;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView tv1,p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        p=(TextView)findViewById(R.id.p);
        SharedPreferences prefe = getSharedPreferences("dato", Context.MODE_PRIVATE);
        if (prefe.getString("spinnerSelection", "").equals("0"))

        {
            p.setText("0-1");
        }

        if (prefe.getString("spinnerSelection", "").equals("1"))

        {
            p.setText("2-3");
        }

        if (prefe.getString("spinnerSelection", "").equals("2"))

        {
            p.setText("4-5");
        }

        if (prefe.getString("spinnerSelection", "").equals("3"))

        {
            p.setText("6-7");
        }

        if (prefe.getString("spinnerSelection", "").equals("4"))

        {
            p.setText("8-9");
        }

        Time today = new Time(Time.getCurrentTimezone());
        today.setToNow();
        int dia = today.monthDay;
        int mes = today.month;
        int ano = today.year;
        mes = mes + 1;
        tv1.setText("" + mes + "" + "/" + dia + "" + "/" + ano);
    }

    /*
    * Verificar el proximo dia
    */
    public void posterior()
    {
        //Verifica el dia actual
        String today = dia.today.monthDay;

        for (int i = 0; i < datos.length && !exis; i++) {

            String[] cancelar = datos[i].split("-");

            if (mes.equals(cancelar[0] + "") && comp.equals(cancelar[2] + ""))
            {

                a = i;
                exis = true;
            }

        }

        boolean esta = false;
        int 0 = datos.length;   //Compara el dia buscado  con dia que le corresponde de pico y placa  que se encuenyra en la contenedora
        for (int g = a; g < datos.length && !exis1; g++)
        {

            String[] cancel = datos[g].split("-");
            int dia1 = Integer.parseInt(diaNum);
            int dia2 = Integer.parseInt(cancel[1]);
            if (mesNum.equals(cancel[0] + "") && comp.equals(cancel[2] + ""))
            {
                if (dia1 < dia2)
                {
                    txtProx.setText(cancel[1] + " del mes " + cancel[0]);
                    exis1 = true;

                }
            }
            else if (!(mesNum.equals(cancel[0]+"")) && comp.equals(cancel[2] + ""))
            {
                txtProx.setText(cancel[1] + " del mes " + cancel[0]);
                exis1 = true;
            }

        }

    }


    public void configuracion(View view) {
        Intent i = new Intent(this, ConfigActivity.class);
        startActivity(i);
    }


    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }

    }

