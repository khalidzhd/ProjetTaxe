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
public class LocalConstructionServiceTest {
    
    public LocalConstructionServiceTest() {
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
     * Test of creeLocal method, of class LocalConstructionService.
     */
    @Test
    public void testCreeLocal() {
        System.out.println("creeLocal");
        String id = "LL1";
        String nomSecteur = "Jemaa-el-Fna";
        String nomZone = "Medina";
        String nomCategorie = "construction";
        LocalConstructionService instance = new LocalConstructionService();
        int result = instance.creeLocal(id, nomSecteur, nomZone, nomCategorie);
        System.out.println(result);
    }
    
}
