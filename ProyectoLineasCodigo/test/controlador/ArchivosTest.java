/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.util.Collection;
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
    public void testBuscarArchivos() {
        System.out.println("buscarArchivos");
        File carpeta = null;
        String lenguaje = "";
        Collection<File> expResult = null;
        Collection<File> result = Archivos.buscarArchivos(carpeta, lenguaje);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularLineasCodigo method, of class Archivos.
     */
    @Test
    public void testCalcularLineasCodigo() {
        System.out.println("calcularLineasCodigo");
        Archivo a = null;
        int expResult = 0;
        int result = Archivos.calcularLineasCodigo(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
