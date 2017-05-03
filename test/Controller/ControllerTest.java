/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of startInspection method, of class Controller.
     */
    @Test
    public void testStartInspection() {
        System.out.println("startInspection");
        Controller instance = new Controller();
        instance.startInspection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeDoor method, of class Controller.
     */
    @Test
    public void testCloseDoor() {
        System.out.println("closeDoor");
        Controller instance = new Controller();
        instance.closeDoor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchInspectionCost method, of class Controller.
     */
    @Test
    public void testSearchInspectionCost() {
        System.out.println("searchInspectionCost");
        String regNum = "";
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.searchInspectionCost(regNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payCard method, of class Controller.
     */
    @Test
    public void testPayCard() {
        System.out.println("payCard");
        int pin = 0;
        String cardNumber = "";
        String cardHolder = "";
        int expiryDate = 0;
        int cvc = 0;
        Controller instance = new Controller();
        instance.payCard(pin, cardNumber, cardHolder, expiryDate, cvc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextSpecefiedInspection method, of class Controller.
     */
    @Test
    public void testGetNextSpecefiedInspection() {
        System.out.println("getNextSpecefiedInspection");
        String isCurrentInspectionPassed = "";
        String currentInspectionResults = "";
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.getNextSpecefiedInspection(isCurrentInspectionPassed, currentInspectionResults);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInspectionResults method, of class Controller.
     */
    @Test
    public void testPrintInspectionResults() {
        System.out.println("printInspectionResults");
        Controller instance = new Controller();
        instance.printInspectionResults();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
