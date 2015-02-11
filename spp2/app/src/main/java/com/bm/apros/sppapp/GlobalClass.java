package com.bm.apros.sppapp;

/**
 * Created by Angel on 11/02/15.
 */
import android.app.Application;

public class GlobalClass extends Application {
    private String Nombre;
    private String Correo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
}