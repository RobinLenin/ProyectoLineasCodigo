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
    
    //Constantes del modo de métrica

    public ArrayList<Double> organico(){
        
        ArrayList<Double> org = new ArrayList<Double>();
        org.add(3.2);
        org.add(1.05);
        org.add(2.5);
        org.add(0.38);
        return org;
    }
    
    public ArrayList<Double> semilibre(){
        
        ArrayList<Double> semi = new ArrayList<Double>();
        semi.add(3.0);
        semi.add(1.12);
        semi.add(2.5);
        semi.add(0.35);
        return semi;
    }
    
    public ArrayList<Double> rigido(){
    
        ArrayList<Double> rig = new ArrayList<Double>();  
         
        rig.add(2.8);
        rig.add(1.2);
        rig.add(2.5);
        rig.add(0.32);
        return rig;    
    }
    
    //Constantes paraa factor de Ajuste
    
    
    public ArrayList<Double> fiabilidad(){
        ArrayList<Double> fiabilidad = new ArrayList<Double>();
        fiabilidad.add(0.75);
        fiabilidad.add(0.88);
        fiabilidad.add(1.0);
        fiabilidad.add(1.15);
        fiabilidad.add(1.40);
        return fiabilidad;
    }
    
    public ArrayList<Double> baseDatos(){
        ArrayList<Double> base_datos = new ArrayList<Double>();
        base_datos.add(0.94);
        base_datos.add(1.0);
        base_datos.add(1.08);
        base_datos.add(1.16);
        return base_datos;
    }
    
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
    
    public ArrayList<Double> restrTiempoEjecucion(){
        ArrayList<Double> restr_tiempo_ejecucion = new ArrayList<Double>();
        restr_tiempo_ejecucion.add(1.0);
        restr_tiempo_ejecucion.add(1.11);
        restr_tiempo_ejecucion.add(1.30);
        restr_tiempo_ejecucion.add(1.66);
        return restr_tiempo_ejecucion;
    }
    
    public ArrayList<Double> restMemoriaVirtual(){
        ArrayList<Double> rest_memoria_virtual = new ArrayList<Double>();
        rest_memoria_virtual.add(1.0);
        rest_memoria_virtual.add(1.06);
        rest_memoria_virtual.add(1.21);
        rest_memoria_virtual.add(1.56);
        return rest_memoria_virtual;
    }
    
    public ArrayList<Double> volMaquinaVirtual(){
        ArrayList<Double> vol_maquina_virtual = new ArrayList<Double>();
        vol_maquina_virtual.add(0.87);
        vol_maquina_virtual.add(1.0);
        vol_maquina_virtual.add(1.15);
        vol_maquina_virtual.add(1.30);
        return vol_maquina_virtual;
    }
    
    public ArrayList<Double> tiempoRespuesta(){
        ArrayList<Double> tiempo_respuesta = new ArrayList<Double>();
        tiempo_respuesta.add(0.87);
        tiempo_respuesta.add(1.0);
        tiempo_respuesta.add(1.07);
        tiempo_respuesta.add(1.15);
        return tiempo_respuesta;
    }
    
    public ArrayList<Double> analisis(){
        ArrayList<Double> analisis = new ArrayList<Double>();
        analisis.add(1.46);
        analisis.add(1.19);
        analisis.add(1.0);
        analisis.add(0.86);
        analisis.add(0.71);
        return analisis;
    }
    
    public ArrayList<Double> experiencia(){
        ArrayList<Double> experiencia = new ArrayList<Double>();
        experiencia.add(1.29);
        experiencia.add(1.13);
        experiencia.add(1.0);
        experiencia.add(0.91);
        experiencia.add(0.82);
        return experiencia;
    }
    
    public ArrayList<Double> Calidad(){
        ArrayList<Double> calidad = new ArrayList<Double>();
        calidad.add(1.42);
        calidad.add(1.17);
        calidad.add(1.0);
        calidad.add(0.86);
        calidad.add(0.70);
        return calidad;
    }
    
    public ArrayList<Double> expeMaquinaVirtual(){
        ArrayList<Double> expe_maquina_virtual = new ArrayList<Double>();
        expe_maquina_virtual.add(1.21);
        expe_maquina_virtual.add(1.10);
        expe_maquina_virtual.add(1.0);
        expe_maquina_virtual.add(0.90);
        return expe_maquina_virtual;
    }
    
    public ArrayList<Double> expeLenguaje(){
        ArrayList<Double> expe_lenguaje = new ArrayList<Double>();
        expe_lenguaje.add(1.14);
        expe_lenguaje.add(1.07);
        expe_lenguaje.add(1.0);
        expe_lenguaje.add(0.95);
        return expe_lenguaje;
    }
    
    public ArrayList<Double> tecnicas(){
        ArrayList<Double> tecnica = new ArrayList<Double>();
        tecnica.add(1.24);
        tecnica.add(1.10);
        tecnica.add(1.0);
        tecnica.add(0.91);
        tecnica.add(0.82);
        return tecnica;
    }
    
    public ArrayList<Double> herramientas(){
        ArrayList<Double> herramienta = new ArrayList<Double>();
        herramienta.add(1.24);
        herramienta.add(1.10);
        herramienta.add(1.0);
        herramienta.add(0.91);
        herramienta.add(0.83);
        return herramienta;
    }
    
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
