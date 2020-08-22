/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import modelo.Archivo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author robin
 */
public class ArchivosTest {
    
    public ArchivosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buscarArchivos method, of class Archivos.
     */
    @Test
    public void testBuscarArchivosCarpetaNull() {
        System.out.println("testBuscarArchivosCarpetaNull");
        File carpeta = null;
        String lenguaje = "Proyecto PHP";
        Set<File> archivos = new HashSet<File>();
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);
    }
    
    @Test
    public void testBuscarArchivosCarpetaVacia() {
        System.out.println("testBuscarArchivosCarpetaVacia");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/Nueva_carpeta");
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        String lenguaje = "Proyecto Java";
        Set<File> archivos = new HashSet<File>();
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);
    }
    

    
    @Test
    public void testBuscarArchivosLenguajeX() {
        System.out.println("testBuscarArchivosLenguajeX");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/NetBeansProjects/Prueba");
        String lenguaje = "Proyecto Python";
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        Set<File> archivos = new HashSet<File>();
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);     
    }
    
    @Test
    public void testBuscarArchivosLenguajeNull() {
        System.out.println("testBuscarArchivosLenguajeNull");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/NetBeansProjects/Prueba");
        String lenguaje = null;
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        Set<File> archivos = new HashSet<File>();
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);     
    }
    
    @Test
    public void testBuscarArchivosProyectoJava() {
        System.out.println("testBuscarArchivosLenguajeNull");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/NetBeansProjects/Prueba");
        String lenguaje = "Proyecto Java";
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        Set<File> archivos = new HashSet<File>();
        File archivo = new File(ruta + "/Documents/NetBeansProjects/Prueba/archivo.java");
        archivos.add(archivo);
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);     
    }
    
    @Test
    public void testBuscarArchivosProyectoPHP() {
        System.out.println("testBuscarArchivosLenguajeNull");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/NetBeansProjects/Prueba");
        String lenguaje = "Proyecto PHP";
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        Set<File> archivos = new HashSet<File>();
        File archivo = new File(ruta + "/Documents/NetBeansProjects/Prueba/archivo.php");
        archivos.add(archivo);
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        System.out.println(result);
        System.out.println(archivos);
        assertEquals(archivos, result);      
    }
    
    @Test
    public void testBuscarArchivosProyectoNode() {
        System.out.println("testBuscarArchivosLenguajeNull");
        String ruta = System.getProperty("user.home");
        File carpeta = new File(ruta + "/Documents/NetBeansProjects/Prueba");
        String lenguaje = "Proyecto Node js";
        System.out.println(carpeta.isDirectory());
        System.out.println(carpeta.exists());
        Set<File> archivos = new HashSet<File>();
        File archivo = new File(ruta + "/Documents/NetBeansProjects/Prueba/archivo.js");
        archivos.add(archivo);
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(archivos, result);     
    }
    @Test
    public void testBuscarArchivosNull() {
        System.out.println("testBuscarArchivosNull");
        File carpeta = null;
        String lenguaje = null;
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(0, result.size());
    }
    

    /**
     * Test of calcularLineasCodigo method, of class Archivos.
     */
    @Test
    public void testCalcularLineasCodigoNull() {
        System.out.println("calcularLineasCodigo");
        Archivo a = null;
        int result = Archivos.calcularLineasCodigo(a);
        assertEquals(0, result);
    }
    
    @Test
    public void testCalcularLineasCodigoExito() {
        System.out.println("calcularLineasCodigo");
        Archivo a = null;
        int result = Archivos.calcularLineasCodigo(a);
        assertEquals(0, result);
    }
    
}
