/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class Archivo {
    
   
    private String nombre;
    private String ruta;
    private String lenguaje_progamacion;
    private int numero_lineas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getLenguaje_progamacion() {
        return lenguaje_progamacion;
    }

    public void setLenguaje_progamacion(String lenguaje_progamacion) {
        this.lenguaje_progamacion = lenguaje_progamacion;
    }

    public int getNumero_lineas() {
        return numero_lineas;
    }

    public void setNumero_lineas(int numero_lineas) {
        this.numero_lineas = numero_lineas;
    }
    
}
