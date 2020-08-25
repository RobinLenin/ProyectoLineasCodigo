/**
 * Esta clase define las pruebas corespondientes a Constantes que realiza brinda los valores para calcular la estimación de costo de proyecto.
 * @author: Johnney Bermeo
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

public class ConstantesTest {
    
    public ConstantesTest() {
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
     * Test of organico method, of class Constantes.
     */
    @Test
    public void testOrganico() {
        System.out.println("organico");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(3.2);
        expResult.add(1.05);
        expResult.add(2.5);
        expResult.add(0.38);
        ArrayList<Double> result = instance.organico();
        assertEquals(expResult, result);
    }

    /**
     * Test of semilibre method, of class Constantes.
     */
    @Test
    public void testSemilibre() {
        System.out.println("semilibre");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(3.0);
        expResult.add(1.12);
        expResult.add(2.5);
        expResult.add(0.35);
        ArrayList<Double> result = instance.semilibre();
        assertEquals(expResult, result);
    }

    /**
     * Test of rigido method, of class Constantes.
     */
    @Test
    public void testRigido() {
        System.out.println("rigido");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(2.8);
        expResult.add(1.2);
        expResult.add(2.5);
        expResult.add(0.32);
        ArrayList<Double> result = instance.rigido();
        assertEquals(expResult, result);
    }
    /**
     * Test of fiabilidad method, of class Constantes.
     */
    @Test
    public void testFiabilidad() {
        System.out.println("fiabilidad");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.75);
        expResult.add(0.88);
        expResult.add(1.0);
        expResult.add(1.15);
        expResult.add(1.40);
        ArrayList<Double> result = instance.fiabilidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of baseDatos method, of class Constantes.
     */
    @Test
    public void testBaseDatos() {
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.94);
        expResult.add(1.0);
        expResult.add(1.08);
        expResult.add(1.16);
        ArrayList<Double> result = instance.baseDatos();
        assertEquals(expResult, result);
    }

    /**
     * Test of complejidad method, of class Constantes.
     */
    @Test
    public void testComplejidad() {
        System.out.println("complejidad");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.70);
        expResult.add(0.85);
        expResult.add(1.0);
        expResult.add(1.15);
        expResult.add(1.30);
        expResult.add(1.65);
        ArrayList<Double> result = instance.complejidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of restrTiempoEjecucion method, of class Constantes.
     */
    @Test
    public void testRestrTiempoEjecucion() {
        System.out.println("restrTiempoEjecucion");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.0);
        expResult.add(1.11);
        expResult.add(1.30);
        expResult.add(1.66);
        ArrayList<Double> result = instance.restrTiempoEjecucion();
        assertEquals(expResult, result);
    }

    /**
     * Test of restMemoriaVirtual method, of class Constantes.
     */
    @Test
    public void testRestMemoriaVirtual() {
        System.out.println("restMemoriaVirtual");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.0);
        expResult.add(1.06);
        expResult.add(1.21);
        expResult.add(1.56);
        ArrayList<Double> result = instance.restMemoriaVirtual();
        assertEquals(expResult, result);
    }

    /**
     * Test of volMaquinaVirtual method, of class Constantes.
     */
    @Test
    public void testVolMaquinaVirtual() {
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.87);
        expResult.add(1.0);
        expResult.add(1.15);
        expResult.add(1.30);
        ArrayList<Double> result = instance.volMaquinaVirtual();
        assertEquals(expResult, result);
    }

    /**
     * Test of tiempoRespuesta method, of class Constantes.
     */
    @Test
    public void testTiempoRespuesta() {
        System.out.println("tiempoRespuesta");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(0.87);
        expResult.add(1.0);
        expResult.add(1.07);
        expResult.add(1.15);
        ArrayList<Double> result = instance.tiempoRespuesta();
        assertEquals(expResult, result);
    }

    /**
     * Test of analisis method, of class Constantes.
     */
    @Test
    public void testAnalisis() {
        System.out.println("analisis");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.46);
        expResult.add(1.19);
        expResult.add(1.0);
        expResult.add(0.86);
        expResult.add(0.71);
        ArrayList<Double> result = instance.analisis();
        assertEquals(expResult, result);
    }

    /**
     * Test of experiencia method, of class Constantes.
     */
    @Test
    public void testExperiencia() {
        System.out.println("experiencia");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.29);
        expResult.add(1.13);
        expResult.add(1.0);
        expResult.add(0.91);
        expResult.add(0.82);
        ArrayList<Double> result = instance.experiencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of Calidad method, of class Constantes.
     */
    @Test
    public void testCalidad() {
        System.out.println("Calidad");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.42);
        expResult.add(1.17);
        expResult.add(1.0);
        expResult.add(0.86);
        expResult.add(0.70);
        ArrayList<Double> result = instance.Calidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of expeMaquinaVirtual method, of class Constantes.
     */
    @Test
    public void testExpeMaquinaVirtual() {
        System.out.println("expeMaquinaVirtual");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.21);
        expResult.add(1.10);
        expResult.add(1.0);
        expResult.add(0.90);
        ArrayList<Double> result = instance.expeMaquinaVirtual();
        assertEquals(expResult, result);
    }

    /**
     * Test of expeLenguaje method, of class Constantes.
     */
    @Test
    public void testExpeLenguaje() {
        System.out.println("expeLenguaje");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.14);
        expResult.add(1.07);
        expResult.add(1.0);
        expResult.add(0.95);
        ArrayList<Double> result = instance.expeLenguaje();
        assertEquals(expResult, result);
    }

    /**
     * Test of tecnicas method, of class Constantes.
     */
    @Test
    public void testTecnicas() {
        System.out.println("tecnicas");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.24);
        expResult.add(1.10);
        expResult.add(1.0);
        expResult.add(0.91);
        expResult.add(0.82);
        ArrayList<Double> result = instance.tecnicas();
        assertEquals(expResult, result);
    }

    /**
     * Test of herramientas method, of class Constantes.
     */
    @Test
    public void testHerramientas() {
        System.out.println("herramientas");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.24);
        expResult.add(1.10);
        expResult.add(1.0);
        expResult.add(0.91);
        expResult.add(0.83);
        ArrayList<Double> result = instance.herramientas();
        assertEquals(expResult, result);
    }

    /**
     * Test of restTiempoDesarrollo method, of class Constantes.
     */
    @Test
    public void testRestTiempoDesarrollo() {
        System.out.println("restTiempoDesarrollo");
        Constantes instance = new Constantes();
        ArrayList<Double> expResult = new ArrayList<Double>();
        expResult.add(1.22);
        expResult.add(1.08);
        expResult.add(1.0);
        expResult.add(1.04);
        expResult.add(1.10);
        ArrayList<Double> result = instance.restTiempoDesarrollo();
        assertEquals(expResult, result);
    }
    
}
