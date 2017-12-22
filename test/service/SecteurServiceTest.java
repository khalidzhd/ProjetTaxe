/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Secteur;
import bean.ZoneLocale;
import java.util.List;
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
public class SecteurServiceTest {
    
    public SecteurServiceTest() {
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
     * Test of initSecteur method, of class SecteurService.
     */
    @Test
    public void testInitSecteur() {
        System.out.println("initSecteur");
        String nom = "Jemaa-el-Fna ";
        int montant = 100;
        ZoneLocale zone = new ZoneLocale();
        SecteurService instance = new SecteurService();
        int expResult = 1;
        int result = instance.initSecteur(nom, montant, zone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Test of findByZone method, of class SecteurService.
//     */
//    @Test
//    public void testFindByZone() {
//        System.out.println("findByZone");
//        Long idZone = null;
//        SecteurService instance = new SecteurService();
//        List<Secteur> expResult = null;
//        List<Secteur> result = instance.findByZone(idZone);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
