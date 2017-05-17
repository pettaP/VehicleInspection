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
import Observer.InspectionObserver;
/**
 *
 * @author Peter
 */
public class PaymentApprovalTest {
    InspectionObserver  obs;
    
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
        obs = new InspectionObserver() {
            @Override
            public void stateHasChanged(boolean finalIns) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAuth method, of class PaymentApproval.
     * If the boolean value returnd is true the test is passed
     */
    @Test
    public void testGetAuth() throws DataBaseAccesException {
        System.out.println("getAuth");
        VehicleDataBaseHandeler vdb = new VehicleDataBaseHandeler();
        Printer printer = new Printer();
        Controller contrl = new Controller(vdb, printer, obs);
        int inspcost = contrl.searchInspectionCost("abc123");
        CreditCard cc = new CreditCard(1234, "1234567890", "Tomas Andersson", 21, 331);
        PaymentApproval payApp = new PaymentApproval(cc, inspcost);
        boolean result = payApp.getAuth();
        assertTrue(result);
    }
    
}
