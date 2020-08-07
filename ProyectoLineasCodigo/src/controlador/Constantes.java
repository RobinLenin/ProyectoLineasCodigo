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
        org.add(2.4);
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
           
}
