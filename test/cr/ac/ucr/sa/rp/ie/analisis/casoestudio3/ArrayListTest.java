/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.sa.rp.ie.analisis.casoestudio3;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grupo 6
 */
public class ArrayListTest {
    
    public ArrayListTest() {
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
     * Test of getObjetos method, of class ArrayList.
     */
    @Test
    public void testGetObjetos() {
        System.out.println("getObjetos");
        ArrayList instance = new ArrayList();
        GenericObject[] expResult = null;
        GenericObject[] result = instance.getObjetos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetos method, of class ArrayList.
     */
    @Test
    public void testSetObjetos() {
        System.out.println("setObjetos");
        GenericObject[] objetos = null;
        ArrayList instance = new ArrayList();
        instance.setObjetos(objetos);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class ArrayList.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        ArrayList instance = new ArrayList();
        boolean expResult = false;
        GenericObject<String> ob1 = new GenericObject<String>();
        ob1.setObject("prueba1");
        GenericObject<Integer> ob2 = new GenericObject<Integer>();
        ob2.setObject(5);
        GenericObject<Integer> ob3 = new GenericObject<Integer>();
        ob3.setObject(15);
        instance.setObjetos(new GenericObject[]{ob1, ob2, ob3});
        boolean result = instance.hasNext();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class ArrayList.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ArrayList instance = new ArrayList();
        GenericObject expResult = null;
        GenericObject<String> ob1 = new GenericObject<String>();
        ob1.setObject("prueba1");
        GenericObject<Integer> ob2 = new GenericObject<Integer>();
        ob2.setObject(5);
        GenericObject<Integer> ob3 = new GenericObject<Integer>();
        ob3.setObject(15);
        instance.setObjetos(new GenericObject[]{ob1, ob2, ob3});
        GenericObject result = instance.next();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ArrayList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        
        ArrayList instance = new ArrayList();
        GenericObject<String> ob1 = new GenericObject<String>();
        ob1.setObject("prueba1");
        GenericObject<Integer> ob2 = new GenericObject<Integer>();
        ob2.setObject(5);
        GenericObject<Integer> ob3 = new GenericObject<Integer>();
        ob3.setObject(15);
        instance.setObjetos(new GenericObject[]{ob1, ob2, ob3});
        GenericObject result = instance.next();
        instance.remove(ob2);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class ArrayList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ArrayList instance = new ArrayList();
        Iterator expResult = null;
        GenericObject<String> ob1 = new GenericObject<String>();
        ob1.setObject("prueba1");
        GenericObject<Integer> ob2 = new GenericObject<Integer>();
        ob2.setObject(5);
        GenericObject<Integer> ob3 = new GenericObject<Integer>();
        ob3.setObject(15);
        instance.setObjetos(new GenericObject[]{ob1, ob2, ob3});
        Iterator result = instance.iterator();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ArrayList.
     */
    
    
}
