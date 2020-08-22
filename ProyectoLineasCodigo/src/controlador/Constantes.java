/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author robin
 */
public class Constantes {
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo organico.
     * @return El valores costanstes del atributo organico (org) de tipo ArrayList de Double.
     */
    public ArrayList<Double> organico(){
        
        ArrayList<Double> org = new ArrayList<Double>();
        org.add(3.2);
        org.add(1.05);
        org.add(2.5);
        org.add(0.38);
        return org;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo semilibre.
     * @return El valores costanstes del atributo semilibre (sem) de tipo ArrayList de Double.
     */
    public ArrayList<Double> semilibre(){
        
        ArrayList<Double> semi = new ArrayList<Double>();
        semi.add(3.0);
        semi.add(1.12);
        semi.add(2.5);
        semi.add(0.35);
        return semi;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo rigido.
     * @return El valores costanstes del atributo rigido (rig) de tipo ArrayList de Double.
     */
    public ArrayList<Double> rigido(){
    
        ArrayList<Double> rig = new ArrayList<Double>();  
         
        rig.add(2.8);
        rig.add(1.2);
        rig.add(2.5);
        rig.add(0.32);
        return rig;    
    }
    
    //Constantes paraa factor de Ajuste
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo fiabilidad.
     * @return El valores costanstes del atributo fiabilidad (fiabilidad) de tipo ArrayList de Double.
     */
    public ArrayList<Double> fiabilidad(){
        ArrayList<Double> fiabilidad = new ArrayList<Double>();
        fiabilidad.add(0.75);
        fiabilidad.add(0.88);
        fiabilidad.add(1.0);
        fiabilidad.add(1.15);
        fiabilidad.add(1.40);
        return fiabilidad;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo base de Datos.
     * @return El valores costanstes del atributo base de Datos (baseDatos) de tipo ArrayList de Double.
     */
    public ArrayList<Double> baseDatos(){
        ArrayList<Double> base_datos = new ArrayList<Double>();
        base_datos.add(0.94);
        base_datos.add(1.0);
        base_datos.add(1.08);
        base_datos.add(1.16);
        return base_datos;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo complejidad.
     * @return El valores costanstes del atributo complejidad (complejidad) de tipo ArrayList de Double.
     */
    public ArrayList<Double> complejidad(){
        ArrayList<Double> complejidad = new ArrayList<Double>();
        complejidad.add(0.70);
        complejidad.add(0.85);
        complejidad.add(1.0);
        complejidad.add(1.15);
        complejidad.add(1.30);
        complejidad.add(1.65);
        return complejidad;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo restr. Tiempo Ejecucion.
     * @return El valores costanstes del atributo restr. Tiempo Ejecucion (restr_tiempo_ejecucion) de tipo ArrayList de Double .
     */
    public ArrayList<Double> restrTiempoEjecucion(){
        ArrayList<Double> restr_tiempo_ejecucion = new ArrayList<Double>();
        restr_tiempo_ejecucion.add(1.0);
        restr_tiempo_ejecucion.add(1.11);
        restr_tiempo_ejecucion.add(1.30);
        restr_tiempo_ejecucion.add(1.66);
        return restr_tiempo_ejecucion;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo rest. Memoria Virtual.
     * @return El valores costanstes del atributo rest. Memoria Virtual (rest_memoria_virtual) de tipo ArrayList de Double .
     */
    public ArrayList<Double> restMemoriaVirtual(){
        ArrayList<Double> rest_memoria_virtual = new ArrayList<Double>();
        rest_memoria_virtual.add(1.0);
        rest_memoria_virtual.add(1.06);
        rest_memoria_virtual.add(1.21);
        rest_memoria_virtual.add(1.56);
        return rest_memoria_virtual;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo vol. Maquina Virtual.
     * @return El valores costanstes del atributo vol. Maquina Virtual (vol_maquina_virtual) de tipo ArrayList de Double .
     */
    public ArrayList<Double> volMaquinaVirtual(){
        ArrayList<Double> vol_maquina_virtual = new ArrayList<Double>();
        vol_maquina_virtual.add(0.87);
        vol_maquina_virtual.add(1.0);
        vol_maquina_virtual.add(1.15);
        vol_maquina_virtual.add(1.30);
        return vol_maquina_virtual;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo tiempo de Respuesta.
     * @return El valores costanstes del atributo tiempo de Respuesta (tiempo_respuesta) de tipo ArrayList de Double .
     */
    public ArrayList<Double> tiempoRespuesta(){
        ArrayList<Double> tiempo_respuesta = new ArrayList<Double>();
        tiempo_respuesta.add(0.87);
        tiempo_respuesta.add(1.0);
        tiempo_respuesta.add(1.07);
        tiempo_respuesta.add(1.15);
        return tiempo_respuesta;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo análisis.
     * @return El valores costanstes del atributo análisis (analisis) de tipo ArrayList de Double .
     */
    public ArrayList<Double> analisis(){
        ArrayList<Double> analisis = new ArrayList<Double>();
        analisis.add(1.46);
        analisis.add(1.19);
        analisis.add(1.0);
        analisis.add(0.86);
        analisis.add(0.71);
        return analisis;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo experiencia.
     * @return El valores costanstes del atributo experiencia (experiencia) de tipo ArrayList de Double .
     */
    public ArrayList<Double> experiencia(){
        ArrayList<Double> experiencia = new ArrayList<Double>();
        experiencia.add(1.29);
        experiencia.add(1.13);
        experiencia.add(1.0);
        experiencia.add(0.91);
        experiencia.add(0.82);
        return experiencia;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo Calidad.
     * @return El valores costanstes del atributo Calidad (calidad) de tipo ArrayList de Double .
     */
    public ArrayList<Double> Calidad(){
        ArrayList<Double> calidad = new ArrayList<Double>();
        calidad.add(1.42);
        calidad.add(1.17);
        calidad.add(1.0);
        calidad.add(0.86);
        calidad.add(0.70);
        return calidad;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo expe Maquina Virtual.
     * @return El valores costanstes del atributo expe Maquina Virtual (expe_maquina_virtual) de tipo ArrayList de Double .
     */
    public ArrayList<Double> expeMaquinaVirtual(){
        ArrayList<Double> expe_maquina_virtual = new ArrayList<Double>();
        expe_maquina_virtual.add(1.21);
        expe_maquina_virtual.add(1.10);
        expe_maquina_virtual.add(1.0);
        expe_maquina_virtual.add(0.90);
        return expe_maquina_virtual;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo expe. Lenguaje.
     * @return El valores costanstes del atributo expe. Lenguaje (expe_lenguaje) de tipo ArrayList de Double .
     */
    public ArrayList<Double> expeLenguaje(){
        ArrayList<Double> expe_lenguaje = new ArrayList<Double>();
        expe_lenguaje.add(1.14);
        expe_lenguaje.add(1.07);
        expe_lenguaje.add(1.0);
        expe_lenguaje.add(0.95);
        return expe_lenguaje;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo tecnicas.
     * @return El valores costanstes del atributo tecnicas (tecnicas) de tipo ArrayList de Double .
     */
    public ArrayList<Double> tecnicas(){
        ArrayList<Double> tecnica = new ArrayList<Double>();
        tecnica.add(1.24);
        tecnica.add(1.10);
        tecnica.add(1.0);
        tecnica.add(0.91);
        tecnica.add(0.82);
        return tecnica;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo herramientas.
     * @return El valores costanstes del atributo herramientas (herramientas) de tipo ArrayList de Double .
     */
    public ArrayList<Double> herramientas(){
        ArrayList<Double> herramienta = new ArrayList<Double>();
        herramienta.add(1.24);
        herramienta.add(1.10);
        herramienta.add(1.0);
        herramienta.add(0.91);
        herramienta.add(0.83);
        return herramienta;
    }
    
    /**
     * Método que devuelve un Array List con valores constantes del atributo rest. Tiempo Desarrollo.
     * @return El valores costanstes del atributo rest. Tiempo Desarrollo (rest_tiempo_desarrollo) de tipo ArrayList de Double .
     */
    public ArrayList<Double> restTiempoDesarrollo(){
        ArrayList<Double> rest_tiempo_desarrollo = new ArrayList<Double>();
        rest_tiempo_desarrollo.add(1.22);
        rest_tiempo_desarrollo.add(1.08);
        rest_tiempo_desarrollo.add(1.0);
        rest_tiempo_desarrollo.add(1.04);
        rest_tiempo_desarrollo.add(1.10);
        return rest_tiempo_desarrollo;
    }
           
}
