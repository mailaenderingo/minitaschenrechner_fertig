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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void berechnen ( View v){

        EditText feld1 = (EditText) findViewById(R.id.zahl1); // Zugriff auf Layout (Objekt)
        EditText feld2 = (EditText) findViewById(R.id.zahl2);
        EditText felderg = (EditText) findViewById(R.id.erg);

        Integer z1 = Integer.parseInt(feld1.getText().toString());// Auslesen der Felder
        Integer z2 = Integer.parseInt(feld2.getText().toString());

       try {
           felderg.setText(String.valueOf(z1 / z2));
       }
       catch (Exception e){

           felderg.setText("Error");
       }

    }


}
