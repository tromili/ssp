package com.example.hanjelito.appbm;

import android.app.Application;

/**
 * Created by hanjelito on 16/02/2015.
 */
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
