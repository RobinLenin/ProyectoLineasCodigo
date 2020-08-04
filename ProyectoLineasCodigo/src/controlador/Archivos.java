/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import modelo.Archivo;

/**
 *
 * @author robin
 */
public class Archivos {

    public static Collection<File> buscarArchivos(File carpeta, String lenguaje) {

        String string_ruta = "";

        Set<File> archivos = new HashSet<File>();

        if (carpeta.exists()) {
            if (carpeta.listFiles().equals("")) {

                return archivos;

            } else {
                for (File archivo : carpeta.listFiles()) {

                    if (archivo.isFile()) {

                        string_ruta = archivo.getAbsoluteFile().toString();

                        int posicion = string_ruta.length();
                        System.out.println(posicion);
                        System.out.println(string_ruta);
                        String extension = string_ruta.substring(posicion - 3, posicion);
                        System.out.println(extension);

                        archivos.add(archivo);

                    } else {

                        archivos.addAll(buscarArchivos(archivo, lenguaje));

                    }
                }

            }

        }

        return archivos;
    }

}
