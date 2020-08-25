/**
 * Esta clase define el modelo de Archivo para el proyecto.
 * @author: Robin Cordova
 * @version: 1.0
 */
package modelo;

import java.util.ArrayList;

public class Archivo {
    
   
    private String nombre;
    private String ruta;
    private String lenguaje_progamacion;
    private int numero_lineas;

     /**
     * Método que devuelve el nombre del archivo.
     * @return El nombre del archivo (nombre) de tipo String.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que permite modificar el nombre del archivo.
     * @param nombre  El parámetro nombre define el nuevo nombre que tendrá el archivo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la ruta del archivo.
     * @return La ruta del archivo (ruta) de tipo String.
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Método que permite modificar la ruta del archivo.
     * @param ruta  El parámetro ruta define la nueva ruta que tendrá el archivo.
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    /**
     * Método que devuelve el tipo de lenguaje de programación del archivo.
     * @return El lenguaje de programación con que está escrito el archivo (lenguaje_programacion) de tipo String.
     */
    public String getLenguaje_progamacion() {
        return lenguaje_progamacion;
    }

    /**
     * Método que permite modificar el tipo de lenguaje de programación del archivo.
     * @param lenguaje_progamacion  El parámetro lenguaje_progamacion define el nuevo tipo de lenguaje que tendrá el archivo.
     */
    public void setLenguaje_progamacion(String lenguaje_progamacion) {
        this.lenguaje_progamacion = lenguaje_progamacion;
    }

    /**
     * Método que devuelve el número de lineas del archivo.
     * @return El número de líneas que contiene el archivo (numero_lineas) de tipo entero.
     */
    public int getNumero_lineas() {
        return numero_lineas;
    }

    /**
     * Método que permite modificar el número de líneas del archivo.
     * @param numero_lineas   El parámetro numero_lineas define el número de líneas que tendrá el archivo.
     */
    public void setNumero_lineas(int numero_lineas) {
        this.numero_lineas = numero_lineas;
    }
    
}
