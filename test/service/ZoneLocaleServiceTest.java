/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ZoneLocale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author khalid
 */
public class ZoneLocaleServiceTest {
    
    public ZoneLocaleServiceTest() {
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
     * Test of initZone method, of class ZoneLocaleService.
     */
//    @Test
//    public void testInitZone() {
//        System.out.println("initZone");
//        String name = "Gueliz";
//        ZoneLocaleService instance = new ZoneLocaleService();
//        int expResult = 1;
//        int result = instance.initZone(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of findZone method, of class ZoneLocaleService.
     */
    @Test
    public void testFindZone() {
        System.out.println("findZone");
        String nom = "Medina";
        ZoneLocaleService instance = new ZoneLocaleService();
        ZoneLocale result = instance.findZone(nom);
        System.out.println(result);
    }
    
}
