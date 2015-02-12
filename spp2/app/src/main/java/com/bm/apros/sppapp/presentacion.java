package com.bm.apros.sppapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class presentacion extends ActionBarActivity {

    Button saltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);
        Button saltar = (Button) findViewById(R.id.btn_saltar);


        saltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), cotizacion.class);
                startActivityForResult(myIntent, 0);
            }

        });

        TextView ShowNameEmail= (TextView) findViewById(R.id.Show_global);
        final GlobalClass globalVariable =(GlobalClass) getApplicationContext();
        final String name=globalVariable.getNombre();
        final String email = globalVariable.getCorreo();

        String showString= "Nombre: "+name+"/n Email: "+email;
        ShowNameEmail.setText(showString);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_presentacion, menu);
        return true;
    }
    public void ShowThirdActivity(View v) {
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_usuario) {
            return true;
        }

        if (R.id.action_usuario == id){
            new View.OnClickListener() {
                public void onClick(View view) {
                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                    startActivityForResult(myIntent, 0);
                }

            };
            return true;

        }



        return super.onOptionsItemSelected(item);
    }
}
