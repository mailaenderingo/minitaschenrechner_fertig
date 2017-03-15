package com.example.maile.minitaschenrechner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void berechnen ( View v) throws IOException{

        float z1;
        float z2;


        EditText feld1 = (EditText) findViewById(R.id.zahl1); // Zugriff auf Layout (Objekt)
        EditText feld2 = (EditText) findViewById(R.id.zahl2);
        EditText felderg = (EditText) findViewById(R.id.erg);

        z1 = Float.parseFloat(feld1.getText().toString());// Auslesen der Felder
        z2 = Float.parseFloat(feld2.getText().toString());

       try {

           felderg.setText(String.valueOf(z1 / z2));
       }
       catch (NumberFormatException nfe){

           felderg.setText("Sie haben keinen numerischen Wert eingegeben");
       }

    }


}
