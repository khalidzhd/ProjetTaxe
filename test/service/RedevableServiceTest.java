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
public class RedevableServiceTest {
    
    public RedevableServiceTest() {
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
     * Test of creeRedevable method, of class RedevableService.
     */
    @Test
    public void testCreeRedevable() {
        System.out.println("creeRedevable");
        String id = "A1";
        String nom = "mensour";
        String prenom = "ali";
        String cin = "1234";
        int age = 20;
        RedevableService instance = new RedevableService();
        int expResult = 1;
        int result = instance.creeRedevable(id, nom, prenom, cin, age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
