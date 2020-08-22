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

        try {

            if (carpeta.exists() && carpeta.isDirectory()) {
                if (carpeta.listFiles().equals("")) {

                    return archivos;

                } else {
                    for (File archivo : carpeta.listFiles()) {

                        if (archivo.isFile()) {

                            string_ruta = archivo.getAbsoluteFile().toString();

                            int posicion = string_ruta.length();
                            //System.out.println(posicion);
                            //System.out.println(string_ruta);
                            String extension = string_ruta.substring(posicion - 3, posicion);
                            //System.out.println(extension);

                            if (lenguaje.equals("Proyecto PHP") && extension.equals("php")) {
                                archivos.add(archivo);
                            } else {
                                if (lenguaje.equals("Proyecto Node js") && extension.equals(".js")) {
                                    archivos.add(archivo);
                                } else {
                                    if (lenguaje.equals("Proyecto Java") && extension.equals("ava")) {
                                        archivos.add(archivo);
                                    }

                                }
                            }

                        } else {

                            String nombre = archivo.getName();

                            nombre = nombre.toLowerCase();

                            if (!nombre.equalsIgnoreCase("lib") && !nombre.equalsIgnoreCase("vendor")
                                    && !nombre.equalsIgnoreCase("framework")
                                    && !nombre.equalsIgnoreCase("librerias")) {

                                archivos.addAll(buscarArchivos(archivo, lenguaje));

                            }

                        }
                    }

                }

            }

        } catch (NullPointerException e) {
            return archivos;
        }

        return archivos;
    }

    public static int calcularLineasCodigo(Archivo a) {
        if (a != null) {
            String lenguaje = a.getLenguaje_progamacion();

            int lineas_codigo = 0;

            int lineas_no_codigo = 0;

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

                boolean comentario_largo = false;

                if (buffer_reader != null) {
                    while ((linea = buffer_reader.readLine()) != null) {

                        linea = linea.trim();

                        if (comentario_largo == false) {

                            if (linea.length() > 0) {

                                lineas_codigo++;

                            }
                        }

                        switch (lenguaje) {
                            case "Proyecto PHP":

                                if (linea.length() > 1) {

                                    if (linea.substring(0, 2).equalsIgnoreCase("/*")) {

                                        comentario_largo = true;

                                        lineas_no_codigo++;

                                    }
                                    if (linea.substring(linea.length() - 2, linea.length()).equalsIgnoreCase("*/")) {

                                        comentario_largo = false;

                                    }
                                }

                                if (comentario_largo == false) {

                                    if (linea.length() > 1) {

                                        if (linea.substring(0, 2).equalsIgnoreCase("//") || linea.substring(0, 1).equalsIgnoreCase("#")) {

                                            lineas_no_codigo++;

                                        }
                                        if (linea.equalsIgnoreCase("?>") || linea.equalsIgnoreCase("<?phps")) {

                                            lineas_no_codigo++;

                                        }
                                    }

                                    if (linea.equalsIgnoreCase("{") || linea.equalsIgnoreCase("}") || linea.replaceAll("\\s", "").equalsIgnoreCase("else{")
                                            || linea.replaceAll("\\s", "").equalsIgnoreCase("}else{") || linea.replaceAll("\\s", "").equalsIgnoreCase("try{") || linea.equalsIgnoreCase("else") || linea.equalsIgnoreCase("break;")) {

                                        lineas_no_codigo++;

                                    }
                                }

                                break;

                            case "Proyecto Java":

                                if (linea.length() > 1) {

                                    if (linea.substring(0, 2).equalsIgnoreCase("/*")) {

                                        comentario_largo = true;

                                        lineas_no_codigo++;

                                    }
                                    if (linea.substring(linea.length() - 2, linea.length()).equalsIgnoreCase("*/")) {

                                        comentario_largo = false;

                                    }
                                }

                                if (comentario_largo == false) {

                                    if (linea.length() > 1) {

                                        if (linea.substring(0, 2).equalsIgnoreCase("//")) {

                                            lineas_no_codigo++;

                                        }
                                    }

                                    if (linea.equalsIgnoreCase("{") || linea.equalsIgnoreCase("}") || linea.replaceAll("\\s", "").equalsIgnoreCase("else{")
                                            || linea.replaceAll("\\s", "").equalsIgnoreCase("}else{") || linea.replaceAll("\\s", "").equalsIgnoreCase("try{") || linea.equalsIgnoreCase("else") || linea.equalsIgnoreCase("break;")) {

                                        lineas_no_codigo++;

                                    }
                                }

                                break;

                            case "Proyecto Node":
                                if (linea.length() > 1) {

                                    if (linea.substring(0, 2).equalsIgnoreCase("/*")) {

                                        comentario_largo = true;

                                        lineas_no_codigo++;

                                    }
                                    if (linea.substring(linea.length() - 2, linea.length()).equalsIgnoreCase("*/")) {

                                        comentario_largo = false;

                                    }
                                }

                                if (comentario_largo == false) {

                                    if (linea.length() > 1) {

                                        if (linea.substring(0, 2).equalsIgnoreCase("//") || linea.substring(0, 1).equalsIgnoreCase("#")) {

                                            lineas_no_codigo++;

                                        }
                                    }

                                    if (linea.equalsIgnoreCase("{") || linea.equalsIgnoreCase("}") || linea.replaceAll("\\s", "").equalsIgnoreCase("else{")
                                            || linea.replaceAll("\\s", "").equalsIgnoreCase("}else{") || linea.replaceAll("\\s", "").equalsIgnoreCase("try{") || linea.equalsIgnoreCase("else") || linea.equalsIgnoreCase("break;")) {

                                        lineas_no_codigo++;

                                    }
                                }

                                break;
                            default:
                                lineas_no_codigo = 0;
                                break;

                        }
                        linea = "";
                    }
                } else {
                    return 0;
                }

            } catch (IOException e) {

                e.printStackTrace();

            }
            return lineas_codigo - lineas_no_codigo;
        }
        return 0;

    }

}
