/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
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
public class ReportesTest {
    
    public ReportesTest() {
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
     * Test of kloc method, of class Reportes.
     */
    @Test
    public void testKloc() {
        System.out.println("kloc");
        int n_lineas = 0;
        double expResult = 0.0;
        double result = Reportes.kloc(n_lineas);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esfuerzo method, of class Reportes.
     */
    @Test
    public void testEsfuerzo() {
        System.out.println("esfuerzo");
        double nkloc = 0.0;
        String modo = "";
        double mx = 0.0;
        double expResult = 0.0;
        double result = Reportes.esfuerzo(nkloc, modo, mx);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tiempoDesarrollo method, of class Reportes.
     */
    @Test
    public void testTiempoDesarrollo() {
        System.out.println("tiempoDesarrollo");
        double esfuerzo = 0.0;
        String modo = "";
        double expResult = 0.0;
        double result = Reportes.tiempoDesarrollo(esfuerzo, modo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverModo method, of class Reportes.
     */
    @Test
    public void testDevolverModo() {
        System.out.println("devolverModo");
        String modo = "";
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = Reportes.devolverModo(modo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularFactorAjuste method, of class Reportes.
     */
    @Test
    public void testCalcularFactorAjuste() {
        System.out.println("calcularFactorAjuste");
        ArrayList<Integer> atributos = null;
        double expResult = 0.0;
        double result = Reportes.calcularFactorAjuste(atributos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
