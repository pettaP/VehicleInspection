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
import ExternalSys.*;

/**
 *
 * @author Peter
 */
public class GarageTest {
    
    public GarageTest() {
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
     * Test of Garage constructor, of class Garage.
     * If object created is an instance of Garage test is passed
     */
    @Test
    public void testGarage() {
        System.out.println("Garage");
        Garage garage = new Garage();
        boolean result = garage instanceof Garage;
        assertTrue("The types are not the same.", result);
    }

    /**
     * Test of newCustomer method, of class Garage.
     * Test is passed if door is open and que display is 1
     */
    @Test
    public void testNewCustomer() {
        System.out.println("newCustomer");
        Garage garage = new Garage();
        garage.newCustomer();
        boolean expResult = true;
        boolean result = garage.isDoorOpenAndDisplayOne();
        assertEquals ("The result are not the same", expResult, result);
    }

    /**
     * Test of closeDoor method, of class Garage.
     * Test is passed if result is fail. Hence the door is closed. This method dosent activate the que display so it is constant
     */
    @Test
    public void testCloseDoor() {
        System.out.println("closeDoor");
        Garage garage = new Garage();
        garage.closeDoor();
        boolean expResult = false;
        boolean result = garage.isDoorOpenAndDisplayOne();
        assertEquals ("The result are not the same", result, expResult);
    }
    
}
