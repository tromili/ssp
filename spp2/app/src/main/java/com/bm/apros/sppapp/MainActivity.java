package com.bm.apros.sppapp;

    import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.btn_login);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        globalVariable.setNombre("nombre1");
        globalVariable.setCorreo("xxx@hotmail.com");

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), presentacion.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
    public void StarSecondActivity(View v) {
        Intent i = new Intent(getBaseContext(), presentacion.class);
        startActivity(i);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

        return super.onOptionsItemSelected(item);
    }


}
