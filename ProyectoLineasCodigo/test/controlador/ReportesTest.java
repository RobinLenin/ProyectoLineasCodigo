/**
 * Esta clase define las pruebas corespondientes a Reporte que realiza el cálculo de estimaciones para el proyecto.
 * @author: Alexandra López
 * @version: 1.0
 */
package controlador;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testKlocPositivo() {
        System.out.println("testKlocExito");
        int n_lineas = 2000;
        double expResult = 2;
        double result = Reportes.kloc(n_lineas);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testKlocCero() {
        System.out.println("kloc");
        int n_lineas = 0;
        double expResult = 0;
        double result = Reportes.kloc(n_lineas);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testKlocNegativo() {
        System.out.println("kloc");
        int n_lineas = -2000;
        double expResult = 0;
        double result = Reportes.kloc(n_lineas);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of esfuerzo method, of class Reportes.
     */
    @Test
    public void testEsfuerzoPositivo() {
        System.out.println("esfuerzo");
        double nkloc = 2.0;
        String modo = "Organico";
        double mx = 1.0;
        double expResult = 6.625695512584817;
        double result = Reportes.esfuerzo(nkloc, modo, mx);
        assertEquals(expResult, result, 6.625695512584817);
    }
    
    @Test
    public void testEsfuerzoCero() {
        System.out.println("esfuerzo");
        double nkloc = 0.0;
        String modo = "";
        double mx = 0.0;
        double expResult = 0.0;
        double result = Reportes.esfuerzo(nkloc, modo, mx);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testEsfuerzoNegativo() {
        System.out.println("esfuerzo");
        double nkloc = -2.0;
        String modo = "";
        double mx = -1.0;
        double expResult = 0.0;
        double result = Reportes.esfuerzo(nkloc, modo, mx);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of tiempoDesarrollo method, of class Reportes.
     */
    @Test
    public void testTiempoDesarrolloPositivo() {
        System.out.println("tiempoDesarrollo");
        double esfuerzo = 5.0;
        String modo = "Organico";
        double expResult = 4.608383471622163;
        double result = Reportes.tiempoDesarrollo(esfuerzo, modo);
        assertEquals(expResult, result, 4.608383471622163);
    }
    
     @Test
    public void testTiempoDesarrolloCero() {
        System.out.println("tiempoDesarrollo");
        double esfuerzo = 0.0;
        String modo = "";
        double expResult = 0.0;
        double result = Reportes.tiempoDesarrollo(esfuerzo, modo);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testTiempoDesarrolloNegativo() {
        System.out.println("tiempoDesarrollo");
        double esfuerzo = -2.0;
        String modo = "";
        double expResult = 0.0;
        double result = Reportes.tiempoDesarrollo(esfuerzo, modo);
        assertEquals(expResult, result, 0.0);
    }
    

    /**
     * Test of devolverModo method, of class Reportes.
     */
    @Test
    public void testDevolverModoNull() {
        System.out.println("devolverModo");
        String modo = "inesperado";
        ArrayList<Double> expResult = null;
        ArrayList<Double> result = Reportes.devolverModo(modo);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDevolverModoOrganico() {
        System.out.println("devolverModo");
        String modo = "Organico";
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(3.2);
        expResult.add(1.05);
        expResult.add(2.5);
        expResult.add(0.38);
        ArrayList<Double> result = Reportes.devolverModo("Organico");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDevolverModoSemilibre() {
        System.out.println("devolverModo");
        String modo = "Semilibre";
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(3.0);
        expResult.add(1.12);
        expResult.add(2.5);
        expResult.add(0.35);
        ArrayList<Double> result = Reportes.devolverModo("Semilibre");
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testDevolverModoRigido() {
        System.out.println("devolverModo");
        String modo = "Rigido";
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(2.8);
        expResult.add(1.2);
        expResult.add(2.5);
        expResult.add(0.32);
        ArrayList<Double> result = Reportes.devolverModo("Rigido");
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularFactorAjuste method, of class Reportes.
     */
    @Test
    public void testCalcularFactorAjusteMayor15() {
        System.out.println("calcularFactorAjuste");
        ArrayList<Integer> atributos = new ArrayList<Integer>();
        
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        
        double expResult = 0.0;
        double result = Reportes.calcularFactorAjuste(atributos);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalcularFactorAjusteMenor15() {
        System.out.println("calcularFactorAjuste");
        ArrayList<Integer> atributos = new ArrayList<Integer>();
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);
        
        double expResult = 0.0;
        double result = Reportes.calcularFactorAjuste(atributos);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalcularFactorAjusteIgual15() {
        System.out.println("calcularFactorAjuste");
        ArrayList<Integer> atributos = new ArrayList<Integer>();
        
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);atributos.add(1);
        atributos.add(1);atributos.add(1);atributos.add(1);
        
        double expResult = 1.0559999999999998;
        double result = Reportes.calcularFactorAjuste(atributos);
        assertEquals(expResult, result, 0);
    }
}
