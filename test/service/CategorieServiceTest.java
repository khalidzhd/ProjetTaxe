/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
public class CategorieServiceTest {
    
    public CategorieServiceTest() {
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
     * Test of initCategorie method, of class CategorieService.
     */
    @Test
    public void testInitCategorie() {
        System.out.println("initCategorie");
        int m = 20;
        String nom = "construction  ";
        CategorieService instance = new CategorieService();
        int expResult = 1;
        int result = instance.initCategorie(m, nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
