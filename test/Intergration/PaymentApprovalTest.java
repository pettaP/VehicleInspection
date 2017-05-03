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
import Controller.*;
import Intergration.*;
import Model.CreditCard;
/**
 *
 * @author Peter
 */
public class PaymentApprovalTest {
    
    public PaymentApprovalTest() {
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
     * Test of getAuth method, of class PaymentApproval.
     * If the boolean value returnd is true the test is passed
     */
    @Test
    public void testGetAuth() {
        System.out.println("getAuth");
        VehicleDataBase vdb = new VehicleDataBase();
        Printer printer = new Printer();
        Controller contrl = new Controller(vdb, printer);
        int inspcost = contrl.searchInspectionCost("abc123");
        CreditCard cc = new CreditCard(1234, "1234567890", "Tomas Andersson", 21, 331);
        PaymentApproval payApp = new PaymentApproval(cc, inspcost);
        boolean result = payApp.getAuth();
        assertTrue(result);
    }
    
}
