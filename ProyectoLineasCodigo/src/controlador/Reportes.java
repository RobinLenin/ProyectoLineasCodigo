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
public class Reportes {

    public static double kloc(int n_lineas) {

        double dividendo = 1000;
        double nkloc = 0.0;

        nkloc = n_lineas / dividendo;

        return nkloc;

    }

    public static double esfuerzo(double nkloc, String modo, double mx) {

        ArrayList<Double> valores_modo = null;
        double estimacion_esfuerzo = 0;

        valores_modo = devolverModo(modo);
        System.out.println(modo);

        if (valores_modo != null) {
            estimacion_esfuerzo = valores_modo.get(0) * Math.pow(nkloc, valores_modo.get(1));
        }

        return estimacion_esfuerzo * mx;
    }

    public static double tiempoDesarrollo(double esfuerzo, String modo) {

        ArrayList<Double> valores_modo = null;
        double tiempo_desarrollo = 0.0;

        valores_modo = devolverModo(modo);

        if (valores_modo != null) {
            tiempo_desarrollo = valores_modo.get(2) * Math.pow(esfuerzo, valores_modo.get(3));
        }

        return tiempo_desarrollo;
    }

    public static ArrayList<Double> devolverModo(String modo) {
        ArrayList<Double> valores_modo = null;
        Constantes mod = new Constantes();
        if (modo.equalsIgnoreCase("Organico")) {
            valores_modo = mod.organico();
        } else {
            if (modo.equalsIgnoreCase("Semilibre")) {
                valores_modo = mod.semilibre();
            } else {
                if (modo.equalsIgnoreCase("Rigido")) {
                    valores_modo = mod.rigido();
                } else {
                    return valores_modo;

                }
            }
        }

        return valores_modo;
    }

    public static double calcularFactorAjuste(ArrayList<Integer> atributos) {
        double factor_ajuste = 0.0;
        ArrayList<Double> fa = new ArrayList<>();

        Constantes constantes = new Constantes();

        fa = constantes.fiabilidad();
        for (int i = 0; i < fa.size(); i++) {
            if (atributos.get(0) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }

        fa = constantes.baseDatos();
        for (int i = 0; i < fa.size(); i++) {
            if (atributos.get(1) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }

        fa = constantes.complejidad();
        for (int i = 0; i < fa.size(); i++) {
            if (atributos.get(2) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.restrTiempoEjecucion();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(3) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.restMemoriaVirtual();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(4) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.volMaquinaVirtual();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(5) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.tiempoRespuesta();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(6) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.analisis();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(7) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.experiencia();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(8) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.Calidad();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(9) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.expeMaquinaVirtual();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(10) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.expeLenguaje();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(11) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.tecnicas();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(12) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        fa =  constantes.herramientas();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(13) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        
        fa =  constantes.restTiempoDesarrollo();
        for (int i = 0; i <fa.size() ; i++) {
            if (atributos.get(14) == i) {
                factor_ajuste = factor_ajuste + fa.get(i);
            }
        }
        return factor_ajuste/15;
        
    }

}
