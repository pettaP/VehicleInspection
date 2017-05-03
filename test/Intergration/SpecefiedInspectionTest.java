/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;

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
public class SpecefiedInspectionTest {
    
    SpecefiedInspection newPart;
    
    public SpecefiedInspectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       newPart = new SpecefiedInspection ("Door", 40, "Passed", "pass");
    }
    
    @After
    public void tearDown() {
        newPart = null;
    }

    /**
     * Test of getComponentToInspect method, of class SpecefiedInspection.
     * Test not preformed since it is a simple get-method
     */
    

    /**
     * Test of getCostOfComponentToInspect method, of class SpecefiedInspection
     * If the returned value equals 40 the test is passed
     */
    @Test
    public void testGetCostOfComponentToInspect() {
        System.out.println("getCostOfComponentToInspect");
        int expResult = 40;
        int result = newPart.getCostOfComponentToInspect();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInspectionResult method, of class SpecefiedInspection.
     */
    @Test
    public void testSetInspectionResult() {
        System.out.println("setInspectionResult");
        String inspectionResult = newPart.getInspectionComment();
        System.out.println(inspectionResult);
        newPart.setInspectionResult("New result");
        String newInspectionResultAfterSet = newPart.getInspectionComment();
        System.out.println (newInspectionResultAfterSet);
        boolean result = inspectionResult.equals(newInspectionResultAfterSet); 
        assertFalse (result);
    }

    /**
     * Test of getInspectionComment method, of class SpecefiedInspection.
     * Test not preformed since it is a simple get-method
     */
    

    /**
     * Test of isInspectionPassed method, of class SpecefiedInspection.
     * Test not preformed since it is a simple get-method
     */
   

    /**
     * Test of setInspectionPassed method, of class SpecefiedInspection.
     */
    @Test
    public void testSetInspectionPassed() {
        System.out.println("setInspectionPassed");
        String isPassed = "";
        SpecefiedInspection instance = null;
        instance.setInspectionPassed(isPassed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private SpecefiedInspection SpecefiedInspection(String door, int i, String passed, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
