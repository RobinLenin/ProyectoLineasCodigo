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

    public static int calcularLineasCodigo(Archivo a) {

        String lenguaje = a.getLenguaje_progamacion();

        int lineas_codigo = 0;
        File archivo = new File(a.getRuta());

        FileReader file_reader = null;

        BufferedReader buffer_reader = null;

        try {

            file_reader = new FileReader(archivo);

            buffer_reader = new BufferedReader(file_reader);

        } catch (FileNotFoundException e) {

            System.out.println("No se encontro el archivo " + archivo.getName());
        }

        try {

            String linea = "";


            while ((linea = buffer_reader.readLine()) != null) {
                
                System.out.println(linea);
            }
        } catch (IOException e) {

            e.printStackTrace();

        }

        return lineas_codigo;
    }
    
    
}
