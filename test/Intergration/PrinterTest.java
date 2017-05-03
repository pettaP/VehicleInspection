/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intergration;

import Controller.Controller;
import Model.CreditCard;
import Model.PaymentByCard;
import Model.Receipt;
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
public class PrinterTest {
    
    VehicleDataBase     vdb;
    Printer             printer;
    Controller          contrl;
    int                 inspectionCost;
    PaymentByCard       pbc;
    CreditCard          cc;
    Receipt             receipt;
    
    public PrinterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.vdb = new VehicleDataBase();
        this.printer = new Printer();
        this.contrl = new Controller(vdb, printer);
        this.inspectionCost = contrl.searchInspectionCost("abc123");
        this.cc = new CreditCard(1234, "1234567890", "Tomas Andersson", 21, 331);
        this.pbc = new PaymentByCard(this.cc, this.inspectionCost);
        this.receipt = new Receipt();
    }
    
    @After
    public void tearDown() {
        this.vdb = null;
        this.printer = null;
        this.contrl = null;
        this.inspectionCost = 0;
        this.cc = null;
        this.pbc = null;
        this.receipt = null;
    }

    /**
     * Test of printCustomerReceipt method, of class Printer.
     * If the string modified by method equals expResult test is passed
     */
    @Test
    public void testPrintCustomerReceipt() {
        System.out.println("printCustomerReceipt");
        receipt.makeReceipt(pbc);
        printer.printCustomerReceipt(receipt);
        String expResult = "Thank you, welcome back";
        String result = printer.getPrinterStatus();
        assertEquals (expResult, result);
    }

    /**
     * Test of printResults method, of class Printer.
     */
    @Test
    public void testPrintResults() {
        System.out.println("printResults");
        SpecefiedInspection[] currentResults = vdb.getInspectionList("abc123");
        printer.printResults(currentResults);
        String expResult = "ResultsPrinted";
        String result = printer.getPrinterStatus();
        assertEquals (expResult, result);
    }

    /**
     * Test of getPrinterStatus method, of class Printer.
     * Not preformed since it is a get-method
     */
    
    }
